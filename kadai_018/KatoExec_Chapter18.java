package kadai_018;

public class KatoExec_Chapter18 {
    public static void main(String[] args) {
        
        Kato_Chapter18 katoT = new KatoTaro_Chapter18();
        Kato_Chapter18 katoI = new KatoIchiro_Chapter18();
        Kato_Chapter18 katoH = new KatoHanako_Chapter18();
        
        // 各子クラスに対してsetGivenNameを呼び出す
        katoT.setGivenName("太郎");
        katoT.execIntroduce();
        System.out.println("");

        katoI.setGivenName("一郎");
        katoI.execIntroduce();
        System.out.println("");

        katoH.setGivenName("花子");
        katoH.execIntroduce();
    }
}
