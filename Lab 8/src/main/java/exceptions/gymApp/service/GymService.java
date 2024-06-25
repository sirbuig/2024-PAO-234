package exceptions.gymApp.service;

import exceptions.gymApp.domain.Gym;
import exceptions.gymApp.domain.Member;
import exceptions.gymApp.exception.GymAccessDeniedException;
import exceptions.gymApp.exception.GymClosedException;
import exceptions.gymApp.exception.GymOvercrowdedException;

import java.time.LocalTime;

public class GymService {

    private final Gym gym;

    public GymService(int capacity) {
        this.gym = new Gym();
        gym.setTotalSeats(capacity);
        gym.setBookedSeats(100);
    }

    public void bookSeatAtClass(Object object) throws GymClosedException, GymAccessDeniedException {

        if (object instanceof Member) {
            if (LocalTime.now().isAfter(Gym.startTime) && LocalTime.now().isBefore(Gym.endTime)) {
                if (gym.getBookedSeats() <= gym.getTotalSeats()) {
                    gym.setBookedSeats(gym.getBookedSeats() + 1);
                } else {
                    throw new GymOvercrowdedException();
                }
            } else {
                throw new GymClosedException();
            }
        } else {
            throw new GymAccessDeniedException();
        }
    }

    public int getBookedSeats() {
        return gym.getBookedSeats();
    }
}
