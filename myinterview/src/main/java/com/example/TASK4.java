import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;
/**
 * Create an implementation of a Rest API client.
 * Prints out how many records exists for each gender and save this file to s3 bucket
 * API endpoint=> https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda 
 * AWS s3 bucket => interview-digiage
 *
 */
public class TASK4 {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://3ospphrepc.execute-api.us-west-2.amazonaws.com/prod/RDSLambda");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            connection.disconnect();

            JSONArray jsonArray = new JSONArray(response.toString());

            Map<String, Integer> genderCount = new HashMap<>();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                String gender = jsonObject.getString("gender");

                genderCount.put(gender, genderCount.getOrDefault(gender, 0) + 1);
            }

            for (Map.Entry<String, Integer> entry : genderCount.entrySet()) {
                System.out.println("Gênero: " + entry.getKey() + " - Contagem: " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
