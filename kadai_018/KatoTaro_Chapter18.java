package kadai_018;

//子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {

  
    @Override
    void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }

    // ローカル変数ではなく、クラスのフィールドに値をセット
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}