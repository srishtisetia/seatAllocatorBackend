package com.seatallocator.backend.rest;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.seatallocator.backend.dto.SeatsInfoDto;
import com.seatallocator.backend.entity.Seat;
import com.seatallocator.backend.service.SeatService;
import com.seatallocator.backend.transformer.SeatTransformer;
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
	public SeatsInfoDto getAllSeats(Date date, String buildingName,
									int floor, String wing, String managerName) {
		List<Seat> seats = seatService.getAllSeats(date,buildingName,floor,wing,managerName);
		Map<String,Integer> wMap = seatService.getWingCapacityAndAvailableSeats(seats,buildingName,floor,wing);
		return SeatTransformer.seatToSeatInfoTransformer(seats,wMap);
	}

}










