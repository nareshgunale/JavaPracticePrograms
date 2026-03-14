package InnerClass.StaticNestedClass;
interface Vehicle{
    public int getNoOfWheels();
    class DefaultVehicle implements Vehicle{
        @Override
        public int getNoOfWheels() {
            return 2;
        }
    }
}
class Bus implements Vehicle{
    @Override
    public int getNoOfWheels() {
        return 6;
    }
}

public class InterfaceDefaultimplementation {
    public static void main(String[] args) {
        Vehicle.DefaultVehicle obj = new Vehicle.DefaultVehicle();
        System.out.println(obj.getNoOfWheels());

        Bus b = new Bus();
        System.out.println(b.getNoOfWheels());
    }
}
