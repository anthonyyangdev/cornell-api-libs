# Cornell API Client Library in Kotlin

Kotlin-friendly Cornell API Client Library.

## Docs

The [docs](https://docs.developersam.com/cornell-api-lib-kotlin/) contains all the type definitions
and a brief description of the purpose of each property. Please read it when you are unsure about
something.

Currently, the client library only covers

- Cornell Classes API
- Cornell Dining API

## Example Usage

```kotlin
fun main(args: Array<String>) {
    ClassesApiClient.getRosters { rosterList ->
        rosterList.map { it.defaultCampus }.forEach { println(it) }
    }
}
```
