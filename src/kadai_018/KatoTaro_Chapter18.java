package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    public KatoTaro_Chapter18() {
        setFamilyName("加藤");
        setGivenName("太郎");
        setAddress("東京都中野区〇×");
    }

    @Override
    public void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }
}