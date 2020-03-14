package solid.liskovsubstitution.goodexample;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<FlyingBird> flyingBirdList = new ArrayList<FlyingBird>();
//        flyingBirdList.add(new Bird());
        flyingBirdList.add(new Crow());
//        flyingBirdList.add(new Ostrich());
        letTheBirdsFly( flyingBirdList );


        List<Bird> birdList = new ArrayList<Bird>();
        birdList.add(new Bird());
        birdList.add(new Crow());
        birdList.add(new Ostrich());
        letTheBirdsEat( birdList );
    }

    static void letTheBirdsFly ( List<FlyingBird> birdList ){
        for ( FlyingBird b : birdList ) {
            b.fly();
        }
    }

    static void letTheBirdsEat ( List<Bird> birdList ){
        for ( Bird bird : birdList ) {
            bird.eat();
        }
    }
}
