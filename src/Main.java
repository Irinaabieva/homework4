public class Main {
    public static void main(String[] args) {
<<<<< Задание_3
        int capacity = 102;
        int seatPlace = 60;
        int standingPlace = 41;
        if (capacity >= 102 && seatPlace + standingPlace >= 102) {
            System.out.println("Мест в вагоне нет");
        }
        else {
        System.out.println("В вагоне " + seatPlace + " сидячих мест");
        System.out.println("В вагоне " + standingPlace + " стоячих мест");
=======
<<<<< Задание_2
        int age = 17;
        if (age >= 7 & age < 18) {
            System.out.println("Ребенок ходит в школу");
        }
        if (age >= 18) {
            System.out.println("Человек уже закончил школу");
        }
        if (age >=24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");
=======
<<<<<< Задание_1
        int age = 19;
        if (age >= 18) {
            System.out.println("Поздравляю вы совершеннолетны!");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил");

>>>>>> master
        }
    }
}