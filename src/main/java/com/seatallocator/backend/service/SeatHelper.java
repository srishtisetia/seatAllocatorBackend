package com.seatallocator.backend.service;

import com.seatallocator.backend.entity.Seat;

import java.util.List;

public class SeatHelper {

    static int getAvailableSeats(int wingCapacity, List<Seat> seats) {
        int availableSeats = (int) seats.stream().filter(s -> s.getBookingStatus().equals("A")).count();
        return availableSeats;
    }
}
