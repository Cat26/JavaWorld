package Organism;
import Organism.Organism;
import Position.Position;
import World.World;

import java.util.List;

abstract class Animal extends Organism {
    private Position lastPosition;


    public Position getLastPosition() {
        return lastPosition;
    }

    public void setLastPosition(Position lastPosition) {
        this.lastPosition = lastPosition;
    }

    public List<Position> getNeighboringPosition(){
        return this.getWorld().getNeighboringPositions(this.getPosition());
    }


}
