import java.util.Scanner;

public class BangunRuangLengkap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilihan;

        System.out.println("=== PROGRAM MENGHITUNG BANGUN RUANG ===");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Kerucut");
        System.out.println("5. Bola");
        System.out.print("Pilih bangun ruang (1-5): ");
        pilihan = input.nextInt();

        switch (pilihan) {

            case 1:
                System.out.print("Masukkan sisi kubus: ");
                double sisi = input.nextDouble();

                double volumeKubus = sisi * sisi * sisi;
                double luasKubus = 6 * sisi * sisi;

                System.out.println("Volume Kubus = " + volumeKubus);
                System.out.println("Luas Permukaan Kubus = " + luasKubus);
                break;

            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();

                double volumeBalok = p * l * t;
                double luasBalok = 2 * (p*l + p*t + l*t);

                System.out.println("Volume Balok = " + volumeBalok);
                System.out.println("Luas Permukaan Balok = " + luasBalok);
                break;

            case 3:
                System.out.print("Masukkan jari-jari tabung: ");
                double rTabung = input.nextDouble();
                System.out.print("Masukkan tinggi tabung: ");
                double tTabung = input.nextDouble();

                double volumeTabung = Math.PI * rTabung * rTabung * tTabung;
                double luasTabung = 2 * Math.PI * rTabung * (rTabung + tTabung);

                System.out.println("Volume Tabung = " + volumeTabung);
                System.out.println("Luas Permukaan Tabung = " + luasTabung);
                break;

            case 4:
                System.out.print("Masukkan jari-jari kerucut: ");
                double rKerucut = input.nextDouble();
                System.out.print("Masukkan tinggi kerucut: ");
                double tKerucut = input.nextDouble();

                double s = Math.sqrt((rKerucut*rKerucut) + (tKerucut*tKerucut));

                double volumeKerucut = (1.0/3) * Math.PI * rKerucut * rKerucut * tKerucut;
                double luasKerucut = Math.PI * rKerucut * (rKerucut + s);

                System.out.println("Volume Kerucut = " + volumeKerucut);
                System.out.println("Luas Permukaan Kerucut = " + luasKerucut);
                break;

            case 5:
                System.out.print("Masukkan jari-jari bola: ");
                double rBola = input.nextDouble();

                double volumeBola = (4.0/3) * Math.PI * rBola * rBola * rBola;
                double luasBola = 4 * Math.PI * rBola * rBola;

                System.out.println("Volume Bola = " + volumeBola);
                System.out.println("Luas Permukaan Bola = " + luasBola);
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }
    }
}
