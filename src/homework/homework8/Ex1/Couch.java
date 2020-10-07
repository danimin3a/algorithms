package homework.homework8.Ex1;

public class Couch {
    public String color;
    public int size;
    public boolean extensible;

    public Couch(String color, int size, boolean extensible) {
        this.color = color;
        this.size = size;
        this.extensible = extensible;
    }

    public void extendCouch(){
        System.out.println("Couch is now extended!");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isExtensible() {
        return extensible;
    }

    public void setExtensible(boolean extensible) {
        this.extensible = extensible;
    }
}
