package com.domitory.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domitory.models.Dormitory;

@Repository
public interface DormitoryRepository extends CrudRepository<Dormitory, Long> {
	List<Dormitory> findAll();

}
