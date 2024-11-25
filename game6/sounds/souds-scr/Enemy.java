public class Enemy extends Actor
{
    public void act()
    {
        setLocation(getX() - 2, getY());
        if (getX() < 0) {
            setLocation(600, Greenfoot.getRandomNumber(400));
        }
    }
}
