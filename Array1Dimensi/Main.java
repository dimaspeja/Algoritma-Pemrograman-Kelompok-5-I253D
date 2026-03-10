
public class DataMahasiswa {
    public static void main(String[] args) {

        String[] nama = {"Fivah", "Joy", "Dimas"};
        String[] nim = {"312510472", "312510251", "312510242"};
        int[] nilai = {92, 90, 95};

        System.out.println("Data Nilai Mahasiswa");
        System.out.println("---------------------------");

        for(int i = 0; i < nama.length; i++){
            System.out.println("Nama  : " + nama[i]);
            System.out.println("NIM   : " + nim[i]);
            System.out.println("Nilai : " + nilai[i]);
            System.out.println();
        }

    }
}