public class MyWorld extends World
{
    private GreenfootSound bgm;
    private GreenfootSound bossBgm;
    private boolean bossBattleStarted = false;

    public MyWorld()
    {
        super(600, 400, 1);
        bgm = new GreenfootSound("normal_bgm.mp3");
        bossBgm = new GreenfootSound("boss_bgm.mp3");

        addObject(new Player(), 300, 200);

        for (int i = 0; i < 5; i++) {
            addObject(new Enemy(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }

        for (int i = 2; i < 4; i++) {
            addObject(new WrongEnemy(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
    }

    public void started()
    {
        bgm.playLoop();
    }

    public void stopped()
    {
        bgm.stop();
        bossBgm.stop();
    }

    public void act()
    {
        if (!bossBattleStarted && getObjects(Enemy.class).isEmpty()) {
            startBossBattle();
        }
    }

    private void startBossBattle()
    {
        bossBattleStarted = true;
        bgm.stop();
        bossBgm.playLoop();
        addObject(new Boss(), 550, Greenfoot.getRandomNumber(400));
    }
}
