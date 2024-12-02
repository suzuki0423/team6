import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;  // Greenfootのライブラリをインポート

public class ENEMY extends Actor
{
    private int timer = 0; // タイマー
    private int disappearCount = 0; // 消失カウント

    public void act()
    {
        move(-2);  // 左に移動する

        // 左端に到達した場合
        if (isAtEdge())
        {
            disappearCount++;  // 消失回数をカウント

            if (disappearCount == 1) {
                getWorld().removeObject(this);  // 画面端に到達して消失
            }
            else if (disappearCount == 2) {
                waitForTimeAndReappear();  // 10秒後に右端に再表示
            }
        }
    }

    // 10秒後に右端に再表示
    private void waitForTimeAndReappear()
    {
        timer++; // タイマーを進める

        // 10秒（600フレーム）経過したら右端に再表示
        if (timer >= 600)
        {
            resetPosition(); // 右端に戻す
            timer = 0;  // タイマーをリセット
            disappearCount = 0;  // カウントをリセット
        }
    }

    // 右端に表示する位置を設定
    private void resetPosition()
    {
        setLocation(getWorld().getWidth() - 1, Greenfoot.getRandomNumber(getWorld().getHeight()));  // 右端に配置し、ランダムなY座標に設定
    }
}




