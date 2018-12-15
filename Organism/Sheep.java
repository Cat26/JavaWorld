package Organism;
import Position.Position;
import World.World;

public class Sheep extends Animal implements Cloneable{

    public Sheep(Integer posx, Integer posy, World world){
        this.setPosition(new Position(posx, posy));
        this.setWorld(world);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
//        Sheep sheep = new Sheep();
        return super.clone();
    }

    public void initParams(){
        this.setPower(3);
        this.setInitiative(3);
        this.setLiveLength(10);
        this.setPowerToReproduce(6);
        this.setSign("S");
    }

}
