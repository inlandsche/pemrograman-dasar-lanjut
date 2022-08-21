package program.generic.app;

import program.generic.data.Data;

public class DataApp {
    public static void main(String[] args) {
        Data nilai = new Data();
        nilai.setData("andi");

        String value = (String) nilai.getData();
        System.out.println(value);
    }
}
