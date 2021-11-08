package generics.src.ru.codeinside.generics;

import java.util.ArrayList;
import java.util.List;

class ValuesSeparator {
    private List<Object> arr = new ArrayList<>();

    public void addVariables(List<Object> inputValues) {
        arr.addAll(inputValues);
    }

    public List<?> getSeparatedBy(Class<?> type) {
        List<Object> new_list = new ArrayList<>();
        arr.stream().filter(i -> i.getClass().getName().equals(type.getName())).forEach(new_list::add);
        return new_list;
    }

}
