import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.stream.Stream;

public class Building {
    public Integer id;
    public ArrayList<String> residents;

    public Building(String resident){
        residents =  new ArrayList<String>();
        residents.add(resident);
    }

    public Building(String[] residennters){
        residents =  new ArrayList<String>();
        Collections.addAll(residents, residennters);
    }


    public void Add(String name){
        boolean con= true;
        for (String resident : residents) {
            if (Objects.equals(resident, name)) {
                con = false;
                break;
            }
        }
        if(con){
            residents.add(name);
        }

    }

    public void Remove(String name){
        residents.removeIf(resident -> resident == name);
    }


}
