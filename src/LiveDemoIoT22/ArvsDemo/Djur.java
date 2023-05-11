package LiveDemoIoT22.ArvsDemo;

public abstract class Djur {

    private String läte;
    private String färg;
    private int ålder;
    private String mat;

    public Djur(){}

    public Djur(String läte, String färg, int ålder, String mat) {
        this.läte = läte;
        this.färg = färg;
        this.ålder = ålder;
        this.mat = mat;
    }

    public String getLäte() {
        return läte;
    }

    public void setLäte(String läte) {
        this.läte = läte;
    }

    public String getFärg() {
        return färg;
    }

    public void setFärg(String färg) {
        this.färg = färg;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    @Override
    public String toString() {
        return "Djur{" +
                "läte='" + läte + '\'' +
                ", färg='" + färg + '\'' +
                ", ålder='" + ålder + '\'' +
                ", mat='" + mat + '\'' +
                '}';
    }
}
