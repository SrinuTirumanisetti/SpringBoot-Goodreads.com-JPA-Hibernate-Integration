package com.example.goodreads.service;

import com.example.goodreads.repository.BookRepository;
import com.example.goodreads.repository.BookJpaRepository;
import com.example.goodreads.model.Book;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class BookJpaService implements BookRepository {

    @Autowired
    private BookJpaRepository bookJpaRepository;

    @Override
    public ArrayList<Book> getBooks() {
        List<Book> bookList = bookJpaRepository.findAll();
        return new ArrayList<>(bookList);
    }

    @Override
    public Book getBookById(int bookId){
        return new Book(3,"sample book","sample.png");
    }

    @Override
    public Book addBook(Book book){
        return new Book(3,"sample book","sample.png");
    }

    @Override
    public Book updateBook(int bookId,Book book){
        return new Book(3,"sample book","sample.png");
    }

    @Override
    public void deleteBook(int bookId){

    }
}