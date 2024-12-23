import greenfoot.*;  // Greenfootのライブラリをインポート

public class MyWorld extends World
{
    private Alivel alivel;
    private static long start_ = 0;
    private long lastSpawnTime = 0;
    private int score = 0;
    private boolean firstSpawn = true;

    public static void start() {
        start_ = System.nanoTime();
    }

    public static long secondTime() {
        return (System.nanoTime() - start_) / 1000000000;
    }

    public MyWorld()
    {    
        super(850, 450, 1); 
        
        alivel = new Alivel();
        addObject(alivel, 100, 100);
        
        lastSpawnTime = secondTime();
        showText("Score: " + score, 50, 20);
    }
    
    public void increaseScore(int amount)
    {
        score += amount;
        showText("Score: " + score, 50, 20);
    }
    
    public int getScore()
    {
        return score;
    }
    
    public void act()
    {
        if (secondTime() - lastSpawnTime >= 10) {
            if (firstSpawn) {
                // 最初のスポーン、スコア10, 15, 20
                ENEMY enemy1 = new ENEMY(10);
                ENEMY enemy2 = new ENEMY(15);
                ENEMY enemy3 = new ENEMY(20);

                // 敵をワールドに追加
                addObject(enemy1, 850, 100);
                addObject(enemy2, 850, 200);
                addObject(enemy3, 850, 300);

                // スコアテキストを表示
                enemy1.spawnScoreText();
                enemy2.spawnScoreText();
                enemy3.spawnScoreText();

                // 最初のスポーンフラグをfalseに設定
                firstSpawn = false;
            } else {
                // プレイヤーのスコアに応じて敵のスコアを設定
                int playerScore = getScore();
                ENEMY enemy1 = new ENEMY(playerScore - 5);
                ENEMY enemy2 = new ENEMY(playerScore);
                ENEMY enemy3 = new ENEMY(playerScore + 5);

                // 敵をワールドに追加
                addObject(enemy1, 850, 100);
                addObject(enemy2, 850, 200);
                addObject(enemy3, 850, 300);

                // スコアテキストを表示
                enemy1.spawnScoreText();
                enemy2.spawnScoreText();
                enemy3.spawnScoreText();
            }

            lastSpawnTime = secondTime();
        }
    }
}
