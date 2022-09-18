package com.seatallocator.backend.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.seatallocator.backend.entity.Seat;
import org.springframework.web.multipart.MultipartFile;

public interface SeatService {

	public List<Seat> getAllSeats(Date date, String buildingName,
								  int floor, String wing, String managerName);

	Map<String,Integer> getWingCapacityAndAvailableSeats(List<Seat> seats, String buildingName,
														 int floor, String wing);

	Seat addSeat(Seat s);
	void delete(Seat s);
}
