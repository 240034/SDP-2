package factorymethod;

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