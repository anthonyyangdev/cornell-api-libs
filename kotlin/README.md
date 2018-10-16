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

### Library Usage

```kotlin
fun main(args: Array<String>) {
    ClassesApiClient.getRosters { rosterList ->
        rosterList.map { it.defaultCampus }.forEach { println(it) }
    }
    println(ClassesApiClient.getAllCourses())
}
```

For more example, you can see some code snippets in 
[PlaygroundTest](src/test/kotlin/api/cornell/PlaygroundTest.kt).

### CLI Usage

```bash
# Print all courses to a json file for later usage.
java -jar cornell-api-lib-kotlin.jar print-all-courses > courses.json
# It will print progress messages along the way.
```
