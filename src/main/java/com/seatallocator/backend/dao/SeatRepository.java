package com.seatallocator.backend.dao;

import com.seatallocator.backend.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Integer> {


}
