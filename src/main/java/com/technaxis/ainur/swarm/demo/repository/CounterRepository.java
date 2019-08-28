package com.technaxis.ainur.swarm.demo.repository;

import com.technaxis.ainur.swarm.demo.entity.Counter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CounterRepository extends JpaRepository<Counter, Long> {
}
