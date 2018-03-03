package TGM4;

public class Human implements Animal {

    @Override
    public void walk() {
        System.out.println("İki ayaklı");
    }

    @Override
    public void feed() {
        System.out.println("Hepçil");
    }
}
