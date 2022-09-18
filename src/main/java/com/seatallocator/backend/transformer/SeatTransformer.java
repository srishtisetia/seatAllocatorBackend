package com.seatallocator.backend.transformer;

import com.seatallocator.backend.dto.SeatDto;
import com.seatallocator.backend.dto.SeatsInfoDto;
import com.seatallocator.backend.entity.Seat;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SeatTransformer {

    public static SeatsInfoDto seatToSeatInfoTransformer(List<Seat> seats, Map<String,Integer> wMap) {
        List<SeatDto> seatDtos = new ArrayList<>();
        SeatsInfoDto seatsInfoDto = new SeatsInfoDto();
        seatsInfoDto.setDate(seats.get(0).getBookingDate());
        seatsInfoDto.setAvailableSeats(wMap.get("availableSeats"));
        seatsInfoDto.setFloor(seats.get(0).getFloor());
        seatsInfoDto.setWing(seats.get(0).getWing());
        seatsInfoDto.setOffice(seats.get(0).getBuilding());
        seatsInfoDto.setRequestedTeam(seats.get(0).getAllocatedTo());
        seatsInfoDto.setWingCapacity(wMap.get("wingCapacity"));
        for(Seat seat : seats) {
            SeatDto seatDto = new SeatDto();
            seatDto.setSeatNo(seat.getSeatNo());
            seatDto.setAllocatedTo(seat.getAllocatedTo());
            seatDto.setStatus(seat.getBookingStatus());
            seatDto.setAmendRequestBy(seat.getAmendRequestBy() != null ?seat.getAmendRequestBy() : null);

            seatDtos.add(seatDto);
        }
        seatsInfoDto.setSeats(seatDtos);
        return seatsInfoDto;
    }
}
