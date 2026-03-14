package Interface;
interface Country{
    void countryName();
}
interface State extends Country{
    void stateName();

}
interface District extends State{
    void districtName();

}
interface City extends District{
    void cityName();
}

 public class Location implements City {
     @Override
     public void countryName() {
         System.out.println("India");
     }

     @Override
     public void stateName() {
         System.out.println("Maharashtra");

     }

     public void districtName() {
         System.out.println("Latur");
     }

     @Override
     public void cityName() {
         System.out.println("Udgir");
     }


     public static void main(String[] args){
         Location l=new Location();
         l.countryName();
         l.stateName();
         l.districtName();
         l.cityName();

     }
 }
