package kadai_018;

//子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタの追加
    public KatoTaro_Chapter18() {
        setGivenName("太郎"); // ここで名前をセット
    }

    @Override
    void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }

    // ローカル変数ではなく、クラスのフィールドに値をセット
    void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
