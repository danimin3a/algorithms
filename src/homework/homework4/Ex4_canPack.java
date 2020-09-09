package homework.homework4;

public class Ex4_canPack {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int total = bigCount * 5 + smallCount;
        if (total < goal) {
            System.out.println("Package needs more bags");
        } else {
            int useBigCount = (goal / 5);
            if (useBigCount * 5 + smallCount >= goal) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }
}
