package pl.coderslab.models;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@AllArgsConstructor
@Slf4j
@ToString
@NoArgsConstructor
public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;
    private static Long NEXT_id=1L;

    public Book(String isbn, String title, String author, String publisher, String type) {
        this.id=NEXT_id;
        NEXT_id+=1;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }
}
