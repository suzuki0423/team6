public class Player extends Actor
{
    private int collisionCount = 0;

    public void act()
    {
        movePlayer();
        checkCollision();
    }

    private void movePlayer()
    {
        if (Greenfoot.isKeyDown("left")) setLocation(getX() - 5, getY());
        if (Greenfoot.isKeyDown("right")) setLocation(getX() + 5, getY());
        if (Greenfoot.isKeyDown("up")) setLocation(getX(), getY() - 5);
        if (Greenfoot.isKeyDown("down")) setLocation(getX(), getY() + 5);
    }

    private void checkCollision()
    {
        if (isTouching(Enemy.class)) {
            collisionCount++;
            Greenfoot.playSound("collision_sound.mp3");

            if (collisionCount % 5 == 0) {
                Greenfoot.playSound("milestone_sound.mp3");
            }
            removeTouching(Enemy.class);
        }

        if (isTouching(WrongEnemy.class)) {
            Greenfoot.playSound("wrong_sound.mp3");
            removeTouching(WrongEnemy.class);
        }
    }
}
