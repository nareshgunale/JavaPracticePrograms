package Constructor;

public class Vehicle {
    Vehicle(){
        System.out.println("Vehicle Constructor");
    }
    public static void main (String[] args){
        PetrolCar p = new PetrolCar();
        System.out.println(" ");
        DieselCar d = new DieselCar();

    }

}
class Car extends Vehicle{
    Car(){
        System.out.println("Car Constructor");
    }

}
class PetrolCar extends Car{
    PetrolCar(){
        System.out.println("Petrol Car Constructor");
    }
}
class DieselCar extends Car{
    DieselCar(){
        System.out.println("Diesel Car Constructor");
    }
}
