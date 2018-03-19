import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano("black", "fake gold", "yamaha", 300, 500, "gloss" );

    }

    @Test
    public void canGetColor(){
        assertEquals("black", piano.getColor());
    }

    @Test
    public void canSetColor() {
        piano.setColor("Blue");
        assertEquals("Blue", piano.getColor());

    }

    @Test
    public void canGetMaterial(){
        assertEquals("fake gold", piano.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        piano.setMaterial("platinum");
        assertEquals("platinum", piano.getMaterial());
    }

    @Test
    public void canGetBrand(){
        assertEquals("yamaha", piano.getBrand());
    }

    @Test
    public void canSetBrand(){
        piano.setBrand("kawasaki");
        assertEquals("kawasaki", piano.getBrand());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(300, piano.getBuyingPrice());
    }

    @Test
    public void canSetBuyingPrice(){
        piano.setBuyingPrice(400);
        assertEquals(400, piano.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(500, piano.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice(){
        piano.setSellingPrice(700);
        assertEquals(700, piano.getSellingPrice());
    }

    @Test
    public void canGetFinish(){
        assertEquals("gloss", piano.getFinish());
    }
}
