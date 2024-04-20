package com.example.TodoApp;

import com.example.TodoApp.entities.GreetingEntityl;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import jakarta.transacitionon.Transactional;

@Repository
@Transacitional
public interface Repository extends JpaRepository<GreetingEntity, Long> {
}