import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> List_1 = new ArrayList<String>();
        List_1.add("a");
        List_1.add("b");
        List_1.add("c");
        List_1.add("a");
        System.out.println(List_1);
        System.out.println(deleteDuplciteElements(List_1));
        generateRandomNumberLists();
    }

    public static void generateRandomNumberLists() {
        ArrayList arrayList_1 = new ArrayList<>();
        LinkedList linkedList_1 = new LinkedList<>();
        final int N = 50000;
        for (int i = 0; i < N; i++) {
            arrayList_1.add((int) (Math.random() * 100));
            linkedList_1.add((int) (Math.random() * 100));
        }
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            arrayList_1.get((int) (Math.random() * i));
        }
        System.out.println(System.currentTimeMillis() - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            linkedList_1.get((int) (Math.random() * i));
        }
        System.out.println(System.currentTimeMillis() - startTime);
    }

    public static <T> Collection<T> deleteDuplciteElements(Collection<T> collection) {
        HashSet<T> newCollection = new HashSet<>(collection);
        return newCollection;
    }
}
