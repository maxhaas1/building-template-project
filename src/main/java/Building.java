import java.util.ArrayList;

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
        System.arraycopy(residennters, 0, residents, 0, residennters.length);
    }

    public Integer getNumberofResidents() {
        return numberofResidents;
    }

    public void Add(String name){

    }
}
