# Report Generator SOLID Principles Example

This project demonstrates the application of SOLID principles in a simple report generator system.

## How to Build and Run

Make sure you have Java 17 and Maven installed.

### Building the Project

From within the `report-generator` directory, run:

```bash
mvn clean install
```

This will compile the project and create the target directory within the project folder.

### Running the Application

From within the `report-generator` directory, run:

```bash
mvn exec:java -Dexec.mainClass="com.solid.report.Main"
```

## Project Structure

The project follows SOLID principles:

1. **Single Responsibility Principle (SRP)**:
   - `Report` class only holds data
   - `ConsoleReportPrinter` only handles printing
   - `FileReportSaver` only handles saving to file

2. **Open/Closed Principle (OCP)**:
   - The system is open for extension but closed for modification

3. **Liskov Substitution Principle (LSP)**:
   - Implementations of interfaces can be substituted without affecting behavior

4. **Interface Segregation Principle (ISP)**:
   - Separate interfaces for different responsibilities

5. **Dependency Inversion Principle (DIP)**:
   - High-level modules depend on abstractions, not concrete implementations 