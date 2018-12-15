package World;
import Position.*;
import Action.*;
import Organism.*;

import java.util.ArrayList;
import java.util.List;

public class World {
    private Integer worldX;
    private Integer worldY;
    private Integer turn = 0;
    private List<Organism> organisms = new ArrayList<Organism>();
    private List<Organism> newOrganisms = new ArrayList<Organism>();
    private String separator = " ";

    public World(Integer worldX, Integer worldY) {
        this.worldX = worldX;
        this.worldY = worldY;
    }

    public World() {
    }

    public Integer getWorldX() {
        return worldX;
    }

    public Integer getWorldY() {
        return worldY;
    }

    public Integer getTurn() {
        return turn;
    }

    public void setTurn(Integer turn) {
        this.turn = turn;
    }

    public List<Organism> getOrganisms() {
        return organisms;
    }

    public void setOrganisms(List<Organism> organisms) {
        this.organisms = organisms;
    }

    public List<Organism> getNewOrganisms() {
        return newOrganisms;
    }

    public void setNewOrganisms(List<Organism> newOrganisms) {
        this.newOrganisms = newOrganisms;
    }

    public String getSeparator() {
        return separator;
    }

    public void makeTurn() {

    }

    public Boolean addOrganism(Organism newOrganism){
        Position newOrganismPosition = newOrganism.getPosition();

        if(this.positionOnBoard(newOrganismPosition)){
            this.organisms.add(newOrganism);
            return true;
        }
        return false;
    }

    public Boolean positionOnBoard(Position position) {
        return position.getX() >= 0 && position.getY() >= 0 && position.getX() < this.worldX && position.getY() < this.worldY;
    }

    public Organism getOrganismFromPosition(Position position){
        Organism pomOrganism = null;

        for(Organism org : this.organisms) {
            if (org.getPosition() == position) {
                pomOrganism = org;
                break;
            }
        }
        if(pomOrganism == null){
            for(Organism o : this.newOrganisms){
                if (o.getPosition() == position){
                    pomOrganism = o;
                    break;
                }
            }
        }
        return pomOrganism;
    }

    public List<Position> getNeighboringPositions(Position position) {
        List<Position> results = new ArrayList<Position>();
        Position pomPosition;

        for (int y = -1; y > 2; y++) {
            for (int x = -1; x > 2; x++) {
                pomPosition = new Position((position.getX() + x), (position.getY() + y));
                if (this.positionOnBoard(pomPosition) && !(y == 0 && x == 0)){
                    results.add(pomPosition);
                }
            }
        }
        return results;
    }

    @Override
    public String toString() {
        return "World{" +
                "worldX=" + worldX +
                ", worldY=" + worldY +
                ", turn=" + turn +
                '}';
    }
}
