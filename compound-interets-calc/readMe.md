# Compound Interest Calculator

A small Java console program that calculates how much a principal grows over time under compound interest. Written as a practice exercise while working through Java fundamentals.

## What it does

Takes four inputs from the user and prints the final balance:

| Input | Meaning |
|---|---|
| Principal | Starting amount |
| Interest rate | Annual rate, entered as a percent (e.g. `5` for 5%) |
| Times compounded per year | 1 = annually, 4 = quarterly, 12 = monthly |
| Years | Length of the investment |

## The formula

```
A = P(1 + r/n)^(nt)
```

- `A` — final amount
- `P` — principal
- `r` — annual rate as a decimal
- `n` — compounding periods per year
- `t` — years

In code:

```java
amount = principal * Math.pow(1 + rate / times_compounded, times_compounded * years);
```

## Concepts demonstrated

- Reading typed user input with `Scanner` (`nextDouble()`, `nextInt()`)
- Primitive types and where `double` vs `int` matters
- Implicit type promotion — `rate / times_compounded` is `double / int`, so Java widens the int and performs floating-point division
- `Math.pow()` for exponentiation
- Formatted output with `printf` and format specifiers (`%d`, `%.2f`)
- Closing a resource when you're done with it

## Running it

```bash
javac calc.java
java calc
```

## Sample run

```
Enter the principal amount: 1000
Enter the interest rate (in %): 5
Enter the # of times compounded per year: 12
Enter the # of years: 10
The amount after 10 years is $1647.01
```

Another, with quarterly compounding:

```
Enter the principal amount: 5000
Enter the interest rate (in %): 7.5
Enter the # of times compounded per year: 4
Enter the # of years: 5
The amount after 5 years is $7249.74
```

## Known limitations

This is a concept demo, not production code. It deliberately skips:

- **Input validation.** Negative or zero values are accepted. Entering `0` for times compounded doesn't crash — floating-point division by zero yields `Infinity`, and `Math.pow(Infinity, 0)` is `1.0`, so the program silently reports no growth.
- **Error handling.** Non-numeric input throws an uncaught `InputMismatchException`.
- **Re-prompting.** One pass only; a bad entry ends the run.
- **Currency precision.** Uses `double`, which is fine for a display estimate but not for real financial math — `BigDecimal` is the correct tool there.
- **Locale.** `Scanner` uses the default locale, so decimal separators vary by system.

## Possible extensions

- Show interest earned (`amount - principal`) alongside the total
- Add regular contributions (future value of an annuity)
- Support continuous compounding via `Math.exp()`
- Print a year-by-year growth table
