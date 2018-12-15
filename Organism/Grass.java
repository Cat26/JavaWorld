package Organism;

public class Grass extends Plant implements Cloneable{
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public void initParams(){
        this.setPower(0);
        this.setInitiative(0);
        this.setLiveLength(6);
        this.setPowerToReproduce(3);
        this.setSign("S");
    }
}
