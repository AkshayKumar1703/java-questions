hashcode and equals method.md

# HashCode and Equals Mthods

In Java, `hashCode()` and `equals()` are two fundamental methods defined in the base class **Java Platform SE 8 API Specification** (via `java.lang.Object`). They are mainly used to compare objects and are especially important when working with collections like **Java Collections Framework**.

Let’s break it down simply 👇

---

# 1️⃣ What is `equals()`?

### ✅ Purpose:

Used to compare the **logical equality** of two objects.

By default (from `Object` class):

```java
public boolean equals(Object obj)
```

It checks **reference equality** (memory address comparison).

### Example (without overriding):

```java
String a = new String("Hello");
String b = new String("Hello");

System.out.println(a == b);        // false (different memory)
System.out.println(a.equals(b));   // true (same content)
```

`String` overrides `equals()` to compare content instead of memory.

---

# 2️⃣ What is `hashCode()`?

### ✅ Purpose:

Returns an integer value representing the object’s hash code.

```java
public int hashCode()
```

It is mainly used in hash-based collections like:

* `HashMap`
* `HashSet`
* `Hashtable`

These collections use hash codes to store and retrieve objects efficiently.

---

# 3️⃣ Why Do We Need Both?

Because hash-based collections (like `HashMap`) work in **two steps**:

### Step 1: `hashCode()`

Determines the bucket location.

### Step 2: `equals()`

Checks if the exact object matches inside that bucket.

👉 If two objects are equal according to `equals()`, they **must** have the same `hashCode()`.

---

# 4️⃣ The Contract Between `equals()` and `hashCode()`

Java rule:

### ✔ If two objects are equal → they MUST have same hashCode

### ✔ If two objects have same hashCode → they MAY or MAY NOT be equal

If you override `equals()`, you MUST override `hashCode()`.

---

# 5️⃣ Example: Why It Matters

### Without overriding:

```java
class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}
```

Now:

```java
Set<Person> set = new HashSet<>();

set.add(new Person("John"));
set.add(new Person("John"));

System.out.println(set.size());  // Output: 2 ❌
```

Why? Because default `equals()` checks memory reference.

---

# 6️⃣ Correct Implementation

```java
import java.util.Objects;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
```

Now:

```java
Set<Person> set = new HashSet<>();
set.add(new Person("John"));
set.add(new Person("John"));

System.out.println(set.size());  // Output: 1 ✅
```

---

# 7️⃣ When Do We Use Them?

You override them when:

✔ You store objects in `HashSet`
✔ You use objects as keys in `HashMap`
✔ You want logical comparison instead of memory comparison

---

# 8️⃣ Real-World Analogy

Think of:

* `hashCode()` = City name
* `equals()` = Street + House number

First, you go to the correct city (hash).
Then you find the exact house (equals).

---

# 9️⃣ Common Interview Question

❓ What happens if you override `equals()` but not `hashCode()`?

👉 Hash-based collections break.
👉 You may not retrieve objects correctly from `HashMap`.

---

# 🔟 Quick Summary

| Method       | Purpose                                                 |
| ------------ | ------------------------------------------------------- |
| `equals()`   | Checks logical equality                                 |
| `hashCode()` | Returns hash value for hashing collections              |
| Together     | Required for correct behavior in hash-based collections |

