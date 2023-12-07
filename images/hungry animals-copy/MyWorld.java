import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world is where my bee lives
 * 
 * @author Jaden Lee
 * @version 2023-12-06
 */
public class MyWorld extends World
{

    public int score = 0;
    Label scoreLabel;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        //Create the bee object
        bee bee = new bee();
        addObject(bee, 300, 300);
        //create a label
        Label scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        createApple();
        createSkull();
    }
    /**
     * End the game and draw "GameOver"
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    /**
     * Create a new apple at random location at top of screen
     */
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    public void createSkull()
    {
        Skull skull = new skull();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(skull, x, y);
    }
}
