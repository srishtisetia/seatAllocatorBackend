package com.seatallocator.backend.dao;

import com.seatallocator.backend.entity.Allocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AllocationRepository extends JpaRepository<Allocation, Integer> {
}
