package com.seatallocator.backend.dao;

import com.seatallocator.backend.entity.Negotiate;
import org.springframework.data.jpa.repository.JpaRepository;


public interface NegotiateRepository extends JpaRepository<Negotiate, Integer> {
}
