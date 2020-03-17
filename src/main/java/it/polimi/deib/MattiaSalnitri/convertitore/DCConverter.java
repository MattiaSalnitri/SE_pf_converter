package it.polimi.deib.MattiaSalnitri.convertitore;

public class DCConverter implements DCConverter_int
{
    private double ratio=0;

    public void setChangeRatio_DtoC(double ratio)
    {
        this.ratio = ratio;

    }

    public double toDollar(double chf) throws IllegalArgumentException
    {
        if (chf<0)
            throw new IllegalArgumentException();

        if (chf ==0)
            return 0;

        return chf/ratio;
    }
    
    public double toCHF(double dollars) throws IllegalArgumentException
    {
        if (dollars<0)
            throw new IllegalArgumentException();

        return dollars*ratio;
    }
}
