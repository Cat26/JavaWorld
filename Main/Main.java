package Main;
import Position.*;
import Organism.*;
import World.*;

public class Main {
    public static void main(String [] args) throws CloneNotSupportedException{
        World world1 = new World(20, 20);
        Sheep sheep1 = new Sheep(1, 3, world1);
        sheep1.initParams();



        Sheep sheep2 = (Sheep) sheep1.clone();

        System.out.println(sheep1.getPosition().equals(sheep2.getPosition()));

        sheep1.setPosition(new Position(1, 2));

        System.out.println(sheep1);

//        System.out.println(sheep2);
//
        world1.addOrganism(sheep1);
//        world1.addOrganism(sheep2);


    }
}
