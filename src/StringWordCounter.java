import java.util.Dictionary;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;

public class StringWordCounter {
    public static void main(String[] args) {
        String str = "hello hello how Are you HELLO are there happy test you";
        String[] words = str.split(" ");
        Dictionary<String, Integer> wordCount = new Hashtable<String, Integer>();
        for(String word : words)
        {
            word = word.toLowerCase();
            if(wordCount.get(word) == null) {
                wordCount.put(word, 1);
            }
            else {
                wordCount.put(word, wordCount.get(word) + 1);
            }
        }
        Enumeration<String> enm = wordCount.keys();
        String print = "";
        while(enm.hasMoreElements()) {
            if(!print.equals(""))
                System.out.println(print + ",");
            String k = enm.nextElement();
            print = k + " -> " + wordCount.get(k);
        }
        System.out.print(print);
    }
}
