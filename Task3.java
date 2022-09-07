import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MyUtils {
    
    public boolean listMapCompare(List<String> list, Map<String, String> map) {
        
        return list.containsAll(map.values());
        
    }
    
}
