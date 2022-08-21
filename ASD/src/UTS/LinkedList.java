package UTS;

public class LinkedList {
    Karyawan head, tail;
    int size = 0;

    LinkedList(){
        head = tail = null;
    }

    boolean isEmpty(){
        return (size == 0);
    }

    int size(){
        return size;
    }


    void addLast(Karyawan input){
        if (isEmpty()){
            head = input;
            tail = input;
        }
        else {
            tail.pointer = input;
            tail = input;
        }
        size++;
    }

    void info(){
        Karyawan temp = head;

        while (temp!=null){
            temp.print();
            temp = temp.pointer;
        }
    }



    public static void main(String[] args) {
        LinkedList daftarKaryawan = new LinkedList();

        daftarKaryawan.addLast(new Karyawan("0001", "Muhlis", "Jl. Veteran", "Direktur"));
        daftarKaryawan.addLast(new Karyawan("0002", "Firza", "Jl. Gajayana", "Sekertaris"));
        daftarKaryawan.addLast(new Karyawan("0003", "Akhtar", "Jl. Mayjen Panjaitan", "Staff Pemasaran"));
        daftarKaryawan.addLast(new Karyawan("0004", "Adi", "Jl. MT Haryono", "Humas"));

        System.out.println("NIK\t\tNama\t\tAlamat\t\t\tJabatan");
        daftarKaryawan.info();
    }
}

class Karyawan {
    String NIK;
    String nama;
    String alamat;
    String jabatan;

    Karyawan pointer;

    Karyawan(){

    }

    public Karyawan(String NIK, String nama, String alamat, String jabatan) {
        this.NIK = NIK;
        this.nama = nama;
        this.alamat = alamat;
        this.jabatan = jabatan;
    }

    void print(){
        System.out.print(this.NIK + "\t" + this.nama + "\t" + this.alamat + "\t\t\t" + this.jabatan + "\n");
    }
}




