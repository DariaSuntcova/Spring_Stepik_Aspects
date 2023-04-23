package aop;

import org.springframework.stereotype.Component;

@Component()
public class UniLibrary extends AbstractLibrary {

    public void getBook(Book book) {
        System.out.println("Мы берем книгу " + book.getName() + " из UniLibrary");
    }

    public void returnBook() {
        System.out.println("Мы возвращаем книгу в UniLibrary");
    }

    public void getMagazine(int i) {
        System.out.println("Мы берем журнал из UniLibrary");
    }

}
