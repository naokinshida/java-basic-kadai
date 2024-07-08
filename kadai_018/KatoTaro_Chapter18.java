package kadai_018;


//子クラス
public class KatoTaro_Chapter18 extends Kato_Chapter18 {

 // コンストラクタの追加
 public KatoTaro_Chapter18() {
     setGivenName();
 }

 @Override
 void eachIntroduce() {
     System.out.println("私はJavaが得意です");
 }

 @Override
 public void setGivenName() {
     this.givenName = "太郎";  // 名前を直接設定
 }
}
