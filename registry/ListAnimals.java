package registry;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ListAnimals{

    public ListAnimals(){

    }
    public ArrayList<Animals> list_animals = new ArrayList<Animals>();
    //public LinkedList l_an = new LinkedList<>();
    
    void printListAnimals() {
        for (int i =0; i < list_animals.size(); i++) {
            System.out.println(list_animals.get(i));
        }
    }
    void addListAnimals(Animals e){
        list_animals.add(Animals e);
    }

    
    ArrayList<Animals> getListAnimals() {
        return list_animals;
    }
    
}
