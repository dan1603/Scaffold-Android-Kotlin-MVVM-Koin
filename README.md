# Scaffold Android Kotlin MVVM
- Koin DI Version

This README is also available in <a href="https://github.com/dan1603/Scaffold-Android-Kotlin-MVVM-Koin/blob/main/README_RU.md">Russian</a>.

### Clean Architecture

1) Network ---- no dependencies
- ApiService - responsible for interacting with https requests to the server
- ServerCommunicator - responsible for serialization / deserialization, in rare cases for mapping request / response data

2) Database ---- no dependencies
- DAO - responsible for CRUD operations with application data
- AppDatabase - delegates access to the DAO to subsequent architectural layers

3) Repository ---- depends on: ServerCommunicator, AppDatabase
- contains Repository classes named according to the use cases for working with data

4) UseCases ---- depends on: Repository
- contains the UseCases classes named according to the use cases for working with data
- at the same time duplicates Repository methods, but may contain a threading transformation inside rx-chains

5) ViewModel ---- depends on: UseCases
- connects UI business logic with data interaction use cases
- is responsible for handling and changing UI states

6) View ---- depends on: ViewModel
- The layer contains Activity / Fragments that implement the UI


#### Frameworks
- RxKotlin - provides multi-threaded and thread-safe work (asynchronously or synchronously), allowing you to work with data inside streams on various architectural layers, dynamically transforming them.
- Koin - a native Kotlin library for implementing Dependency Injection
- Retrofit + OkHTTP - libraries for interacting with the backend via the http / https protocol
- Room - a library that is an add-on over the relational database SQLite for the Android OS, it allows you to work with data using the SQL query language, allows you to implement an observer for any data change.

#### Android Architecture Components:
- LifeCycle - allows interaction with the ViewModel with binding to the life cycle of the View
- LiveData - a wrapper that allows you to store temporary data and notify observers when changes, as well as when changing stages of the life cycle
- AndroidX Components - a set of Core libraries for working with Android OS
