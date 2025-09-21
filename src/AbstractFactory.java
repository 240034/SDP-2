package abstractFactory;

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