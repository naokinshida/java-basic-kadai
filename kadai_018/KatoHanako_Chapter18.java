package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	
	public KatoHanako_Chapter18() {
		setGivenName("花子");
	}
    @Override
    void eachIntroduce() {
        System.out.println("趣味は読書です");
    }

    // ローカル変数ではなく、クラスのフィールドに値をセット
    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }
}
