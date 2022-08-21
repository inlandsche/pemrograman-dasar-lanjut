public class ROT9 {
    public static void main(String[] args) {
        String a = "wcrx{tr3jrI_zQ_v4jp}";

        char arr[] = new char[a.length()];

        for (int i = 0; i < a.length(); i++){
            arr[i] = a.charAt(i);
        }

        int arrInt[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            arrInt[i] = (int) arr[i];
        }

        for (int i = 0; i < arr.length; i++){
            System.out.print((char)arrInt[i]);
        }
    }
}
