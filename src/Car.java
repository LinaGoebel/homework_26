public class Car extends Vehicle{
  public String model;

  public Car(String brand, int year, String model) {
    super(brand, year);
    this.model = model;
  }
  public String toString() {
    return String.format("%s %d %s ", brand, year, model);
  }
  @Override
  public String displayInfo(){
    return String.format("%s %s", super.displayInfo(), this.model);

  }
}
