package com.pluralsight;

public class Reservation {
    private String roomType;
    private double price;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        setPrice(roomType);
        calculateReservationTotal();
    }

    private void setPrice(String roomType) {
        if (roomType.equalsIgnoreCase("king")) {
            this.price = 139;
        } else if (roomType.equalsIgnoreCase("double")) {
            this.price = 124;
        }
        if (isWeekend) {
            this.price *= 1.10; // Increase by 10%
        }
    }

    private void calculateReservationTotal() {
        this.reservationTotal = this.price * this.numberOfNights;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
        setPrice(roomType);
        calculateReservationTotal();
    }

    public String getPrice() {
        return String.format("%.2f", price);
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
        calculateReservationTotal();
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
        setPrice(this.roomType);
        calculateReservationTotal();
    }

    public String getReservationTotal() {
        return String.format("%.2f", this.reservationTotal);
    }
}