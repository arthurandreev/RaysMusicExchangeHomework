import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {
    Guitar guitar;

    @Before

    public void before() {
        guitar = new Guitar("beige", "wood", "yamaha", 50, 70, 7);
    }

    @Test
    public void canGetGuitarColor(){
        assertEquals("beige", guitar.getColor());
    }

    @Test
    public void canSetGuitarColor(){
        guitar.setColor("black");
        assertEquals("black", guitar.getColor());
    }

    @Test
    public void canGetGuitarMaterial(){
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void canSetGuitarMaterial(){
        guitar.setMaterial("plastic");
        assertEquals("plastic", guitar.getMaterial());
    }

    @Test
    public void canGetGuitarBrand(){
        assertEquals("yamaha", guitar.getBrand());
    }

    @Test
    public void canGetGuitarBuyingPrice(){
        assertEquals(50, guitar.getBuyingPrice());
    }

    @Test
    public void canSetGuitarBuyingPrice(){
        guitar.setBuyingPrice(60);
        assertEquals("60", guitar.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(70, guitar.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice(){
        guitar.setSellingPrice(80);
        assertEquals(80, guitar.getSellingPrice());
    }

    @Test
    public void canGetNumberOfStrings(){
        assertEquals(7, guitar.getNumberOfStrings());
    }

    @Test
    public void canSetNumberOfStrings(){
        guitar.setNumberOfStrings(5);
        assertEquals(5, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlayGuitar(){
        assertEquals("I am playing the guitar", guitar.playAnInstrument());
    }

}
