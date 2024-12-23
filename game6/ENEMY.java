import greenfoot.*;  // Greenfootのライブラリをインポート

public class ENEMY extends Actor
{
    private int value; // 各敵のスコア値

    // コンストラクタでスコア値を設定
    public ENEMY(int value)
    {
        this.value = value;
    }

    public int getValue()
    {
        return value; // スコア値を返す
    }

    public void act()
    {
        move(-2);  // 左に移動する

        // 左端に到達した場合
        if (isAtEdge())
        {
            getWorld().removeObject(this);  // 画面端に到達して消失
        }
    }
    
    public void spawnScoreText()
    {
        // 敵のスコアを表示するTextActorを作成し、敵と同じ位置に表示
        TextActor scoreText = new TextActor("Score: " + value);
        getWorld().addObject(scoreText, getX(), getY() - 20);  // 敵の上に表示
    }
}
