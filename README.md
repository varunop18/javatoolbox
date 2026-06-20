# JavaToolbox

JavaToolbox is a minimal, dependency-free Java utility library bundling common string and numerical helper methods. It is designed to be easily dropped into any Java project as a Maven dependency.

## Prerequisites
- Java 17 or higher

## Getting Started

### 1. Add Dependency
Add the following snippet to your `pom.xml` dependencies section:

```xml
<dependency>
    <groupId>com.javatoolbox</groupId>
    <artifactId>javatoolbox</artifactId>
    <version>1.0.0</version>
</dependency>
```

*Note: You may need to configure your `settings.xml` to authenticate with GitHub Packages if resolving from GitHub.*

### 2. Usage Examples

**String Utilities:**
```java
import com.javatoolbox.StringUtils;

// Reversing a string
String reversed = StringUtils.reverse("hello"); // "olleh"

// Checking for a palindrome
boolean isPal = StringUtils.isPalindrome("RaceCar"); // true

// Title casing
String title = StringUtils.toTitleCase("hello java world"); // "Hello Java World"
```

**Number Utilities:**
```java
import com.javatoolbox.NumberUtils;
import com.javatoolbox.InvalidInputException;

try {
    // Check if prime
    boolean prime = NumberUtils.isPrime(17); // true

    // Calculate factorial
    long fact = NumberUtils.factorial(5); // 120
    
    // N-th Fibonacci number
    long fib = NumberUtils.fibonacci(10); // 55
} catch (InvalidInputException e) {
    System.err.println("Invalid input: " + e.getMessage());
}

// Greatest Common Divisor
int gcd = NumberUtils.gcd(48, 18); // 6
```

## Links
- **Package Registry:** [GitHub Packages](https://github.com/varunop18/javatoolbox/packages)
- **JAR Download:** See the [Releases](https://github.com/varunop18/javatoolbox/releases/tag/v1.0.0) page

## Course Topic Mapping

| Feature/Decision | Course Topic |
|------------------|--------------|
| `InvalidInputException` custom exception | Exception handling |
| Iterative `fibonacci` over recursive | Algorithm/best-practice tradeoffs |
| Maven `pom.xml` + `mvn package` | Build automation |
| GitHub Packages publish + release tag | Version control & release management |
| JUnit 5 tests | Automated testing |
| Javadoc on all public members | Technical documentation |
