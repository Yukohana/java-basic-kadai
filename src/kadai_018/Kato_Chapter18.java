package kadai_018;

public abstract class Kato_Chapter18 {
    //姓を表すフィールド
    public String familyName;
    
    //名を表すフィールド
    public String givenName;
    
    //住所を表すフィールド
    public String address;
    
    
    // 名をセットするメソッド（←★追加）
    public void setGivenName(String name) {
        this.givenName = name;
    }

    // 姓をセットするメソッド（おまけ）
    public void setFamilyName(String name) {
        this.familyName = name;
    }

    // 住所をセットするメソッド（おまけ）
    public void setAddress(String address) {
        this.address = address;
    }

    
    //共通の紹介を出力するメソッド
    public void commonIntroduce() {
        System.out.println("名前は:" + "加藤" + givenName);
        System.out.println("住所は:" + "東京都中野区〇×です");
    }
    
    //各サブクラスで個別に実装する必要がある
    public abstract void eachIntroduce();
    
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
    }
}