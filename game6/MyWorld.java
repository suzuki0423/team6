
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 450, 1); 
        addObject(new Alivel(),100,100);
        addObject(new ENEMY(),1000,100);
        addObject(new ENEMY(),1000,200);
        addObject(new ENEMY(),1000,300);
        

    } 
    }
    
    
