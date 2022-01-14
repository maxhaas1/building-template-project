import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class Unittest {
    @Test
    public void Shalladd1ResidentwhenInitializing(){

        Building building = new Building("Hubert");
        assertEquals("Hubert", building.residents.get(0));

    }
    @Test
    public void ShalladdArrayofResidentswhenInitializing(){
        String[] resis = new String[]{"Hubert","mero"};
        Building building = new Building(resis);
        assertEquals("Hubert",building.residents.get(0));
        assertEquals("mero",building.residents.get(1));
    }
    @Test
    public void ShallAddafterInitializing(){
        String[] resis = new String[]{"Hubert","mero"};
        Building building = new Building(resis);
        building.Add("mullah");
        assertEquals("mullah", building.residents.get(2));

    }
    @Test
    public void ShallnotAddSameName(){
        String[] resis = new String[]{"Hubert","mero"};
        Building building = new Building(resis);
        building.Add("mero");
        assertEquals(2,building.residents.size());
    }
    @Test
    public void shallremovegivenname(){
        String[] resis = new String[]{"Hubert","mero"};
        Building building = new Building(resis);
        building.Remove("mero");
        assertEquals(1,building.residents.size());
    }
}
