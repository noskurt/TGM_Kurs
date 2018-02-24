package TGM3;

public class Animal {

    private String beslenme;
    private String solunum;

    public Animal() {
    }

    public Animal(String beslenme, String solunum) {
        this.beslenme = beslenme;
        this.solunum = solunum;
    }

    public String getBeslenme() {
        return beslenme;
    }

    public void setBeslenme(String beslenme) {
        this.beslenme = beslenme;
    }

    public String getSolunum() {
        return solunum;
    }

    public void setSolunum(String solunum) {
        this.solunum = solunum;
    }
}
