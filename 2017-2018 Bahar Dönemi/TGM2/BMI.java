package TGM2;

public class BMI {

    private String name;
    private double boy;
    private double kilo;

    public BMI() {
        System.out.println("BMI sınıfı oluştu.");
    }

    public BMI(String name, double boy, double kilo) {
        System.out.println("BMI sınıfı oluştu.");
        this.name = name;
        this.boy = boy;
        this.kilo = kilo;
    }

    public double calcBMI() {
        return kilo / Math.pow(boy, 2);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBoy() {
        return boy;
    }

    public void setBoy(double boy) {
        this.boy = boy;
    }

    public double getKilo() {
        return kilo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }
}
