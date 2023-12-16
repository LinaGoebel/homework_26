public class Main {

  public static void main(String[] args) {
    Vehicle vehicle = new Vehicle("Mercedes", 2018);
    Car car = new Car("Audi", 2019, "A6");
    vehicle.displayInfo();
    car.displayInfo();
  }

}
