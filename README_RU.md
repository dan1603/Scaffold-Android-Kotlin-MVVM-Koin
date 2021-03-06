# Scaffold Android Kotlin MVVM
- Koin DI Версия

Этот README также доступен на <a href="https://github.com/dan1603/Scaffold-Android-Kotlin-MVVM-Koin">Английском</a>.

### Clean Architecture

1) Network ---- нет зависимостей
- ApiService - отвечает за взаимодействие с https запросами на сервер
- ServerCommunicator - отвечает за сериализацию / десериализацию, в редких случаях за маппинг данных запроса/ответа

2) Database ---- нет зависимостей
- DAO - отвечает за CRUD операции с данными приложения
- AppDatabase - делегирует доступ к DAO последующим архитектурным слоям

3) Repository ---- зависит от: ServerCommunicator, AppDatabase
- содержит классы Repository, именованные согласно юзкейсам работы с данными

4) UseCases ---- зависит от: Repository
- содержит классы UseCases, именованные согласно юзкейсам работы с данными
- при этом дублирует методы Repository, но может содержать преобразование поточности внутри rx-цепочек

5) ViewModel ---- зависит от: UseCases
- связывает бизнес-логику UI с юзкейсами взаимодействия с данными
- отвечает за обработку и изменения состояний UI

6) View ---- зависит от: ViewModel
- Слой содержит Activity / Fragments которые имплементируют UI

### Используемые фреймворки
- RxKotlin - обеспечивает многопоточную и потокобезопасную работу (асинхронно или синхронно), позволяя работать с данными внутри потоков на различных архитектурных слоях, динамически их преобразовывая.
- Koin - нативная Kotlin библиотека для реализации Dependency Injection
- Retrofit + OkHTTP - библиотеки для взаимодействия с бекендом по протоколу http/https
- Room - библиотека, которая является надстройкой над системной для ОС Android реляционной базой данных SQLite, позволяет работать с данными используя язык запросов SQL, позволяет реализовать наблюдателя при любом изменении данных.

### Android Architecture Components:
- LifeCycle - позволяет взаимодействие с ViewModel с привязкой к жизненному циклу View
- LiveData - обертка, которая позволяет хранить временные данные, и оповещать наблюдателей при изменениях, а также при смене этапов жизненного цикла
- AndroidX Components - набор Core библиотек для работы с ОС Android
