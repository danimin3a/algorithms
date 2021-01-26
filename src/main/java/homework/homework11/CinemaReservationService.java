package homework.homework11;

import java.util.Iterator;

public class CinemaReservationService {
    public static void main(String[] args) throws Exception {

        Cinema ODEON = new Cinema("Odeon");
        ODEON.getSeats().stream()
                .forEach(System.out::println);
        System.out.println();

        System.out.println("=== reserve seat A4 ===");
        reserveSeatInCinema(ODEON, "A4");
        //try to reserve a taken seat
        try {
            reserveSeatInCinema(ODEON, "A4");
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("=== reserve multiple seats ===");
        reserveSeatInCinema(ODEON, "A2");
        reserveSeatInCinema(ODEON, "A5");
        reserveSeatInCinema(ODEON, "C5");
        reserveSeatInCinema(ODEON, "D5");

        System.out.println("=== Cancel reservation for D5 ===");
        cancelReservationInCinema(ODEON, "D5");

        System.out.println("=== reserve again D5 ===");
        reserveSeatInCinema(ODEON, "D5");

        showReservedSeats(ODEON);


    }

    private static void showReservedSeats(Cinema cinema) {
        cinema.getSeats().stream()
                .filter(seat -> seat.isReserved() == true)
                .forEach(System.out::println);
    }

    private static void reserveSeatInCinema(Cinema cinema, String seatNo) throws Exception {
        Iterator<Seat> itr = cinema.getSeats().iterator();
        while (itr.hasNext()) {
            Seat next = itr.next();
            if (next.getSeatNumber().equals(seatNo)) {
                next.reserveSeat();
            }
        }
    }

    private static void cancelReservationInCinema(Cinema cinema, String seatNo) {
        Iterator<Seat> itr = cinema.getSeats().iterator();
        while (itr.hasNext()) {
            Seat next = itr.next();
            if (next.getSeatNumber().equals(seatNo)) {
                next.setReserved(false);
                System.out.println("Reservation for seat " + seatNo + " was canceled.");
            }
        }
    }
}
