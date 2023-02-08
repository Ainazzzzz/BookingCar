public class Car {
  private  String carsName;
  private  String body;
   private int weight;

   private long price;
  private   Driver group;
   private Engine motor;

   private boolean isBooked;


    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public String getCarsName() {
        return carsName;
    }

    public void setCarsName(String carsName) {
        this.carsName = carsName;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getGroup() {
        return group;
    }

    public void setGroup(Driver group) {
        this.group = group;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carsName='" + carsName + '\'' +
                ", body='" + body + '\'' +
                ", weight=" + weight +
                ", group=" + group +
                ", motor=" + motor +
                '}';
    }
}
