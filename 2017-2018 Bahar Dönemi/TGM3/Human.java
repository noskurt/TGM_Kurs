package TGM3;

public class Human extends Animal{

    private int salary;

    public Human(int salary) {
        super("Hepçil","Akciğer");
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Human{" +
                "salary=" + salary +
                '}';
    }
}
