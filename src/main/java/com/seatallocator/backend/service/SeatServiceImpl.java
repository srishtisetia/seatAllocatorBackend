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

	@Override
	public Seat addSeat(Seat s) {
		return seatRepository.save(s);
	}

	@Override
	public void delete(Seat s) {
		 seatRepository.delete(s);
	}

}






