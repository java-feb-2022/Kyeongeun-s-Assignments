package com.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findAll();
	List<Book> findByBorrowerIsNull();
	//List<Book> findByBorrower(Long id); it does not work!!!!
	List<Book> findByBorrower_id(Long id);
}
