package array2dimensi;
public class Main {
    public static void main(String[] args) {
        String[][] nim = {
            {"Nama", "NIM", "Kelas"},
            {"Dimas", "312510242", "I253D"},
            {"Fivah", "312510472", "I253D"},
            {"Joy", "312510251", "I253D"}
        };
        for(int i = 0; i < nim.length; i++){
            System.out.printf("%-6s %-15s %-10s%n", nim[i][0], nim[i][1], nim[i][2]);
        }
    }
}
