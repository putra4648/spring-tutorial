# Hal - hal yang ada pada Java Spring

- Application Context
  : Menggunakan IoC (Inversi of Control) / Container.

- Singleton
  : Object yang hanya dibuat 1 kali saja, jika membuat object baru akan mengembalikan object sama lagi.

- Bean
  : Saat masuk ke dalam IoC disebut Bean, secara default Bean adalah singleton dan Bean otomatis akan dibuat dan dipanggil di IoC.

- Duplicate Bean
  : Bean bisa menggunakan tipe data yang sama, jika sama harus membuat nama bean yang berbeda dan untuk mengaksesnya harus menggunakan nama bean yang telah dibuat.

- Primary Bean
  : Bean yang hanya bisa dipilih menjadi paling utama untuk mengaksesnya, secara otomatis saat dipanggil maka primary bean-nya akan terpilih.

- Mengubah nama Bean
  : Secara default nama Bean menggunakan nama method, pada dasarnya Bean adalah unik dan tidak boleh sama, maka dari itu mengubah Bean berguna jika terjadi bentrok antar Bean yang sama. Mengubah nama Bean dengan menambah method value di dalam anotasi @Bean().

# Sumber belajar

[Youtube here](https://www.youtube.com/watch?v=VM3rwdMBORY)

# TODO

- [x] Mengubah Nama Bean
- [ ] Dependency Injection
- [ ] Memilih Dependency
- [ ] Circular Dependencies
- [ ] Depends On
- [ ] Lazy Bean
- [ ] Scope
- [ ] Membuat Scope
- [ ] Life Cycle
- [ ] Life Cycle Annotation
- [ ] Import
- [ ] Component Scan
- [ ] Component
- [ ] Constructor-based Dependency Injection
- [ ] Setter-based Dependency Injection
- [ ] Field-based Dependency Injection
- [ ] Qualifier
- [ ] Optional Dependency
- [ ] Factory Bean
- [ ] Inheritance
- [ ] Bean Factory
- [ ] Bean Post Processor
- [ ] Ordered
- [ ] Aware
- [ ] Bean Factory Post Processor
- [ ] Event Listener
- [ ] Event Listener Annotation
- [ ] Spring Boot Application
- [ ] Startup Failure
- [ ] Banner
- [ ] Customizing Spring Application
- [ ] Spring Application Event
- [ ] Command Line Runner
- [ ] Application Runner
- [ ] Spring Boot Plugin
