package com.travel.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.travel.models.Expense;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long>{

	List<Expense> findAll();
	List<Expense> findByDescription(String search);
	
}
