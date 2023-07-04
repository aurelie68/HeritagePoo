public abstract class Vehicle{

    // atributs
private String brand;
private int kilometers;

    // constructeurs
    public Vehicle(String brand, int kilometers){
        this.brand = brand;
        this.kilometers = kilometers;
    }

    // accesseurs et mutateurs
    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public int getKilometers(){
        return this.kilometers;
    }

    public void setKilometers(int kilometers){
        this.kilometers = kilometers;
    }


public abstract String doStuff();
    
}

 class Car extends Vehicle{
    public Car(String brand, int kilometers){
        super(brand, kilometers);
    }

    @Override
    public String doStuff(){
        return ("Je suis une : " + getBrand()+"et je fais vroum vroum !");

    }
}

 class Boat extends Vehicle{
    public Boat(String brand, int kilometers){
        super(brand, kilometers);

    }

    @Override
    public String doStuff(){
        return ("Je suis le  : " + getBrand()+" et je fais glou glou! " );
    }
}
class Hangar{
public static void main(String[] args) {
    Car car = new Car ("Peugeot ", 500);
    Boat boat = new Boat ("Titanic ", 10000);

    System.out.println(car.doStuff());
    System.out.println(boat.doStuff());

}

}