package homework.homework8.Ex1;

public class Apartment {
    private LivingRoom aLivingRoom;
    private SmartTV smartTV;
    private Couch couch;

    public Apartment(LivingRoom aLivingRoom, SmartTV smartTV, Couch couch) {
        this.aLivingRoom = aLivingRoom;
        this.smartTV = smartTV;
        this.couch = couch;
    }
    public void start(){
        aLivingRoom.prepareWatchingTV();
        smartTV.turnOnTv("Netflix");
        couch.extendCouch();
    }

    public LivingRoom getaLivingRoom() {
        return aLivingRoom;
    }

    public void setaLivingRoom(LivingRoom aLivingRoom) {
        this.aLivingRoom = aLivingRoom;
    }

    public SmartTV getSmartTV() {
        return smartTV;
    }

    public void setSmartTV(SmartTV smartTV) {
        this.smartTV = smartTV;
    }

    public Couch getCouch() {
        return couch;
    }

    public void setCouch(Couch couch) {
        this.couch = couch;
    }
}
