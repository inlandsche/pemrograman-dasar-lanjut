public class strcmp {
    public static void main(String[] args) {
        String x = "rro_hjX,ec]p,h_X+ebpvlo+hf";

        char xAr[] = new char[x.length()];

        for (int i = 0; i < x.length(); i++){
            xAr[i] = x.charAt(i);
        }

        int y = 1;
        for (int i = 0; i < xAr.length; i++){
            xAr[i] -= y++;

            if (y == 10) y = 1;
        }

        for (int i = 0; i < xAr.length; i++){
            System.out.print(xAr[i]);
        }
    }
}
