package com.practice.jpa.OnetoManyMapping;

import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface PassportRepository extends JpaRepository<Passport, Integer> {
}
