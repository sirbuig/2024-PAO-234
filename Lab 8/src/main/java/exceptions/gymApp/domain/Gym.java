package exceptions.gymApp.domain;

import java.time.LocalTime;

public class Gym {

    public static final LocalTime startTime = LocalTime.of(9, 0);
    public static final LocalTime endTime = LocalTime.of(23, 0);
    private int totalSeats;
    private int bookedSeats;

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        if (totalSeats <= 0) {
            throw new IllegalArgumentException();
        }
        this.totalSeats = totalSeats;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
