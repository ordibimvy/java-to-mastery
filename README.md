# Shopping Cart

A small console program in Java that asks for an item, its unit price, and a quantity, then prints back the order and the total cost.

Written as a class exercise to practice `Scanner` input, primitive types, and basic arithmetic.

## Requirements

- JDK 8 or newer

## Running it

```bash
javac Main.java
java Main
```

## Example

```
What item would you like ot buy?: apples
What is the price for each?: 1.25
How many would you like? 4

You have bought 4 apples/s
Your total is $5.0
```

## How it works

1. A single `Scanner` wraps `System.in` and is reused for all three inputs.
2. `nextLine()` reads the item name (so spaces in the name are kept), `nextDouble()` reads the price, and `nextInt()` reads the quantity.
3. `total = price * quantity`.
4. The summary is printed with string concatenation, using a `char` variable for the currency symbol.
5. `scanner.close()` releases the underlying stream at the end.

## Known limitations

- **No input validation.** Typing letters at the price or quantity prompt throws an `InputMismatchException` and crashes the program.
- **Money is stored as a `double`.** Totals can print with floating-point noise (`$5.0`, or `$29.970000000000003`). Formatting with `System.out.printf("%.2f", total)` fixes the display; `BigDecimal` fixes the underlying math.
- **Pluralization is faked** with `"/s"` instead of checking whether `quantity > 1`.
- Typo in the first prompt: "ot buy" should be "to buy".
- One item only — no loop, no running cart.
