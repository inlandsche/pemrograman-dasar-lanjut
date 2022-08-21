public class warmup {
    public warmup() {
    }

    public static void main(String[] args) {
        int[] flag = new int[]{100, 48, 95, 121, 111, 117, 95, 107, 110, 48, 119, 95, 97, 115, 99, 105, 49, 95, 99, 48, 100, 101, 63};
        System.out.print("flag{");

        for(int i = 0; i < flag.length; ++i) {
            System.out.print((char)flag[i]);
        }

        System.out.println('}');
    }
}
