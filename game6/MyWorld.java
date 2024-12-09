
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import greenfoot.*;  // Greenfootのライブラリをインポート

public class MyWorld extends World
{
    private ENEMY enemy1;
    private ENEMY enemy2;
    private ENEMY enemy3;
    private Alivel alivel;
    
    public MyWorld()
    {    
        // ワールドの初期化
        super(850, 450, 1); 
        
        // 初期位置にENEMYを追加（右端に配置）
        enemy1 = new ENEMY();
        enemy2 = new ENEMY();
        enemy3 = new ENEMY();
        alivel = new Alivel();
        
        addObject(enemy1, 850, 100);  // 右端に配置
        addObject(enemy2, 850, 200);  // 右端に配置
        addObject(enemy3, 850, 300);  // 右端に配置
        
        addObject(alivel, 100, 100);
        

    }

    public void act()
    {
        // ワールドの動作がここで進行する
    }
}



    
    
