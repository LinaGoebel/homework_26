public class Vehicle {

  String brand;
  int year;

  public Vehicle(String brand, int year) {
    this.brand = brand;
    this.year = year;
  }

  public String displayInfo() {
    return String.format("%s %d", this.brand, this.year);
  }
}




