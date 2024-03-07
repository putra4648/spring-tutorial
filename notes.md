# Hal - hal yang ada pada Java Spring

- Application Context

  Menggunakan IoC (Inversion of Control) / Container.

- Singleton :

  Object yang hanya dibuat 1 kali saja, jika membuat object baru akan mengembalikan object sama lagi.

- Bean :

  Saat masuk ke dalam IoC disebut Bean, secara default Bean adalah singleton dan Bean otomatis akan dibuat dan dipanggil di IoC.

  **Dalam membuat Bean harus terdapat anotasi @Configuration**

  - Duplicate Bean:

    Bean bisa menggunakan tipe data yang sama, jika sama harus membuat nama Bean yang berbeda dan untuk mengaksesnya harus menggunakan nama Bean yang telah dibuat.

  - Primary Bean :

    Bean yang hanya bisa dipilih menjadi paling utama untuk mengaksesnya, secara otomatis saat dipanggil maka primary bean-nya akan terpilih.

  - Mengubah nama Bean :

    Secara default nama Bean menggunakan nama method, pada dasarnya Bean adalah unik dan tidak boleh sama, maka dari itu mengubah Bean berguna jika terjadi bentrok antar Bean yang sama. Mengubah nama Bean dengan menambah method value di dalam anotasi @Bean().

- Dependency Injection :

  DI adalah konsep membuat obyek secara otomatis yang bergantung pada obyek lainnya atau disebut dependencies, otomatis DI akan masuk (inject) ke dalam obyek yang dibutuhkan.
  Konsepnya sama dengan IoC
  Tanpa DI akan sulit untuk membuat relasi antar dependencies.

  - Spring DI :

    Spring sejak awal menggunakan DI
    Membuat method untuk Bean bisa menggunakan parameter  
    Secara otomatis Spring akan mencari bean sesuai dengan tipe parameter tersebut
    Terjadi error jika tidak ada Bean yang cocok dan terdapat lebih dari 1 Bean kecuali terdapat Primary Bean

  - Pemilihan DI :

    Saat terdapat Duplicate Bean dengan tipe data sama, Spring memilih Bean yang memiliki Primary Bean
    Digunakan untuk memilih Bean secara manual
    Dengan menggunakan anotasi @Qualifier(value="namaBean") pada parameter methodnya

  - Circular Dependencies :

    **Harus berhati-hati terhadap Circular Dependencies**

    Jika bean A bergantung pada B, bean B bergantung pada C dan ternyata C bergantung pada A, maka otomatis Spring akan mendeteksi error

    **Jangan pernah membuat Circular Dependecies selamanya jangan**
