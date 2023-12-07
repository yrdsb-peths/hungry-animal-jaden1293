import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skull here.
 * 
 * @author Jaden Lee 
 * @version 2023-12-07
 */
public class skull extends Actor
{
    /**
     * Act - do whatever the skull wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x = getX();
    int y = getY() + 1;
    setLocation(x, y);
        
    // Remove skull and draw game over when player touches skull
    MyWorld world = (MyWorld) getWorld();
    if(getY() >= world.getHeight())
    {
        world.createSkull();
        world.removeObject(this);
    }
    
}
