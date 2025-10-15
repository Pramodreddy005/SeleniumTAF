package utils;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONObject;


public class JsonUtils {

    static JSONObject jsonObject;

    public static JSONObject JsonInstance(){
        if(jsonObject!=null){
            return jsonObject;
        }
        String s=readFile();
        jsonObject=new JSONObject(s);
        System.out.println(jsonObject);
        return jsonObject;   
    }

    public static String readFile(){
        try {
        return Files.readString(Paths.get("C:\\Users\\bairi.pramod\\AutomationSelenium\\demo\\src\\main\\resources\\data.json"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "Unable to read of File";
    }

    public static String getValueFromJson(String s1, String s2){
        return JsonInstance().getJSONObject(s1).getString(s2);
    }
}
