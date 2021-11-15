public class Main {
    public static void main(String[] args){
        HashTable table = new HashTable(30);
        table.put(10, "a");
        table.put(12.34, "b");
        table.put("asd", "c");
        table.put(48, "d");
        System.out.println(table.get(48));
        System.out.println(table.size());
        System.out.println(table.containsKey(12.34));
        table.printHashTable();
    }
}
