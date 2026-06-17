# Employee Payroll Report Program Explanation

## Overview

This Java program demonstrates the use of **inheritance**, **polymorphism**, **ArrayList**, and **file handling**. It creates different types of employees, calculates their pay using overridden methods, and saves the payroll information to a text file.

---

## Class: Employee

```java
public class Employee {

    public double calculatePay() {
        return 0;
    }
}
```

The `Employee` class acts as the superclass for all employee types. It contains a method named `calculatePay()` that returns `0`. This method is intended to be overridden by subclasses that provide their own pay calculation logic.

---

## Class: Contractor

```java
class Contractor extends Employee {

    public double calculatePay() {
        return 2500;
    }
}
```

The `Contractor` class inherits from `Employee`. It overrides the `calculatePay()` method and returns a fixed payment of **$2500**.

---

## Class: FullTime

```java
public class FullTime extends Employee {

    public double calculatePay() {
        return 5000;
    }
}
```

The `FullTime` class also inherits from `Employee`. It overrides the `calculatePay()` method and returns a fixed salary of **$5000**.

---

## Main Class

```java
ArrayList<Employee> staff = new ArrayList<>();
```

An `ArrayList` named `staff` is created to store employee objects. The list uses the superclass type `Employee`, allowing different employee subclasses to be stored in the same collection.

### Adding Employees

```java
staff.add(new FullTime());
staff.add(new Contractor());
```

Two employee objects are added to the list:

- One `FullTime` employee
- One `Contractor` employee

---

## File Writing

```java
BufferedWriter writer =
        new BufferedWriter(new FileWriter("payroll_report.txt"));
```

A `BufferedWriter` is created to write payroll information to a file named `payroll_report.txt`.

### Writing Payroll Data

```java
for (Employee e : staff) {
    writer.write("Pay: $" + e.calculatePay());
    writer.newLine();
}
```

The program loops through each employee in the `staff` list.

Because of **polymorphism**, the correct version of `calculatePay()` is called based on the actual object type:

- `FullTime` → `$5000`
- `Contractor` → `$2500`

Each payment is written to the file on a separate line.

---

## Closing the File

```java
writer.close();
```

The file is closed after all data has been written, ensuring that the information is saved properly.

---

## Exception Handling

```java
catch (Exception e) {
    System.out.println("Error writing file.");
}
```

The `try-catch` block handles any errors that may occur while creating or writing to the file. If an error occurs, the program displays an error message instead of crashing.

---

## Expected Output in payroll_report.txt

```text
Pay: $5000.0
Pay: $2500.0
```

### Console Output

```text
Report saved.
```

---

## OOP Concepts Demonstrated

### Inheritance
- `Contractor` and `FullTime` inherit from the `Employee` class.

### Method Overriding
- Both subclasses provide their own implementation of `calculatePay()`.

### Polymorphism
- The `Employee` reference type can store different employee objects and call the appropriate `calculatePay()` method at runtime.

### File Handling
- `BufferedWriter` and `FileWriter` are used to create and write payroll data to a text file.

---

## Conclusion

This program is a simple payroll reporting system that uses object-oriented programming principles and file handling. Different employee types calculate their pay through overridden methods, while polymorphism allows them to be managed through a single `Employee` reference type. The payroll information is then written to a text file for record keeping.