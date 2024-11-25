import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alivel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alivel extends Actor
{
    /**
     * Act - do whatever the Alivel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(100,100);
       
        
        int x = getX();
        int y = getY();
        
        if( Greenfoot.isKeyDown( "up" ) ){
                setLocation( x,y-5 );
            }
        if( Greenfoot.isKeyDown( "down" ) ){
            setLocation( x,y+5 );
            } 
        Actor enemy =getOneIntersectingObject(ENEMY.class);
        if(enemy != null){
            getWorld().removeObject(enemy);
        }
        
    }
    
}
