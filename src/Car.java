public class Car extends Vehicle{
  String model;

  public Car(String brand, int year, String model) {
    super(brand, year);
    this.model = model;
  }
  public String toString() {
    return String.format("%s %s %d", brand, model, year);
  }
  public void displayInfo(){
    System.out.printf("%s %d", brand, year);
  }
}
