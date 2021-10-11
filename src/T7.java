/**
 * @author shiyutao
 * @create 2021-10-10 15:00
 */
public class T7 {


    public String reverseLeftWords(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i=n;i<chars.length;i++){
                stringBuilder.append(chars[i]);
        }
            for (int i=0;i<n;i++){
        stringBuilder.append(chars[i]);

        }
        return stringBuilder.toString();
        }
        }
