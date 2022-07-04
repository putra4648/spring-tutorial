# Hal - hal yang ada pada Java Spring

- Application Context
  : Menggunakan IoC (Inversi of Control) / Container

- Singleton
  : Object yang hanya dibuat 1 kali saja, jika membuat object baru akan mengembalikan object sama lagi

- Bean
  : Saat masuk ke dalam IoC disebut Bean, secara default Bean adalah singleton dan Bean otomatis akan dibuat dan dipanggil di IoC

- Duplicate Bean
  : Bean bisa menggunakan tipe data yang sama, jika sama harus membuat nama bean yang berbeda dan untuk mengaksesnya harus menggunakan nama bean yang telah dibuat

- Primary Bean
  : Bean yang hanya bisa dipilih menjadi paling utama untuk mengaksesnya, secara otomatis saat dipanggil maka primary bean-nya akan terpilih
