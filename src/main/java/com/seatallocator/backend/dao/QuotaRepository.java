package com.seatallocator.backend.dao;

import com.seatallocator.backend.entity.Quota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuotaRepository extends JpaRepository<Quota, Integer> {
}
