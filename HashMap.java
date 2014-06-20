                  // http://www.algolist.net/Data_structures/Hash_table/Simple_example

public class HashMap {
      private final static int TABLE_SIZE = 128;
      
      HashEntry[] table;
      
      HashMap() {
            table = new HashEntry[TABLE_SIZE];
            for (int i = 0; i < TABLE_SIZE; i++)
                  table[i] = null;
      }
      
      public int get(int key) {
            int hash = (key % TABLE_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % TABLE_SIZE;
            if (table[hash] == null)
                  return -1;
            else
                  return table[hash].getValue();
      }
      
      public void put(int key, int value) {
            int hash = (key % TABLE_SIZE);
            while (table[hash] != null && table[hash].getKey() != key)
                  hash = (hash + 1) % TABLE_SIZE;
            table[hash] = new HashEntry(key, value);
      }

      public static void main(String[] args) {
            HashMap hashmap = new HashMap();
            hashmap.put(1, 2);
            System.out.println(hashmap.get(1) == 2);

      }

      private static class HashEntry {
            private int key;
            private int value;
            
            HashEntry(int key, int value) {
                  this.key = key;
                  this.value = value;
            }     
            
            private int getKey() {
                  return key;
            }
            
            private int getValue() {
                  return value;
            }
      }
}

