package kadai_021;
import java.util.HashMap;

public class Dictionary_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		HashMap<String,String> fruitsMap = new HashMap<String,String>();
		
		fruitsMap.put("apple","りんご");
		fruitsMap.put("peach","桃");
		fruitsMap.put("bamama","バナナ");
		fruitsMap.put("lemon","レモン");
		fruitsMap.put("pear","梨");
		fruitsMap.put("kiwi","キウィ");
		fruitsMap.put("strawberry","いちご");
		fruitsMap.put("grape","ぶどう");
		fruitsMap.put("muscat","マスカット");
		fruitsMap.put("cherry","さくらんぽ");
		
		
	      for(int i = 0; i < fruitsMap.size(); i++) {
	          System.out.println(fruitsMap.get(i));
	
	      
	      }

	}	
}

