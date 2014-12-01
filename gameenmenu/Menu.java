import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        super(600, 400, 1);
        addObject(new button1(),530,65);
        addObject(new button2(), 420,180);
        addObject(new button3(), 320,80);
        addObject(new button4(), 240,125);
    }
    
   
}
    

