public class Simple {
    public static void main(String[] args) {

            String[] flag = "wb9dvP6|fP=:xP|:vPw{Pb6xfPx9cbv".split("_");
            System.out.print("flag{");
            String enc = encrypt(flag);

            for (int i = 0; i < enc.length(); ++i) {
                System.out.print((char) (enc.charAt(i) ^ 15));
            }

            System.out.println("}");

    }

        public static String encrypt(String[] pt) {
            char[] keyword = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
            String output = "";

            for(int i = 0; i < pt.length; ++i) {
                for(int j = 0; j < pt[i].length(); ++j) {
                    int index = -1;
                    char x = pt[i].charAt(j);

                    for(int k = 0; k < keyword.length; ++k) {
                        if (keyword[k] == x) {
                            index = k;
                            break;
                        }
                    }

                    index = Math.abs(index + 5) % keyword.length;
                    output = output + keyword[index];
                }

                if (i == pt.length - 1) {
                    break;
                }

                output = output + "_";
            }

            return output;
        }

    }

