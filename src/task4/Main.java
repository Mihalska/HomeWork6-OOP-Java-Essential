package task4;



enum Vehicles {
    TOYOTA(7), AUDI(2), BMW(6), LEXUS(20);
    int cost;
    String colour;

    Vehicles(int cost) {
        this.cost = cost;

    }
    String getColour (){
        return "red";
    }
   @Override
    public   String toString (){
        return "Vehicles: " + super.toString() + ", color " +getColour() +", cost " + cost  ;
    }

}
public class Main {
    public static void main(String[] args) {
        Vehicles  vehicles = Vehicles.LEXUS  ;
        System.out.println (vehicles );
    }
}
