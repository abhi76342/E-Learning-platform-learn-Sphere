package com.learnSphere.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learnSphere.entity.Lession;

@Repository
public interface StudentRepository extends JpaRepository<Lession, Integer> {

	Optional<Lession> findById(int lessionId);

}
