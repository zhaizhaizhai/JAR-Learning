package set;

import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class setup {
    public  void set(String url) {
        try {
            FileInputStream inputStream = new FileInputStream(url);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

            String str1 = "";
            String str = null;
            while ((str = bufferedReader.readLine()) != null) {
                str1 = str1 +"\n" + "'"+ str + "'"+",";
            }

            System.out.println("[" + str1.substring(0,str1.length()-1) + "\n"+"]");
            //close
            inputStream.close();
            bufferedReader.close();
        }catch (Exception e){
            e.fillInStackTrace();
        }



    }
}
