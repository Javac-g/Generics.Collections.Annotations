import java.util.*;

public class MyUtils {
   
    public Map<String, List<String>> createNotebook(Map<String, String> phones) {
        
                Map<String, List<String>> result = new HashMap<>();

        for (Map.Entry<String, String> entry : phones.entrySet()) {
            
            if (result.containsKey(entry.getValue())) {
                
                result.get(entry.getValue()).add(entry.getKey());
                
            } else {
                
                result.put(entry.getValue(), new ArrayList<>(Collections.singleton(entry.getKey())));
            }
        }

        return result;
    }
}
