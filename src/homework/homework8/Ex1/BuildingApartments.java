package homework.homework8.Ex1;

public class BuildingApartments {
    public static void main(String[] args) {
        LivingRoom aLivingRoom = new LivingRoom("white", 3, 0, true);
        SmartTV smartTV = new SmartTV("Samsung", "5395WX", 19201080, 120);
        Couch couch = new Couch("purple", 2008050, true);
        Apartment myApartament = new Apartment(aLivingRoom, smartTV, couch);

        myApartament.start();

    }
}
