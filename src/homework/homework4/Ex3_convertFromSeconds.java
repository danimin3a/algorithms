package homework.homework4;

public class Ex3_convertFromSeconds {
    public static String convertFromSeconds(int numberOfSeconds){
        int seconds=numberOfSeconds%60;
        int minutes=numberOfSeconds/60;
        int hours=minutes%60;
        minutes=minutes/60;
        return "H"+minutes + "-M" + hours + "-S" + seconds;
    }

    public static void main(String[] args) {
        System.out.println(convertFromSeconds(38239));
        System.out.println(convertFromSeconds(2239));
        System.out.println(convertFromSeconds(61238));
        System.out.println(convertFromSeconds(59));
        System.out.println(convertFromSeconds(61));
        System.out.println(convertFromSeconds(3600));
    }
}
