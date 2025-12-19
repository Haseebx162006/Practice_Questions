public class Seat {
    private int SeatNumber;
    private boolean isBooked=false;

    public int getSeatNumber() {
        return SeatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        SeatNumber = seatNumber;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        this.isBooked = booked;
    }
}
