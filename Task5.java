public class ArrayUtil {

    public static <T extends Number> double averageValue(Array<T> input) {
        
        double average = 0.0;

        for (int i = 0; i < input.length(); i++) {
            
            average += input.get(i).doubleValue();
            
        }
        
        return average / input.length();
        
    }

}

