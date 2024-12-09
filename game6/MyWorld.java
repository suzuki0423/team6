import greenfoot.*;  // Greenfootのライブラリをインポート

public class MyWorld extends World
{
    private ENEMY enemy1;
    private ENEMY enemy2;
    private ENEMY enemy3;
    private Alivel alivel;
    private static long start_ = 0;
    private long lastSpawnTime = 0;  // Time when enemies were last spawned

    // Start the timer
    public static void start() {
        start_ = System.nanoTime();
    }

    // Get the elapsed time in seconds
    public static long secondTime() {
        return (System.nanoTime() - start_) / 1000000000;
    }

    public MyWorld()
    {    
        // Initialize the world with dimensions
        super(850, 450, 1); 
        
        // Create the objects
        enemy1 = new ENEMY();
        enemy2 = new ENEMY();
        enemy3 = new ENEMY();
        alivel = new Alivel();
        
        // Add the Alivel actor at a specific location
        addObject(alivel, 100, 100);

        // Record the initial time
        lastSpawnTime = secondTime();
    }

    public void act()
    {
        // Check if 10 seconds have passed
        if (secondTime() - lastSpawnTime >= 10) {
            // Add enemies to the world at the right edge
            addObject(enemy1, 850, 100);
            addObject(enemy2, 850, 200);
            addObject(enemy3, 850, 300);
            
            // Update the last spawn time
            lastSpawnTime = secondTime();
        }
    }
}
