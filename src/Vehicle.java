public class Vehicle {

  String brand;
  int year;

  public Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  public boolean displayInfo() {
    System.out.printf("%s (%d)%n", this.brand, this.year);

    return false;
  }
}




