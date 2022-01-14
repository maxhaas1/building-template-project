import org.junit.Test;
import static org.junit.Assert.assertEquals;
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
}
