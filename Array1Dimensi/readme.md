# Array 1 Dimensi
Author : Muhofiva Rahmawati
<!-- BOOTSTRAP ICONS -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css">

<h1 align="center">
  <i class="bi bi-journal-code"></i> Tugas Algoritma Pemrograman Array 1 Dimensi  
  <br>
<hr>
   
### 🖇 Deskripsi Program
Program ini dibuat menggunakan bahasa pemrograman Java untuk menampilkan data mahasiswa yang terdiri dari Nama, NIM, dan Nilai menggunakan array satu dimensi (larik).
Dalam program ini terdapat 3 mahasiswa, yaitu:
- Fivah
- Joy
- Dimas

Setiap mahasiswa memiliki NIM dan nilai masing-masing yang disimpan dalam array.
### 🖇 Konsep Yang Digunakan
Program ini menggunakan beberapa konsep dasar pemrograman:
- Array 1 Dimensi untuk menyimpan data nama, NIM, dan nilai mahasiswa
- Tipe data String untuk menyimpan nama dan NIM
- Tipe data int untuk menyimpan nilai
- Perulangan (for) untuk menampilkan data mahasiswa
### 📖 Penjelasan Program
#### 1. Membuat array nama
 ```
 String[] nama = {"Joy", "Fivah", "Dimas"};
```
Baris ini membuat array bernama nama yang berisi 3 data bertipe String yaitu nama mahasiswa. Isi array:
- indeks 0 → Fivah
- indeks 1 → Joy
- indeks 2 → Dimas
#### 2. Membuat array NIM
 ```
 String[] nim = {"312510472", "312510251", "312510242"};
```
Baris ini membuat array untuk menyimpan NIM mahasiswa. Setiap NIM sesuai dengan nama mahasiswa pada indeks yang sama. Contoh:
- Fivah → 312510472
- Joy → 312510251
- Dimas → 312510242
#### 3. Membuat array nilai
 ```
int[] nilai = {92, 90, 95};
```
Baris ini membuat array bertipe integer untuk menyimpan nilai mahasiswa. Isi array:
- Fivah → 92
- Joy → 90
- Dimas → 95
#### 4. Perulangan for
 ```
for(int i = 0; i < nama.length; i++){
```
Baris ini adalah perulangan (looping) untuk membaca semua data dalam array. Penjelasan:
- int i = 0 → perulangan dimulai dari indeks 0
- i < nama.length → berhenti ketika semua data array sudah dibaca
- i++ → nilai i bertambah 1 setiap perulangan
### 🎯 Output
<img width="339" height="284" alt="Screenshot 2026-03-10 095215" src="https://github.com/user-attachments/assets/b06b992b-fa49-468d-b808-6ad13d9914a5" />
