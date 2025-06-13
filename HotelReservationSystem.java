import java.util.*;
class Room{
    int roomNumber;
    String category;
    double price;
    boolean isBooked;

    Room(int roomNumber,String category,double  price){
        this.roomNumber=roomNumber;
        this.category=category;
        this.price = price;
        this.isBooked = isBooked;
    
    }
    @Override
    public String toString(){
        return "Room #" + roomNumber + "[" + category + "]- Rs."+price + " - "+(isBooked ? "Booked" : "Available");
    }
}
class Booking{
    
}

public class HotelReservationSystem {
    
}
