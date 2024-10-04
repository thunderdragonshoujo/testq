# Hello World Project

This project contains simple "Hello World" programs in Go and Java.

## Project Structure

- `hello.go`: Go implementation of Hello World
- `HelloWorld.java`: Java implementation of Hello World
- `pom.xml`: Maven configuration file for the Java project

## How to Run

### Go

To run the Go program:

```
go run hello.go
```

### Java

To compile and run the Java program:

```
javac HelloWorld.java
java HelloWorld
```

Or using Maven:

```
mvn compile
mvn exec:java -Dexec.mainClass="HelloWorld"
```

## Git Repository

This project is version controlled using Git. The `.gitignore` file is set up to exclude common build artifacts and IDE-specific files.

To clone this repository:

```
git clone <repository-url>
```

Replace `<repository-url>` with the actual URL of your Git repository.