import greenfoot.*;  // Greenfootのライブラリをインポート

public class Alivel extends Actor
{
    /**
     * Act - do whatever the Alivel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // アクターの画像を60x60にスケール
        getImage().scale(60, 60);
       
        int x = getX();
        int y = getY();
        
        // 上矢印キーで上移動、下矢印キーで下移動
        if (Greenfoot.isKeyDown("up")) {
            setLocation(x, y - 5);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(x, y + 5);
        } 

        // ENEMYクラスのオブジェクトと衝突した場合
        Actor enemy = getOneIntersectingObject(ENEMY.class);
        if (enemy != null) {
            // 衝突した敵のスコア値を取得
            ENEMY theEnemy = (ENEMY) enemy;
            int enemyValue = theEnemy.getValue();
            
            // スコアを増加
            MyWorld world = (MyWorld) getWorld();  // 現在のワールドを取得
            world.increaseScore(enemyValue);  // 衝突した敵のスコア値分を増加

            // 衝突したエネミーをワールドから削除
            getWorld().removeObject(enemy);
            
            // 衝突したエネミーのスコアテキストも削除
            Actor scoreText = getOneIntersectingObject(TextActor.class);
            if (scoreText != null) {
                getWorld().removeObject(scoreText);  // スコアテキストを削除
            }
        }
    }
}
