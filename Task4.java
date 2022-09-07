public class ArrayUtil {

    public static <T> T setAndReturn(T[] value1, T value2, int index) {
        
        value1[index] = value2;
        
        return value1[index];
        
    }
}
