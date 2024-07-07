package kadai_018;

public class KatoIchiro_Chapter18  extends Kato_Chapter18{
	


	 @Override
	    void eachIntroduce() {
	        System.out.println("好きな食べ物はリンゴです");
	    }

	    // ローカル変数ではなく、クラスのフィールドに値をセット
	     public void setGivenName(String givenName) {
	        this.givenName = givenName;
	    }
	}
