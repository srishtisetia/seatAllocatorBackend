package com.seatallocator.backend.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.seatallocator.backend.dao.SeatRepository;
import com.seatallocator.backend.dao.WingRepository;
import com.seatallocator.backend.entity.Seat;
import com.seatallocator.backend.entity.Wing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatServiceImpl implements SeatService {

	private SeatRepository seatRepository;
	
	@Autowired
	public SeatServiceImpl(SeatRepository theSeatRepository) {
		seatRepository = theSeatRepository;
	}

	@Autowired
	private WingRepository wingRepository;
	@Override
	public List<Seat> getAllSeats(Date date, String buildingName,
								  int floor, String wing, String managerName) {
		List<Seat> allSeats = seatRepository.findAll();
		return allSeats.stream().filter(seat -> seat.getBookingDate().equals(date) &&
				seat.getFloor() == floor && seat.getWing().equals(wing)
				&& seat.getBuilding().equals(buildingName)
				&& seat.getAllocatedTo().equals(managerName)).collect(Collectors.toList());

	}
	@Override
	public Map<String,Integer> getWingCapacityAndAvailableSeats(List<Seat> seats, String buildingName,
																int floor, String wing) {

		HashMap<String,Integer> wingMap = new HashMap<>();
		List<Integer> wingCapacity = wingRepository.findAll().stream().
				filter(w -> w.getBuilding().equals(buildingName)
				&& w.getFloor() == floor && w.getWing().equals(wing))
				.map(Wing::getWingCapacity).collect(Collectors.toList());

		int availableSeats = SeatHelper.getAvailableSeats(wingCapacity.get(0), seats);
		wingMap.put("wingCapacity",wingCapacity.get(0));
		wingMap.put("availableSeats",availableSeats);
		return wingMap;
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






