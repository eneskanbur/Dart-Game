# Dart Game

## Description
Dart Game

## Purpose
This program simulates a dart game where darts are thrown at a target with coordinates.

## How to Run
1. Compile the `Dart.java` file using a Java compiler.
2. Run the compiled class file to execute the Dart game simulation.

## Dart Game Rules
- Darts are thrown at a target with coordinates.
- The program calculates the region where each dart lands based on its coordinates.
- Regions:
    - A: Positive x and y, addition of coordinates less than 1.0
    - B: Positive x and y, addition of coordinates greater than 1.0
    - C: Negative x and positive y
    - D: Negative x and y (x < y)
    - E: Negative x and y (x > y)
    - F: Positive x and negative y
    - Undecided: Any other cases

## Statistics
After all darts have been thrown, the program will display statistics showing the number and percentage of darts that landed in each region

## License
This project is licensed under the MIT License - see the LICENSE file for details.
