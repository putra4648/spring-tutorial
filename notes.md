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

    Secara default nama Bean menggunakan nama method, pada dasarnya Bean adalah unik dan tidak boleh sama, maka dari itu mengubah Bean berguna jika terjadi bentrok antar Bean yang sama. Mengubah nama Bean dengan menambah method value di dalam anotasi `@Bean()`.

- Dependency Injection :

  Merupakan konsep membuat obyek secara otomatis yang bergantung pada obyek lainnya atau disebut dependencies, secara otomatis akan memasukkan dependencies ke dalam obyek yang dibutuhkan.
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

  - Depends On :

    Secara default Spring membuat `@Bean` secara acak, dengan menggunakan ini berarti dalam membuat `@Bean` dengan `@DependsOn` proses pembuatannya akan tergantung pada method bean yang dituju

  - Lazy Bean

    Secara default Bean dibuat setelah aplikasi dijalankan pertama kali, maka saat pertama kali dijalankan akan terasa sedikit lambat

  - Scope Bean

    Scope merupakan strategy sebuah objek dibuat, dalam strategy ini pembuatan objeknya berupa **Singleton**

    | **Scope**        | **Keterangan**                                              |
    | ---------------- | ----------------------------------------------------------- |
    | **singleton**    | (Default) Hanya dibuat sekali dalam Spring IoC              |
    | **protoype**     | Selalu membuat objek baru setiap kali bean diakses          |
    | **request**      | Dibuat baru setiap HTTP `Request` (Hanya untuk Web App)     |
    | **session**      | Dibuat baru setiap HTTP `Session` (Hanya untuk Web App)     |
    | **appplication** | Dibuat baru setiap `ServletContext` (Hanya untuk Web App)   |
    | **websocket**    | Dibuat baru setiap `Web Socket` (Hanya untuk WebSocket App) |

  - Life Cycle

    Spring Container memiliki alur hidup, saat pertama kali berjalan dan selesai membuat Bean maka Spring akan memberitahukan bahwa Bean tersebut sudah siap digunakan, ketika Spring akan mati akan memberitahu semua Bean akan mati

    - Life Cycle Callback

      Jika ingin mengetahui alur hidup Bean dapat menggunakan interface `InitializingBean` dan `DisposableBean`

      `InitializingBean` digunakan ketika Spring selesai membuat Bean

      `DisposableBean` digunakan ketika Spring akan menghancurkan Bean

      Selain itu dapat menggunakan anotasi `@Bean` dengan method `initMethod()` dan `destroyMethod()`

      Selain menggunakan anotasi `@Bean()` jika kelupaan menambahkan method di dalamnya bisa menggunakan anotasi `@PostConstruct()` dan `@PreDestroy()`

    -
