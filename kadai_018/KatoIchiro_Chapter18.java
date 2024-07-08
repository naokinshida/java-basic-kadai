package kadai_018;

// 子クラス
public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタの追加
    public KatoIchiro_Chapter18() {
        setGivenName();  // 引数なしで呼び出す
    }

    @Override
    void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです");
    }

    @Override
    public void setGivenName() {
        this.givenName = "一郎";  // 名前を直接設定
    }
}
