package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        //test room class
        Room room = new Room(2, 150.0, true, false, true);
        System.out.println("Room Details:");
        System.out.println("Number of Beds: " + room.getNumberOfBeds());
        System.out.println("Price: $" + room.getPrice());
        System.out.println("Occupied: " + room.isOccupied());
        System.out.println("Dirty: " + room.isDirty());
        System.out.println("Available: " + room.isAvailable());
        System.out.println();


        //test reservation class
        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("Reservation Details:");
        System.out.println("Room Type: " + reservation.getRoomType());
        System.out.println("Price per Night: $" + reservation.getPrice());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Total Reservation Cost: $" + reservation.getReservationTotal());
        System.out.println();

        //test employee class
        Employee employee = new Employee(1, "John Doe", "Engineering", 25.0, 45);
        System.out.println("Employee Details:");
        System.out.println("Employee Name: " + employee.getEmployeeName());
        System.out.println("Pay Rate: $" + employee.getPayRate());
        System.out.println("Hours Worked: " + employee.getHoursWorked());
        System.out.println("Regular Hours: " + employee.getRegularHours());
        System.out.println("Overtime Hours: " + employee.getOvertimeHours());
        System.out.println("Total Pay: $" + employee.calculatePay());
    }
}
