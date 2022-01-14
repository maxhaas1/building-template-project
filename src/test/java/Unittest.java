import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Unittest {
    @Test
    public void Shalladd1Resident(){

        Building building = new Building("Hubert");
        assertEquals("Hubert", building.residents.get(0));

    }
}
