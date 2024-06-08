# BitDec: Binary, Decimal, and Hexadecimal Converter

## Introduction

BitDec is a command-line interface (CLI) application written in Java for converting numbers between binary, decimal, and hexadecimal formats. This project aims to facilitate learning about numerical conversions and Java programming. It provides a simple and intuitive interface for users to perform various numerical transformations, making it a useful tool for students and developers alike.

## Features

* Convert binary numbers to decimal.
* Convert decimal numbers to binary.
* Convert binary numbers to hexadecimal.
* Simple but working CLI interface

o run this project, you'll need a Java Development Kit (JDK) installed on your system. The project was developed using the latest JDK available at the time, so it should work with recent versions.

## Project Structure

The project consists of the following files:

* BitDec.java: Contains the main logic and CLI menus.
* Converter.java: Implements the conversion functionality.
* interfacer.java: Handles user interaction and displays menus

## Instructions

1. Clone the repository:

```sh
git clone https://github.com/yourusername/BitDec.git
```

2. Navigate to the project directory:

```sh
cd BitDec
```

3. Compile the code:

```sh
javac BitDec.java Converter.java Interfacer.java
```

4. Run the program:

```sh
java BitDec
```

## How it Works

When you run the program, you'll see the main menu with options for different types of conversions, selected by numeric characters.

### Main Menu Options

1. Binary to Decimal: Convert a binary number to its decimal equivalent.
2. Decimal to Binary: Convert a decimal number to its binary equivalent.
3. Binary to Hexadecimal: Convert a binary number to its hexadecimal equivalent.
4. Exit Program: Close the application.

### Binary to Decimal

* Select "Binary to Decimal" from the main menu.
* Enter a binary number when prompted.
* The program will display the decimal equivalent.

### Decimal to Binary

* Select "Decimal to Binary" from the main menu.
* Enter a decimal number when prompted.
* The program will display the binary equivalent.

### Binary to Hexadecimal

* Select "Binary to Hexadecimal" from the main menu.
* Enter a binary number when prompted.
* The program will display the hexadecimal equivalent.

## Examples

### Binary to Decimal

```sh
Main Menu:
1. Binary to Decimal
2. Decimal to Binary
3. Binary to Hexadecimal
4. Exit Program
Enter choice: 1

Input a binary number: 1010
Decimal value: 10
```

### Decimal to Binary

```sh
Main Menu:
1. Binary to Decimal
2. Decimal to Binary
3. Binary to Hexadecimal
4. Exit Program
Enter choice: 2

Input a decimal number: 10
Binary value: 1010
```

### Binary to Hexadecimal

```sh
Main Menu:
1. Binary to Decimal
2. Decimal to Binary
3. Binary to Hexadecimal
4. Exit Program
Enter choice: 3

Input a binary number: 1010
Hexadecimal value: A
```

## About the Use of this Project

This project is not intended for contributions, but you are free to use the code for your own projects. In accordance with the MIT License, I grant everyone the freedom to use this code for any beneficial purpose.