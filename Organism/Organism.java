package Organism;
import Position.Position;
import World.World;

public class Organism{
    private Position position;
    private World world;
    private Integer power;
    private Integer initiative;
    private Integer liveLength;
    private Integer powerToReproduce;
    private String sign;


    public Integer getPower() {
        return power;
    }

    public void setPower(Integer power) {
        this.power = power;
    }

    public Integer getInitiative() {
        return initiative;
    }

    public void setInitiative(Integer initiative) {
        this.initiative = initiative;
    }

    public Integer getLiveLength() {
        return liveLength;
    }

    public void setLiveLength(Integer liveLength) {
        this.liveLength = liveLength;
    }

    public Integer getPowerToReproduce() {
        return powerToReproduce;
    }

    public void setPowerToReproduce(Integer powerToReproduce) {
        this.powerToReproduce = powerToReproduce;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }

    @Override
    public String toString() {
        return "Organism{" +
                "position=" + position +
                ", world=" + world +
                ", power=" + power +
                ", initiative=" + initiative +
                ", liveLength=" + liveLength +
                ", powerToReproduce=" + powerToReproduce +
                ", sign='" + sign + '\'' +
                '}';
    }
}
