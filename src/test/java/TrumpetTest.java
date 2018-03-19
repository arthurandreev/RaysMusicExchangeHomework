import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TrumpetTest {
    Trumpet trumpet;

    @Before

    public void before(){
        trumpet = new Trumpet("gold", "brass", "yamaha", 40, 60, 10);
    }

    @Test
    public void canGetColor(){
        assertEquals("gold", trumpet.getColor());
    }

    @Test
    public void canSetColor(){
        trumpet.setColor("silver");
        assertEquals("silver", trumpet.getColor());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("brass", trumpet.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        trumpet.setMaterial("silver");
        assertEquals("silver", trumpet.getMaterial());
    }

    @Test
    public void canGetBrand(){
        assertEquals("yamaha", trumpet.getBrand());
    }

    @Test
    public void canSetBrand(){
        trumpet.setBrand("trumpeteer");
        assertEquals("trumpeteer", trumpet.getBrand());
    }

    @Test
    public void canGetBuyingPrice(){
        assertEquals(40, trumpet.getBuyingPrice());
    }

    @Test
    public void canSetBuyingPrice(){
        trumpet.setBuyingPrice(50);
        assertEquals(50, trumpet.getBuyingPrice());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(60, trumpet.getSellingPrice());
    }

    @Test
    public void canSetSellingPrice(){
        trumpet.setSellingPrice(100);
        assertEquals(100, trumpet.getSellingPrice());
    }

    @Test
    public void canGetNumberOfValves(){
        assertEquals(10, trumpet.getNumberOfValves());
    }

    @Test
    public void canSetNumberOfValves(){
        trumpet.setNumberOfValves(15);
        assertEquals(15, trumpet.getNumberOfValves());
    }

    @Test
    public void canPlayTrumpet(){
        assertEquals("I am playing the trumpet", trumpet.playAnInstrument());
    }


}
