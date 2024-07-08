package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    public KatoHanako_Chapter18() {
        setGivenName();
    }

    @Override
    void eachIntroduce() {
        System.out.println("趣味は読書です");
    }

    @Override
    public void setGivenName() {
        this.givenName = "花子";  // 名前を直接設定
    }
}
