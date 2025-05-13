# SOLID Principles Practice

This repository contains practice implementations of the SOLID principles through various scenarios. Each implementation demonstrates how to apply these principles to create clean, maintainable, and extensible code.

## What are SOLID Principles?

SOLID is an acronym that represents five principles of object-oriented design that help developers create more maintainable, flexible, and scalable software:

1. **S - Single Responsibility Principle (SRP)**
   - A class should have only one reason to change
   - Each class should have a single responsibility or purpose

2. **O - Open/Closed Principle (OCP)**
   - Software entities should be open for extension but closed for modification
   - You should be able to add new functionality without changing existing code

3. **L - Liskov Substitution Principle (LSP)**
   - Objects of a superclass should be replaceable with objects of a subclass without affecting the correctness of the program
   - Subtypes must be substitutable for their base types

4. **I - Interface Segregation Principle (ISP)**
   - Clients should not be forced to depend on interfaces they do not use
   - Many specific interfaces are better than one general-purpose interface

5. **D - Dependency Inversion Principle (DIP)**
   - High-level modules should not depend on low-level modules; both should depend on abstractions
   - Abstractions should not depend on details; details should depend on abstractions

## Practice Scenarios

### Scenario 1: Report Generator (Easy)
A system that demonstrates how to separate responsibilities for:
- Managing report data (title, content)
- Printing reports to console
- Saving reports to files

**Focus**: Single Responsibility Principle

### Scenario 2: Employee Management (Medium)
A system for managing employees that separates responsibilities for:
- Employee data management (name, position, salary)
- Bonus calculations
- Database persistence
- Report generation

**Focus**: Single Responsibility Principle with a more complex domain

### Scenario 3: Online Order Processing (Harder)
An order processing system that separates responsibilities for:
- Order management (products, amounts)
- Discount application logic
- Payment processing (different payment methods)
- Customer communication

**Focus**: Single Responsibility Principle in a complex business scenario

## Repository Structure

Each scenario is implemented in its own directory with both the "before" implementation (violating principles) and the "after" implementation (following principles).

## Getting Started

1. Clone this repository
2. Navigate to any scenario directory
3. Review the code and compare the before/after implementations
4. Run the examples to see the differences in action

## Contributing

Feel free to add your own examples or improvements to existing scenarios by submitting a pull request.
