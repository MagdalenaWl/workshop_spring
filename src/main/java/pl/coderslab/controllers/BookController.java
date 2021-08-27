package pl.coderslab.controllers;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import pl.coderslab.models.Book;
import pl.coderslab.service.BookService;
import java.util.List;

@RestController
@RequestMapping("/books")
@Slf4j
public class BookController {
    BookService service;

    public BookController(BookService service) {
        this.service = service;
        service.add(new Book("8371808372", "Trzy wiedźmy", "Terry Pratchett", " Prószyński i S-ka", "fantasy"));
        service.add(new Book("9788374696975", "Straż nocna", "Terry Pratchett", " Prószyński i S-ka", "fantasy"));
        service.add(new Book("9788374695039", "Prawda", "Terry Pratchett", " Prószyński i S-ka", "fantasy"));
        service.add(new Book("838686852X", "Mort", "Terry Pratchett", " Prószyński i S-ka", "fantasy"));
        service.add(new Book("9788376482149", "Kosiarz", "Terry Pratchett", " Prószyński i S-ka", "fantasy"));
    }



    @GetMapping("")
    public List<Book> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Book getById(@PathVariable Long id) {
        return (Book) service.getById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping("")
    public void add(@RequestParam String isbn, @RequestParam String title, @RequestParam String author, @RequestParam String publisher, @RequestParam String type) {
        service.add(new Book(isbn, title, author, publisher, type));
    }


    @PutMapping(value="", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Book book)  {
        service.update(book);
    }



}


