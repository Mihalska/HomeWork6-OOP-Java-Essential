package task2;


enum Animals {
    WOLF(5), BEAR(15), FOX(7), TIGER(2), DOG(6),LION(20);
    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String  toString() {
        return "Animals: " + super.toString() + " вік " + age ; }
}

public class Main {
    public static void main(String[] args) {

        Animals animals = Animals.LION;
        System.out.println (animals );
    }
}
