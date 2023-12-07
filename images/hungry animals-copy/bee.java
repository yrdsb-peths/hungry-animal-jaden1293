import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bee here.
 * a small bee
 * @author Jaden Lee
 * @version 2023-12-06
 */
public class bee extends Actor
{
    GreenfootSound beeSound = new GreenfootSound("bees.mp3");
    GreenfootSound deathSound = new GreenfootSound("skull.mp3");
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        // remove apple if bee eats it
        eat();
    }
    /**
     * Eat the apple and spawn new apple if an apple is eaten
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            beeSound.play();
        }
    }
    public void kill()
    {
        if(isTouching(skull.class))
        {
            removeTouching(bee.class);
            MyWorld world = (MyWorld) getWorld();
            deathSound.play();
            world.gameOver();
        }
    }
}
