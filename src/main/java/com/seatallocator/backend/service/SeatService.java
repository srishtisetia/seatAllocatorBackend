package com.seatallocator.backend.service;

import java.util.List;

import com.seatallocator.backend.entity.Seat;
import org.springframework.web.multipart.MultipartFile;

public interface SeatService {

	public List<Seat> getAllSeats();
}
