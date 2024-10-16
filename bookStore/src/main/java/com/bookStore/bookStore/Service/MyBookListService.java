package com.bookStore.bookStore.Service;

import com.bookStore.bookStore.Entity.MyBookList;
import com.bookStore.bookStore.Repository.MyBookListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {
    @Autowired
    private MyBookListRepository myBook;
    public void saveMyBooks (MyBookList book)
    {
     myBook.save(book);
    }
    public List<MyBookList> getAllMyBooks(){
        return myBook.findAll();
    }

    public void deleteById(int id) {
        myBook.deleteById(id);
    }
}
