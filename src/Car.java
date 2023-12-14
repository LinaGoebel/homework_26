public class Car extends Vehicle{
  public String model;

  public Car(String brand, int year, String model) {
    super(brand, year);
    this.model = model;
  }
  public String toString() {
    return String.format("%s %s %d", brand, model, year);
  }
  @Override
  public String displayInfo(){
    return String.format("%s %d %s", super.displayInfo(), model);

  }
}
