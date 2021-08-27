package pl.coderslab.service;

import pl.coderslab.models.Book;

import java.util.ArrayList;
import java.util.List;

public interface BookService<T>{

    List<T> findAll();
    T getById(Long id);
    void update(T t);
    void delete(Long id);
    void add(T t);

}
