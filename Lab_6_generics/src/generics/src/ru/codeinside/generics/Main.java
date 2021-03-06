package generics.src.ru.codeinside.generics;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        List<Object> inputValues = List.of("aokpkkdjkfkds", 'l', "sdfasdff", 12, new Object(), 30L, 'k', "asjdiojaojsidj");
        Set<Object> lst = Set.of(1,2,3,4);
        final ValuesSeparator valuesSeparator = new ValuesSeparator();
        // первый метод для реализации
        valuesSeparator.addVariables(inputValues);

        List<Class<?>> types = List.of(String.class, Long.class, Character.class, Integer.class, Object.class);

        for (var type: types) {
            // второй метод для реализации
            List<?> separatedBy = valuesSeparator.getSeparatedBy(type);
            System.out.println("values of " + type + " " + separatedBy);
        }
    }

}
