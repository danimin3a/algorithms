package homework.homework8.Ex1;

public class SmartTV {
    public String manufacturer;
    public String model;
    public int resolution;
    public int sizeInch;

    public SmartTV(String manufacturer, String model, int resolution, int sizeInch) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.sizeInch = sizeInch;
    }

    public void turnOnTv(String program) {
        System.out.println("TV is now turned on " + program);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getSizeInch() {
        return sizeInch;
    }

    public void setSizeInch(int sizeInch) {
        this.sizeInch = sizeInch;
    }
}
