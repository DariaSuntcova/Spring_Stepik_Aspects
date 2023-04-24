package aop;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class Book {
    @Value("Малыш и Карлсон")
    private String name;
    @Value("Астрид Линдгрен")
    private String author;
    @Value("1955")
    private int yearOfPublication;

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
