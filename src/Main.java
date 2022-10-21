public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        Human human=new Human();
            human.yearOfBirth=2002;

        //Задание 2
        Human human2=new Human();
        human.post="бренд-менеджер";

        //Задание 3
        Car car=new Car();
        car.brand="Lada";

        //Задание Б1
        Human maksim=new Human("Максим", "Минск", 1987);
        Human anya=new Human("Аня", "Москва", 1993);
        Human katya=new Human("Катя", "Калининград", 1994,"продакт-менеджер");
        Human artem=new Human("Артем", "Москва", 1995,"директор по развитию бизнеса");

        //Задание Б2
        Car granta=new Car("Lada","Granta","1,7 л.","жёлтый", -2015,"Россия");
        Car a8=new Car("Audi","A8 50 L TDI quattro","3,0 л.","чёрный", 2020,"Германия");
        Car z8=new Car("BMW","Z8","3,0 л.","чёрный", 2018,"Германия");
        Car sportage4=new Car("Kia","Sportage 4-го поколения","2,4 л.","красный", 2018,"Южная Корея");
        Car avante=new Car("Hyundai","Avante","1,6 л.","оранжевый", 2016,"Южная Корея");

        human.hello();
        System.out.println("Задание 2");
        human.hello2();
        System.out.println("Задание 3");
        car.carInfo();
        System.out.println("Задание Б1");
        maksim.hello();
        anya.hello();
        katya.hello2();
        artem.hello2();
        System.out.println("Задание Б2 и В2");
        granta.carInfo();
        a8.carInfo();
        z8.carInfo();
        sportage4.carInfo();
        avante.carInfo();
    }
}