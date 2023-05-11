package LiveDemoIoT22.ArvsDemo;

public class Katt extends Djur{

    int antal_ben = 4;


    public Katt(String läte, String färg, int ålder, String mat) {
        super(läte, färg, ålder, mat);
    }

    @Override
    public String toString() {
        return "Katt{" +
                "antal ben=" + antal_ben +
                ", läte='" + super.getLäte() + '\'' +
                ", färg='" + super.getFärg() + '\'' +
                ", ålder='" + super.getÅlder() + '\'' +
                ", mat='" + super.getMat() + '\'' +
                '}';
    }
}
