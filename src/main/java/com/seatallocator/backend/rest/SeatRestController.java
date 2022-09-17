package com.seatallocator.backend.rest;

import java.util.List;

import com.seatallocator.backend.entity.Seat;
import com.seatallocator.backend.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class SeatRestController {

	private final SeatService seatService;
	
	@Autowired
	public SeatRestController(SeatService theSeatService) {
		seatService = theSeatService;
	}

	@GetMapping("/seat")
	public List<Seat> getAllSeats() {
		return seatService.getAllSeats();
	}

}










