public class Boss extends Actor
{
    public void act()
    {
        setLocation(getX() - 1, getY());
        if (getX() < 0) {
            setLocation(600, Greenfoot.getRandomNumber(400));
        }
    }
}
