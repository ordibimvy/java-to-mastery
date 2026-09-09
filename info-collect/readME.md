# MHIR Health Database — Basic Patient Info Collector

A small console Java program that prompts a user for basic patient information and prints it back as a formatted summary.

**File:** `Lecture3ClassAct.java`

## What it does

1. Greets the user
2. Collects:
   - Full name
   - Birth day, birth month, birth year
   - Phone number (10 digits)
   - Email address
3. Prints the collected information back to the console
4. Closes the `Scanner`

## Requirements

- Java JDK 8 or newer

## How to run

```bash
javac Lecture3ClassAct.java
java Lecture3ClassAct
```

## Example session

```
Welcome to the MHIR Health Database.
Enter your name: Ordi K
What day are you born in?: 14
What month are you born in?: March
What year are you born in?: 2001
What is your phone number (10 digits): 2075550123
What is your email address?: ordi@example.com

Thank you, your information has been saved in our Database
Name: Ordi K
Date of Birth: 14/March/2001
Phone Number: 2075550123
Email Address: ordi@example.com
Thank you once again for trusting MHIR
```

## Concepts practiced

- `Scanner` input (`nextLine()`, `next()`, `nextInt()`)
- Primitive vs. reference types (`int` vs. `String`)
- String concatenation for output formatting
- Closing resources

## Known limitations

- No input validation — non-numeric input where a number is expected will crash the program.
- Data is not actually persisted; "saved in our Database" only means printed to the console.
- Phone number is stored as an `int`, which cannot hold most real 10-digit US numbers.
