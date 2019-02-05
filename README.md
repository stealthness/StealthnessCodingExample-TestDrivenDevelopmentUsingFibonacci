# Stealthness Coding Example : Test Driven Development Using Fibonacci
The code is to accompany the YouTube video [TDD Using Fibonacci numbers Example](https://youtu.be/1hCt039xASs) 

The is a demonstration of Test Driven Development (TDD) Example, showing that it can be used to develop an algorithm 
that will produce the Fibonacci sequence of numbers.

## What is Test Driven Development?

Is a Software development process and uses short development cycles turning requirement into test cases before code is written.
 It often use a part of an Agile environment when producing software. Principle of Test Driven Development is (Shortened version)
 
 1. Add a new test
 2. Run all Test, but fail the new test
 3. Write code to pass new test.
 4. Run and pass all Test
 5. Refactor code
 
Repeat with new test...

Since the focus is designing tests first from requirement, and writing code to pass the tests leads to less buggy software.

For more information see [Test Driven Development](https://en.wikipedia.org/wiki/Test-driven_development)

## What is a Fibonacci Number?

A fibonacci number is the sum of the two proceeding Fibonacci numbers in the sequence. We can formulate this as 

fib(n) = fib(n-1) + fib(n-2)

with initial values of 

fib(1) = fib(2) = 1

For more in iformation see [Fibonacci Number](https://en.wikipedia.org/wiki/Fibonacci_number )
