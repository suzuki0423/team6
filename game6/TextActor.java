import greenfoot.*;  // Greenfootのライブラリをインポート

public class TextActor extends Actor
{
    private String text;

    // コンストラクタで表示するテキストを設定
    public TextActor(String text)
    {
        this.text = text;
        setImage(new GreenfootImage(text, 24, Color.WHITE, new Color(0, 0, 0, 0)));  // 白色でテキストを表示
    }

    public void act()
    {
        // テキストを左に流す
        setLocation(getX() - 2, getY());

        // 画面外に出たら削除
        if (getX() <= 0) {
            getWorld().removeObject(this);
        }
    }

    public void updateText(String newText)
    {
        // テキストを更新するメソッド
        text = newText;
        setImage(new GreenfootImage(text, 24, Color.WHITE, new Color(0, 0, 0, 0)));
    }
}
