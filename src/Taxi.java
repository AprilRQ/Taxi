/**
 * Created by jukzhang on 10/3/16.
 */
public class Taxi {

    public final static int INIT_METER = 2;
    public final static int INIT_METERFEE = 6;
    public final static int MORE_METER = 8;

    private final static double WAITFEE = 0.25;
    private final static double METERFEE_2 = 0.8;
    private final static double METERFEE_3 = 1.2;

    public long totalFee(double km, double min)
    {
        return Math.round(meterFee(km) + waitFee(min));
    }

    private double waitFee(double min)
    {
        return min*WAITFEE;
    }

    private double secondMeterFee(double km)
    {
        return (km-INIT_METER)*METERFEE_2;
    }

    private double thirdMeterFee(double km)
    {
        return (km-MORE_METER)*METERFEE_3;
    }

    private double meterFee(double km)
    {
        double result = 0;
        if(km > 0 && km <= INIT_METER)
            result = INIT_METERFEE;
        else if(km >= INIT_METER && km <= MORE_METER)
            result = INIT_METERFEE + secondMeterFee(km);
        else if(km > MORE_METER)
            result = INIT_METERFEE + secondMeterFee(km) + thirdMeterFee(km);
        return result;
    }
}
