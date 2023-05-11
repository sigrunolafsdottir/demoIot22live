package LiveDemoIoT22.ArvsDemo;

public class Fisk extends Djur{

    int rekommenderad_tankstorlek;

    public Fisk(int rekommenderad_tankstorlek) {
        this.rekommenderad_tankstorlek = rekommenderad_tankstorlek;
    }

    public Fisk(String läte, String färg, int ålder, String mat, int rekommenderad_tankstorlek) {
        super(läte, färg, ålder, mat);
        this.rekommenderad_tankstorlek = rekommenderad_tankstorlek;
    }

    @Override
    public String toString() {
        return "Fisk{" +
                "rekommenderad_tankstorlek=" + rekommenderad_tankstorlek +
                ", läte='" + super.getLäte() + '\'' +
                ", färg='" + super.getFärg() + '\'' +
                ", ålder='" + super.getÅlder() + '\'' +
                ", mat='" + super.getMat() + '\'' +
                '}';
    }
}
