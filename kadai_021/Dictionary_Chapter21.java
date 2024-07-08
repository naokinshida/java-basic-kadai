package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	
		HashMap<String,String> dictionary = new HashMap<String,String>();
		
		 String givenWord;
		public void furuDict() {
		dictionary.put("apple", "りんご");
		dictionary.put("peach", "桃");
		dictionary.put("banana", "バナナ");
		dictionary.put("lemon", "レモン");
		dictionary.put("pear", "梨");
		dictionary.put("kiwi", "キウィ");
		dictionary.put("strawberry", "いちご");
		dictionary.put("grape", "ぶどう");
		dictionary.put("muscat", "マスカット");
		dictionary.put("cherry", "さくらんぼ");
		}
		public void setSearchWord(String givenWord) {
		this.givenWord = givenWord;
		}
		
		 public void searchDic() {
		        // 検索語が辞書に含まれているかチェック
		        if(dictionary.containsKey(givenWord)) {
		            // 含まれている場合、その意味を表示
		            String meaning = dictionary.get(givenWord);
		            System.out.println(givenWord + "の意味は " + meaning + " です。");
		        } else {
		            // 含まれていない場合、その旨を表示
		            System.out.println(givenWord + "は辞書に含まれていません。");
		        }
		    }
		}

