package com.spring.hrworker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.hrworker.entities.Worker;
import com.spring.hrworker.repositories.WorkerRepository;

@Service
public class WorkerService {

	@Autowired
	private WorkerRepository repository;
	
	public List<Worker> findAll(){
		List<Worker> list = repository.findAll();
		return list;
	}
	
	public Worker findById(Long id) {
		Worker obj = repository.findById(id).get();
		return obj;
	}
}
