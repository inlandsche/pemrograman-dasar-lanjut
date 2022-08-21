package program.generic.app;

import program.generic.data.Nilai;

public class BoundedTypeApp {
    public static void main(String[] args) {
        DataNumber<Integer> dataInteger = new DataNumber(200);
        DataNumber<Long> dataLong = new DataNumber(2L);

        // tidak dapat menggunakan tipe data String karena bukan termasuk Number
        // DataNumber<String> dataString = new DataNumber("Tesla");
    }

    public static class DataNumber<T extends Number>{
        private T data;

        public DataNumber(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }

}
