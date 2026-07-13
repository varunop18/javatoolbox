# JavaToolbox — Assignment 1 Submission

**Student:** Varun Rathod
**Course:** CST8411 — Information Systems Development and Deployment
**Assignment:** Deployable JAR (10%)

---

## 1. Library Description

**JavaToolbox** is a minimal, dependency-free Java utility library that bundles common string and number helper methods. It can be dropped into any Java project as a Maven dependency or run standalone via its built-in demo.

**Package:** `com.javatoolbox`
**Classes:**
- `StringUtils` — reverse, isPalindrome, countWords, toTitleCase
- `NumberUtils` — isPrime, factorial, gcd, fibonacci
- `InvalidInputException` — custom checked exception for invalid mathematical inputs

---

## 2. Prerequisites

- **JDK 17** or higher (LTS recommended)
- **Apache Maven 3.8+** (for building from source)

---

## 3. Maven Dependency

Add the following to your `pom.xml`:

```xml
<dependency>
    <groupId>com.javatoolbox</groupId>
    <artifactId>javatoolbox</artifactId>
    <version>1.0.0</version>
</dependency>
```

*Note: Configure `settings.xml` for GitHub Packages authentication if resolving from the remote repository.*

---

## 4. Worked Examples

### Example 1: String Utilities

```java
import com.javatoolbox.StringUtils;

public class StringDemo {
    public static void main(String[] args) {
        String text = "hello world";

        System.out.println("Reversed: " + StringUtils.reverse(text));
        System.out.println("Palindrome check: " + StringUtils.isPalindrome("RaceCar"));
        System.out.println("Word count: " + StringUtils.countWords("one two three"));
        System.out.println("Title case: " + StringUtils.toTitleCase("hello java world"));
    }
}
```

**Expected Output:**
```
Reversed: dlrow olleh
Palindrome check: true
Word count: 3
Title case: Hello Java World
```

### Example 2: Number Utilities

```java
import com.javatoolbox.NumberUtils;
import com.javatoolbox.InvalidInputException;

public class NumberDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Is 17 prime? " + NumberUtils.isPrime(17));
            System.out.println("5! = " + NumberUtils.factorial(5));
            System.out.println("Fib(10) = " + NumberUtils.fibonacci(10));
        } catch (InvalidInputException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("GCD(48, 18) = " + NumberUtils.gcd(48, 18));
    }
}
```

**Expected Output:**
```
Is 17 prime? true
5! = 120
Fib(10) = 55
GCD(48, 18) = 6
```

### Example 3: Standalone JAR Execution

```bash
java -jar javatoolbox-1.0.0.jar
```

**Expected Output:**
```
=========================================
       JavaToolbox Library Demo
=========================================

--- StringUtils ---
Original String: 'hello world java'
Reversed: 'avaj dlrow olleh'
Title Cased: 'Hello World Java'
Word Count: 3
Is 'A man a plan a canal Panama' a palindrome? true

--- NumberUtils ---
Is 7 prime? true
7 factorial is: 5040
GCD of 48 and 18 is: 6
Fibonacci number at index 10 is: 55

=========================================
```

---

## 5. Published Package and JAR

| Item | Link |
|------|------|
| **GitHub Package** | https://github.com/varunop18/javatoolbox/packages |
| **JAR Download (Release)** | https://github.com/varunop18/javatoolbox/releases/tag/v1.0.0 |
| **Source Repository** | https://github.com/varunop18/javatoolbox |

---

## 6. Course Topic Mapping

| Feature / Decision | Course Topic |
|--------------------|--------------|
| `InvalidInputException` custom exception | Exception handling — checked exception with descriptive messages for mathematically invalid inputs |
| Iterative `fibonacci` over recursive | Algorithm/best-practice tradeoffs — avoids StackOverflowError on large inputs, constant space |
| Maven `pom.xml` + `mvn package` | Build automation — automated compilation, testing, and JAR packaging |
| GitHub Packages publish + release tag | Version control & release management — tagged v1.0.0 release with JAR asset |
| JUnit 5 tests | Automated testing — 9 tests covering all public methods plus edge cases |
| Javadoc on all public members | Technical documentation — every public class and method has complete Javadoc |

---

## 7. Build and Test Verification

```bash
mvn clean package
```

**Result:** BUILD SUCCESS — 9 tests run, 0 failures, 0 errors.

---

*End of submission document.*
