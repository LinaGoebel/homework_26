public class Car extends Vehicle {

  public String model;

  public Car(String brand, int year, String model) {
    super(brand, year);
    this.model = model;
  }

  @Override
  public String toString() {
    return String.format("%s %d %s ", brand, year, model);
  }

  @Override
  public boolean displayInfo() {
    super.displayInfo();
    System.out.println(this.model);

    return false;
  }
}
