import java.util.ArrayList;
import java.util.Collections;

public class Building {
    public Integer id;
    private Integer numberofResidents;
    public ArrayList<String> residents;

    public Building(String resident){
        residents =  new ArrayList<String>();
        numberofResidents = 0;
        residents.add(resident);
        numberofResidents++;
    }

    public Building(String[] residennters){
        residents =  new ArrayList<String>();
        numberofResidents = 0;
        Collections.addAll(residents, residennters);
    }

    public Integer getNumberofResidents() {
        return numberofResidents;
    }

    public void Add(String name){
        residents.add(name);
    }
}
