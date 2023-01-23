package edu.livia.secao15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private static final SimpleDateFormat SIMPLE_DATE = new SimpleDateFormat("dd/MM/yyyy");
    private final Integer ROOM_NUMBER;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer ROOM_NUMBER, Date checkIn, Date checkOut) {
        this.ROOM_NUMBER = ROOM_NUMBER;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public long duration(){
        long difference = checkOut.getTime() - checkIn.getTime(); // Calculated in milliseconds
        return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut){
        Date now = new Date();

        if(checkIn.before(now) || checkOut.before(now)){
            return "Reservation dates for update must be future dates.";
        }

        if(!checkOut.after(checkIn)){
            return "Check-out date must be after check-in date.";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;

        return null;
    }

    @Override
    public String toString(){
        return "Room " + ROOM_NUMBER + ", "
                + "check-in: " + SIMPLE_DATE.format(checkIn) + ", "
                + "check-out: " + SIMPLE_DATE.format(checkOut) + ", "
                + duration() + " nights";
    }
}
