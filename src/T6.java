/**
 * @author shiyutao
 * @create 2021-10-10 14:54
 */
public class T6 {




    public String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i=0;i<chars.length;i++){
            if(chars[i]==' '){
                stringBuilder.append("%20");
            }
            else
                stringBuilder.append(chars[i]);


        }
            return stringBuilder.toString();
    }
}
