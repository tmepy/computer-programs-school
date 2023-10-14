import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class sriju {
    public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String water = reader.next();
        JSONObject jo = new JSONObject();
        jo.put("First name: ", water);
        LinkedHashMap hashMap = new LinkedHashMap();
        hashMap.put("Address", "aarus basement");
        hashMap.put("Location", "Floor");
        jo.put("loc", hashMap);
        FileWriter pw = new FileWriter("src/sriju.json");
        pw.write(jo.toJSONString());
        pw.flush();
    }
}
