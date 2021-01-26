package homework.homework11;

import lombok.*;

import java.math.BigDecimal;


@Setter
@Getter
@EqualsAndHashCode
@ToString
public class Seat {
    private String seatNumber;
    private boolean reserved;
    private BigDecimal price;

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
        this.reserved = false;
        this.price = new BigDecimal(25.5);
    }

    public void reserveSeat() throws Exception {
        if (this.reserved == true) {
            throw new Exception("This seat has been already reserved");
        } else {
            this.reserved = true;
            System.out.println("Seat is reserved");
        }
    }
}