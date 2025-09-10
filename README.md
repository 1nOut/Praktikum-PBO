# Post-Test 1 PBO 

## Deskripsi Program
Program ini merupakan sistem untuk memanajemen dari warung internet. Adapun yang bisa dilakukan oleh user adalah hal-hal umum seperti CRUD(Create, Read, Update, Delete). Adapun yang disimpan disini adalah data pelanggan yaitu berupa:

1. Nama Pelanggan
2. Durasi (jam)
3. Total Harga

## Pilihan Menu
1. Tambah Pelanggan
2. Lihat Data Pelanggan
3. Ubah Data Pelanggan
4. Hapus Data Pelanggan
5. Keluar

## Alur Sistem

### 1. Menu Utama

<img width="297" height="153" alt="image" src="https://github.com/user-attachments/assets/7a9a1c13-2655-4960-9e12-f736c3e732ae" />

Ketika kita memulai file kodingannya, akan muncul menu utama seperti pada gambar yang bias dipilih dengan menginput angka dari pilihannya.

<img width="330" height="173" alt="image" src="https://github.com/user-attachments/assets/dca33932-4e76-49fd-b880-8d5c21fb298b" />

Jika ketika kita menginput angka yang tidak ada di pilihannya akan menampilkan pesan bahwa pilihan tidak ada dan kembali ke pemilihan menu utama.


### 2. Create

<img width="229" height="21" alt="Screenshot 2025-09-10 113517" src="https://github.com/user-attachments/assets/c321ca49-7579-407e-bfce-bdea11c59438" />

Jika kita memilih pilihan "1. Tambah Pelanggan" akan dibawa ke pemasukkan nama pelanggan.

<img width="203" height="22" alt="image" src="https://github.com/user-attachments/assets/6067f31a-520e-4fc5-a32f-259f64d5197f" />

Setelah itu, kita diharuskan memasukkan durasi dari pelanggan. Untuk durasi, dari sistem sudah diotomatiskan untuk mengkali 6000 dikarenakan harga per jam merupakan 6000 (Contoh, durasi yang diinput 2 yang menjadikan total harga dari pelanggannya adalah 12000 rupiah).

<img width="288" height="65" alt="image" src="https://github.com/user-attachments/assets/96504d5a-b2cc-4c01-9e9a-92e08e13426d" />

Jika sudah, sistem akan memberikan output yang mengatakan bahwa penambahan data pelanggan telah berhasil dan membawa kita kembali ke menu utama.

### 3. Read

<img width="649" height="106" alt="image" src="https://github.com/user-attachments/assets/566bfdd7-fa22-4791-a07c-e8c86a6f9a39" />

Jika kita memilih pilihan "2. Lihat Data Pelanggan" akan langsung menampilkan data pelanggan yang telah terdaftar. Setelah itu, sistem akan membawa kita kembali ke menu utama.

<img width="234" height="48" alt="image" src="https://github.com/user-attachments/assets/9db35de4-0c48-46ab-9c75-9b3f3adedd83" />

Jika data pelanggan kosong, sistem akan menampilkan pesan bahwa data belum terdaftar dan membawa kita kembali ke menu utama

### 4. Update

<img width="459" height="236" alt="image" src="https://github.com/user-attachments/assets/e0421a6c-bace-41c1-ab5f-fee471517c8b" />

Jika kita memilih pilihan "3. Ubah Data Pelanggan", sistem akan meminta kita memasukkan nomor pelanggan yang ada di daftar pelanggan. Jika sesuai, sistem akan meminta kita mengisi nama baru dan durasi yang baru dan mengembalikan kita ke menu utama.


<img width="473" height="193" alt="image" src="https://github.com/user-attachments/assets/ab01df7b-2841-4bb9-921f-cbf5d8db30f0" />

Jika kita nomor pelanggan yang dimasukkan tidak ada, sistem akan menampilkan bahwa pelanggan yang dimaksud tidak ada dan mengembalikan kita ke menu utama.

### 5. Delete

<img width="503" height="192" alt="image" src="https://github.com/user-attachments/assets/f1ca2c06-7a6b-420d-91eb-34c75860d670" />

Apabila kita memilih pilihan "4. Hapus Data Pelanggan", sama seperti sebelumnya sistem akan meminta nomor pelanggan yang dimaksud. Apabila terdapat pelanggan yang sesuai akan langsung dihapus oleh sistem dan kita kembali ke menu utama.


<img width="478" height="189" alt="image" src="https://github.com/user-attachments/assets/fd73b5bd-4fc6-4cb6-aae1-b08e3376fe65" />

Dan jika nomor pelanggan yang dimaksud tidak ada, sistem akan menampilkan pesan bahwa nomor pelanggan tidak ada dan kembali ke menu utama.

### 6. Keluar

<img width="728" height="299" alt="image" src="https://github.com/user-attachments/assets/3f82eed3-7687-4cd3-a217-9ad4f81ccc38" />

Dan terakhir apabila kita memilih pilihan "5. Keluar" sistem akan menyelesaikan programnya.










