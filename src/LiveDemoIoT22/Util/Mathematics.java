package LiveDemoIoT22.Util;

public class Mathematics {

    int baseline = 5;
    int max = 100000;

    public Mathematics(int baseline, int max){
        this.baseline=baseline;
        this.max=max;
    }

    public Mathematics(int baseline){
        this.baseline=baseline;
    }

    public Mathematics(){}

    public int addToBaseline(int toAdd){
        return toAdd+baseline;
    }

    public void setBaseline(int baseline){
        this.baseline=baseline;
    }

    public void setMax(int max) {
        this.max = max;
    }
}
