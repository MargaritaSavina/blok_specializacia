package registry;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
     
    Cats cat1 = new Cats("Barsik","2004-09-09"); 
    Cats cat2 = new Cats("Myrzic","2016-04-02");   

    ListAnimals registry = new ListAnimals();
    registry.addListAnimals(cat1);
    registry.printListAnimals();
    new JMenuTest();

    
    

    }
}
