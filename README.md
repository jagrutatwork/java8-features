# Java 8 Features - Practice Project

This is a personal demo project designed to help me understand and practice Java 8's core functional programming concepts — especially its **Streams API, Functional Interfaces, Map-Reduce, and Optional** classes.

---

## 🚀 Features Covered

- Functional Interfaces
  - `Consumer`
  - `Predicate`
  - `Supplier`
- Java 8 Stream API
- `map()` vs `flatMap()`
- `reduce()` operation
- `Optional` class
- Parallel Streams

---

## 📚 Notes Overview

### 🎯 Functional Interfaces

#### `Consumer<T>`
- Represents an operation that takes a single input argument and returns no result.
- Used for operations that consume objects without returning a value.
- Method Signature:  
  `void accept(T t)`

---

#### `Predicate<T>`
- Represents a condition (boolean-valued function) on input arguments.
- Useful for filtering and conditional logic.
- Method Signature:  
  `boolean test(T t)`

---

#### `Supplier<T>`
- Represents a supplier of results.
- Takes no input but returns an output.
- Method Signature:  
  `T get()`

---

### 💡 Java Stream API

- A Stream is a sequence of elements supporting sequential and parallel aggregate operations.
- Streams do **not store data**, they operate on collections like `List`, `Set`, or arrays.

---

### 🔀 `map()` vs `flatMap()`

| Feature                        | `map()`                                   | `flatMap()`                          |
|--------------------------------|-------------------------------------------|---------------------------------------|
| Input                          | Stream of values                         | Stream of Stream of values           |
| Purpose                        | One-to-One mapping (Transformation)       | One-to-Many mapping (Flattening + Transformation) |
| Output                         | Stream<R>                                 | Stream<R>                            |
| Use-case                       | Simple transformation                    | Transform nested structures to flat structures |

---

### ⚙️ Map-Reduce Pattern

- **Map:** Transforms elements.
- **Reduce:** Aggregates elements into a single result.

Example:
```java
Integer sumResult = Stream.of(2, 4, 6, 9, 1, 3, 7)
                          .reduce(0, (a, b) -> a + b);
