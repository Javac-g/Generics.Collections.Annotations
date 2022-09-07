import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CamelCase {
}

public class CheckCamelCase {
    public static final String CAMELCASE_PATTERN = "[a-z]+((\\d)|([A-Z0-9][a-z0-9]+))*([A-Z])?";

    static boolean checkAndPrint(Class c) {
        final int[] counter = {0};
        Arrays.stream(c.getDeclaredMethods())
                .filter(method -> method.isAnnotationPresent(CamelCase.class)
                        && !Pattern.matches(CAMELCASE_PATTERN, method.getName()))
                .map(
                        method -> String.format(
                                "method %s.%s doesn't satisfy camelCase naming convention",
                                c.getSimpleName(),
                                method.getName()
                        )
                )
                .forEach(
                        message -> {
                            System.out.println(message);
                            counter[0]++;
                        });
        return counter[0] == 0;
    }
}

class ClassForAnnot {
    @CamelCase
    public static void example() {
    }

    public static void _main(String[] args) {
    }

    @CamelCase
    public void Example() {
    }
}

class Class1 {
    @CamelCase
    public void correct() {
    }

    @CamelCase
    public void InCorrect() {
    }

    @CamelCase
    public void JustMethod() {
    }
}

class Class2 {
    @CamelCase
    public void correct() {
    }

    @CamelCase
    public void oneMoreCorrect() {
    }
}
