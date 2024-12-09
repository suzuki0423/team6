
/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;  // Greenfootのライブラリをインポート

public class ENEMY extends Actor
{


    public void act()
    {
        move(-2);  // 左に移動する

        // 左端に到達した場合
        if (isAtEdge())
        {
            getWorld().removeObject(this);  // 画面端に到達して消失

        }
    }

    
}




