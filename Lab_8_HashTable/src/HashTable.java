public class HashTable {

    static private class ListNode <K,V>{
        K key;
        V value;
        ListNode next;
    }

    private ListNode[] table;

    private int count;

    public HashTable() {
        table = new ListNode[64];
    }

    public HashTable(int initialSize) {
        table = new ListNode[initialSize];
    }

    void printHashTable() {
        System.out.println();
        for (int i = 0; i < table.length; i++) {
            System.out.print(i + ":");
            ListNode list = table[i];
            while (list != null) {
                System.out.print("  (" + list.key + "," + list.value + ")");
                list = list.next;
            }
            System.out.println();
        }
    }

    public <K,V> void put(K key, V value) {
        int hashkey = hash(key);
        ListNode list = table[hashkey];
        while (list != null) {
            if (list.key.equals(key))
                break;
            list = list.next;
        }
        if (list != null) {
            list.value = value;
        }
        else {
            if (count >= 0.7 * table.length) {
                resize();
            }
            ListNode newNode = new ListNode();
            newNode.key = key;
            newNode.value = value;
            newNode.next = table[hashkey];
            table[hashkey] = newNode;
            count++;
        }
    }

    public <K> Object get(K key) {
        int hashkey = hash(key);
        ListNode list = table[hashkey];
        while (list != null) {
            if (list.key.equals(key))
                return list.value;
            list = list.next;
        }
        return null;
    }

    public <K> void remove(K key) {
        int hashkey = hash(key);
        if (table[hashkey] == null) {
            return;
        }
        if (table[hashkey].key.equals(key)) {
            table[hashkey] = table[hashkey].next;
            count--;
            return;
        }
        ListNode prev = table[hashkey];
        ListNode curr = prev.next;
        while (curr != null && ! curr.key.equals(key)) {
            curr = curr.next;
            prev = curr;
        }
        if (curr != null) {
            prev.next = curr.next;
            count--;
        }
    }

    public <K> boolean containsKey(K key) {
        int hashkey = hash(key);
        ListNode list = table[hashkey];
        while (list != null) {
            if (list.key.equals(key))
                return true;
            list = list.next;
        }
        return false;
    }

    public int size() {
        return count;
    }

    private <K> int hash(K key) {
        return (Math.abs(key.hashCode())) % table.length;
    }

    private void resize() {
        ListNode[] newtable = new ListNode[table.length*2];
        for (int i = 0; i < table.length; i++) {
            ListNode list = table[i];
            while (list != null) {
                ListNode next = list.next;
                int hash = (Math.abs(list.key.hashCode())) % newtable.length;
                list.next = newtable[hash];
                newtable[hash] = list;
                list = next;
            }
        }
        table = newtable;
    }

}

