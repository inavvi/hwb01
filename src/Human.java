public class Human {
    String name;
    String town;
    int yearOfBirth;
    String post;

    public  Human() {
        this.name="Информация не указана";
        this.town="Информация не указана";
        this.yearOfBirth=0;
        this.post="Информация не указана";
    }

    public Human(String name, String town, int yearOfBirth) {
        this.name=name;
        this.town=town;
        this.yearOfBirth=yearOfBirth;
        if (yearOfBirth<0) {
            this.yearOfBirth=0;
        }
    }

    public Human(String name, String town, int yearOfBirth, String post) {
        this.name=name;
        this.town=town;
        this.yearOfBirth=yearOfBirth;
        this.post=post;
    }

    public void hello () {
        System.out.println("Привет! Меня зовут "+name+". Я из города "+town+". Я родился в "+yearOfBirth+" году. Будем знакомы!");
    }

    public void hello2 () {
        System.out.println("Привет! Меня зовут "+name+". Я из города "+town+". Я родился в "+yearOfBirth+" году. Я работаю на должности "+post+". Будем знакомы!");
    }
}
