import java.util.Arrays;

class HashMapCustom<K, V> {

    private Entry<K,V>[] table;   //Array of Entry.
    private int capacity= 4;  //Initial capacity of HashMap

    static class Entry<K, V> {
        K key;
        V value;
        Entry<K,V> next;

        public Entry(K key, V value, Entry<K,V> next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }

    public HashMapCustom(){
        table = new Entry[capacity];
    }


    public void put(K newKey, V data){
        if(newKey==null)
            return;    //does not allow to store null.

        //calculate hash of key.
        int hash=hash(newKey);

        //create new entry.
        Entry<K,V> newEntry = new Entry<K,V>(newKey, data, null);

        //if table location does not contain any entry, store entry there.
        if(table[hash] == null){
            table[hash] = newEntry;
        }else{
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];

            while(current != null){ //we have reached last entry of bucket.
                if(current.key.equals(newKey)){
                    if(previous==null){  //node has to be insert on first of bucket.
                        newEntry.next=current.next;
                        table[hash]=newEntry;
                        return;
                    }
                    else{
                        newEntry.next=current.next;
                        previous.next=newEntry;
                        return;
                    }
                }
                previous=current;
                current = current.next;
            }
            previous.next = newEntry;
        }
    }


    public V get(K key){
        int hash = hash(key);
        if(table[hash] == null){
            return null;
        }else{
            Entry<K,V> temp = table[hash];
            while(temp!= null){
                if(temp.key.equals(key))
                    return temp.value;
                temp = temp.next; //return value corresponding to key.
            }
            return null;   //returns null if key is not found.
        }
    }

    public boolean remove(K deleteKey){

        int hash=hash(deleteKey);

        if(table[hash] == null){
            return false;
        }else{
            Entry<K,V> previous = null;
            Entry<K,V> current = table[hash];

            while(current != null){ //we have reached last entry node of bucket.
                if(current.key.equals(deleteKey)){
                    if(previous==null){  //delete first entry node.
                        table[hash]=table[hash].next;
                        return true;
                    }
                    else{
                        previous.next=current.next;
                        return true;
                    }
                }
                previous=current;
                current = current.next;
            }
            return false;
        }

    }


    public void display(){

        for(int i=0;i<capacity;i++){
            if(table[i]!=null){
                Entry<K, V> entry=table[i];
                while(entry!=null){
                    System.out.print("{"+entry.key+"="+entry.value+"}" +" ");
                    entry=entry.next;
                }
            }
        }

    }


    private int hash(K key){
        int added = 0;
        int hashC = Math.abs(key.hashCode()); //Nilai absolut hashCode key
        String sNumber = String.valueOf(hashC); //Bentuk String dari hashCode key

        int add[] = new int[sNumber.length()]; //Array untuk menampung data selanjutnya

        //Perulangan untuk mendapatkan angka unik dengan mengalikan nilai absolut hashCode dengan
        //nilai absolut hashCode dari digit belakang yang dikurangi dengan jumlah digit (panjang String)
        int index = 0;
        for (int i = sNumber.length() - 1; i >= 0; i--){
            add[index] = hashC * (Integer.parseInt(sNumber.substring(i, i+1)) - sNumber.length());
            index++;
        }

        //Perulangan untuk menambahkan masing-masing nilai pada Array
        for (int i = 0; i < add.length; i++){
            added += add[i];
        }


        //Mengembalikan nilai sisa pembagian atau modulo dari nilai absolut penjumlahan setiap elemen
        //pada array dengan jumlah capacity
        return Math.abs(added) % capacity;



        /*
        Nama    : Qolandar Annuri
        NIM     : 205150200111058

        Di sini saya merubah fungsi hash dengan suatu perhitungan sebagai berikut

        1. Mendeklarasikan variabel hashC dengan tipe data integer yang menampung nilai absolut dari
           fungsi hashCode pada "key"
        2. Mendeklarasikan variabel sNumber dengan tipe data String yang menampung nilai integer hashC
           yang dirubah menjadi String
        3. Mendeklarasikan array add[] dengan tipe data integer untuk menampung data
        4. Melakukan perulangan dengan batas perulangan merupakan panjang String sNumber,
           pada perulangan, setiap element array add[] berisi hasil perkalian variabel hashC dengan
           masing-masing digit (dari belakang) yang telah dikurangi dengan panjang String cNumber
        5. Menambahkan masing-masing element pada Array dan ditampung dengan variabel added
        6. Mengembalikan nilai sisa pembagian atau modulo dari nilai absolut penjumlahan setiap elemen
           pada array dengan jumlah capacity


        Contoh Mekanisme Perhitungan (Key pada main class)

         1. HashCode : 21
            Array : [-21, 0]
            Penjumlahan seluruh isi Array : -21
            Hasil Hash : Math.abs(-21) % 4 = 1

         2. HashCode : 25
            Array : [75, 0]
            Penjumlahan seluruh isi Array : 75
            Hasil Hash : Math.abs(75) % 4 = 3

         3. HashCode : 30
            Array : [-60, 30]
            Penjumlahan seluruh isi Array : -30
            Hasil Hash : Math.abs(-30) % 4 = 2

         4. HashCode : 33
            Array : [33, 33]
            Penjumlahan seluruh isi Array : 66
            Hasil Hash : Math.abs(66) % 4 = 2

         5. HashCode : 35
            Array : [105, 35]
            Penjumlahan seluruh isi Array : 140
            Hasil Hash : Math.abs(140) % 4 = 0
         */
    }

}

public class HashMapCustomApp {

    public static void main(String[] args) {
        HashMapCustom<Integer, Integer> hashMapCustom = new HashMapCustom<Integer, Integer>();
        hashMapCustom.put(21, 12);
        hashMapCustom.put(25, 121);
        hashMapCustom.put(30, 151);
        hashMapCustom.put(33, 15);
        hashMapCustom.put(35, 89);


        System.out.println("value corresponding to key 21="
                + hashMapCustom.get(21));
        System.out.println("value corresponding to key 51="
                + hashMapCustom.get(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();

        System.out.println("\n\nvalue corresponding to key 21 removed: "
                + hashMapCustom.remove(21));
        System.out.println("value corresponding to key 51 removed: "
                + hashMapCustom.remove(51));

        System.out.print("Displaying : ");
        hashMapCustom.display();

    }
}