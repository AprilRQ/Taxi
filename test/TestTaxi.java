import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jukzhang on 10/3/16.
 */
public class TestTaxi {

    @Test
    public void meter0Wait0()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(0,0);
        assertEquals(fee,0);
    }

    @Test
    public void meter2Wait0()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(Taxi.INIT_METER,0);
        assertEquals(fee,Taxi.INIT_METERFEE);
    }

    @Test
    public void meter2Wait2()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(Taxi.INIT_METER,2);
        assertEquals(fee,7);
    }

    @Test
    public void meter2_1Wait0()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(2.1,0);
        assertEquals(fee,6);
    }

    @Test
    public void meter2_1Wait2()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(2.1,2);
        assertEquals(fee,7);
    }

    @Test
    public void meter8Wait0()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(8,0);
        assertEquals(fee,11);
    }

    @Test
    public void meter8Wait2()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(8,0);
        assertEquals(fee,11);
    }

    @Test
    public void meter8_1Wait3()
    {
        Taxi taxi = new Taxi();
        long fee = taxi.totalFee(8.1,3);
        assertEquals(fee,12);
    }
}
