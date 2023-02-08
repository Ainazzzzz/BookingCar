public class Engine {
  private  int power;
   private String made;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", made='" + made + '\'' +
                '}';
    }
}
