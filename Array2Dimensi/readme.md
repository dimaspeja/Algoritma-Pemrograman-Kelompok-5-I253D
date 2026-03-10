# Array 2 Dimensi

## Membuat Array 2 Dimensi
```
String[][] nim = {
```
String[][] berarti array 2 dimensi (seperti tabel).

Struktur Datanya adalah: Nama, Nim, dan Kelas.

```
            {"Nama", "NIM", "Kelas"},
            {"Dimas", "312510242", "I253D"},
            {"Fivah", "312510472", "I253D"},
            {"Joy", "312510251", "I253D"}
        };
```
Disini saya memasukkan array dengan 3 kolom dan 4 baris.

Indeksnya:
```
- nim[0][0] = Nama
- nim[0][1] = NIM
- nim[0][2] = Kelas

- nim[1][0] = Dimas
- nim[1][1] = 312510242
- nim[1][2] = I253D

- nim[2][0] = Fivah
- nim[2][1] = 312510472
- nim[2][2] = I253D

- nim[3][0] = Joy
- nim[3][1] = 312510251
- nim[3][2] = I253D
```
Lalu kita membuat perulangan untuk menampilkan datanya dengan For.
```
for(int i = 0; i < nim.length; i++){
```
i = 0, jika i masih kurang dari jumlah indeksnya. maka terus melakukan perulangan. selama perulangan i di inkrement kan (dinaikan nilainya)

karena jumlah baris ada 4, maka:

```
Jadi i akan bernilai:
i = 0
i = 1
i = 2
i = 3
```
lalu kita tampilkan data dengan printf. printf digunakan agar mengatur format tampilang agar terlihat lebih rapih seperti tabel.
```
System.out.printf("%-6s %-15s %-10s%n", nim[i][0], nim[i][1], nim[i][2]);
```
Format:

- %-6s   = teks rata kiri lebar 6 karakter
- %-15s  = teks rata kiri lebar 15 karakter
- %-10s  = teks rata kiri lebar 10 karakter

%n = pindah baris.

Data yang ditampilkan:

- nim[i][0] → kolom Nama
- nim[i][1] → kolom NIM
- nim[i][2] → kolom Kelas

dengan begitu data yang ditampilkan adalah sebagai berikut:

<img width="440" height="197" alt="Capture Hasil Array 2 Dimensi" src="https://github.com/user-attachments/assets/9ad3299f-bfd4-4d51-a915-b4ebe8523966" />
