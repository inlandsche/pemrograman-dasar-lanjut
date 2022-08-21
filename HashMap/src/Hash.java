import java.util.Arrays;

public class Hash {
    public static void main(String[] args) {
        System.out.println(hashing("anjay"));
        System.out.println(hashing("anjing"));
        System.out.println(hashing("anjung"));
        System.out.println(hashing("anjeng"));

        System.out.println(hashing(66));
        System.out.println(hashing(21));
        System.out.println(hashing(43));
        System.out.println(hashing(1));
    }

    public static int hashing(Object o){
        int added = 0;
        int hashC = o.hashCode();
        String sNumber = String.valueOf(hashC);

        //System.out.println("HashCode : " + sNumber);

        int add[] = new int[sNumber.length()];


        for (int i = 0; i < sNumber.length(); i++){
            add[i] = hashC % (int) sNumber.charAt(i);
        }

        //System.out.println(Arrays.toString(add));

        for (int i = 0; i < add.length; i++){
            added += add[i];
        }

        //System.out.println("Added : " + added);

        return Math.abs((added/2) % 4);
    }
}
