# SDP-2

The task was to implement two creational design patterns: Factory Method and Abstract Factory using the domain of books. The code followed the cleancode principles, which are meeaningful names, separation of concerns and not hard dependencies in client's code

# Implementation
# Factory Method

The factory Method pattern delegates the creation of objects to subclasses. 
interface Book {
    void printInfo();
}

class Ebook implements Book {
    @Override
    public void printInfo() {
        System.out.println("Ebook");
    }
}

class PrintedBook implements Book {
    @Override
    public void printInfo() {
        System.out.println("PrintedBook");
    }
}

class AudioBook implements Book {
    @Override
    public void printInfo() {
        System.out.println("AudioBook");
    }
}

interface BookFactory{
    Book createBook();
}

class EBookFactory implements BookFactory{
    public Book createBook() {
        return new Ebook();
    }
}

class PrintedBookFactory implements BookFactory{
    public Book createBook() {
        return new PrintedBook();
    }
}

class AudioBookFactory implements BookFactory{
    public Book createBook() {
        return new AudioBook();
    }
}


Client Code:

public class FactoryMethod {
    public static void main(String[] args) {
        BookFactory eBookFactory = new EBookFactory();
        Book eBook = eBookFactory.createBook();
        eBook.printInfo();

        BookFactory printedBookFactory = new PrintedBookFactory();
        Book printed = printedBookFactory.createBook();
        printed.printInfo();

        BookFactory audioFactory = new AudioBookFactory();
        Book audio = audioFactory.createBook();
        audio.printInfo();
    }
}

Output: 
Ebook
PrintedBook
AudioBook


# Abstract Factory

The Abstact Factory pattern creates entire families of related objects:
interface Book {
    void printInfo();
}

interface Cover {
    void printCover();
}

class ClassicBook implements Book {
    public void printInfo() {
        System.out.println("Crime and Punishment");
    }
}

class ClassicCover implements Cover {
    public void printCover() {
        System.out.println("Classic Leather Cover");
    }
}

class ModernBook implements Book {
    public void printInfo() {
        System.out.println("Modern Glossy Cover");
    }
}

class ModernCover implements Cover {
    public void printCover() {
        System.out.println("Modern Glossy Cover");
    }
}

interface LibraryFactory {
    Book createBook();
    Cover createCover();
}

class ClassicLibraryFactory implements LibraryFactory{
    public Book createBook() {
        return new ClassicBook();
    }
    public Cover createCover() {
        return new ClassicCover();
    }
}
class ModernLibraryFactory implements LibraryFactory {
    public Book createBook() {
        return new ModernBook();
    }
    public Cover createCover() {
        return new ModernCover();
    }
}

Client code:
public class AbstractFactory {
    public static void main(String[] args) {
        LibraryFactory classicFactory = new ClassicLibraryFactory();
        Book classicBook = classicFactory.createBook();
        Cover classicCover = classicFactory.createCover();
        classicBook.printInfo();
        classicCover.printCover();


        LibraryFactory modernFactory = new ModernLibraryFactory();
        Book modernBook = modernFactory.createBook();
        Cover modernCover = modernFactory.createCover();
        modernBook.printInfo();
        modernCover.printCover();
    }}

Output:
Crime and Punishment
Classic Leather Cover
Modern Glossy Cover
Modern Glossy Cover

# Conclusion:

By implementing Factory Method and Abstract Factory, I:
Separate object creation from usage.
Make the code flexible and maintainable.
Follow SOLID and Clean Code principles.



