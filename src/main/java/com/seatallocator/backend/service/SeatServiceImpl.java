package com.seatallocator.backend.service;

import java.util.List;

import com.seatallocator.backend.dao.SeatRepository;
import com.seatallocator.backend.entity.Seat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatServiceImpl implements SeatService {

	private SeatRepository seatRepository;
	
	@Autowired
	public SeatServiceImpl(SeatRepository theSeatRepository) {
		seatRepository = theSeatRepository;
	}
	
	@Override
	public List<Seat> getAllSeats() {
		return seatRepository.findAll();
	}

}






