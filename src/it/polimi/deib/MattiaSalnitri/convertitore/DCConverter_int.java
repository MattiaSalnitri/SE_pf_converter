package it.polimi.deib.MattiaSalnitri.convertitore;

public interface DCConverter_int
{
    /**
     * set the ration of the converter
     * for example, ratio of 2 means 1 Dollar = 2 CHF
     * @param ratio the ratio used for the conversion
     */
    public void setChangeRatio_DtoC(double ratio);


    /**
     * Convertschf to dollars
     *
     * @param chf the amount of chf to convert
     * @return the converted value in dollars
     * @throws IllegalArgumentException when the chf in input is lower than 0
     */
    public double toDollar(double chf) throws IllegalArgumentException;

    /**
     *
     * @param dollars the amount of dollars to convert
     * @return the converted value in dollars
     * @throws IllegalArgumentException when the chf in input is lower than 0
     */
    public double toCHF (double dollars) throws IllegalArgumentException;// dollar * ratio
}
