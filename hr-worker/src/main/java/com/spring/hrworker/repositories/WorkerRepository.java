package com.spring.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long>{
}
