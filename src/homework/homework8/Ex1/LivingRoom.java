package homework.homework8.Ex1;

public class LivingRoom {
    public String wallsColor;
    public int numberOfWindows;
    public int doors;
    public boolean openSpace;

    public LivingRoom(String wallsColor, int numberOfWindows, int doors, boolean openSpace) {
        this.wallsColor = wallsColor;
        this.numberOfWindows = numberOfWindows;
        this.doors = doors;
        this.openSpace = openSpace;
    }
    public void prepareWatchingTV(){
        System.out.println("Go to LivingRoom...");
    }

    public String getWallsColor() {
        return wallsColor;
    }

    public void setWallsColor(String wallsColor) {
        this.wallsColor = wallsColor;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isOpenSpace() {
        return openSpace;
    }

    public void setOpenSpace(boolean openSpace) {
        this.openSpace = openSpace;
    }
}
