public class Main {
    public static void main(String[] args) {
        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = 41;
        if (capacity >= 102 && seatPlace + standingPlace >= 102) {
            System.out.println("Мест в вагоне нет");
        }
        else {
        System.out.println("В вагоне " + seatPlace + " сидячих мест");
        System.out.println("В вагоне " + standingPlace + " стоячих мест");
        }
    }
}