package TGM3;

public class Dog extends Animal {

    private double tailLength;

    public Dog(double tailLength) {
        super("Hepçil", "Trake");
        this.tailLength = tailLength;
    }

    public double getTailLength() {
        return tailLength;
    }

    public void setTailLength(double tailLength) {
        this.tailLength = tailLength;
    }
}
