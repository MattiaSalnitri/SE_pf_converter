package it.polimi.deib.MattiaSalnitri;

import it.polimi.deib.MattiaSalnitri.convertitore.DCConverter;
import it.polimi.deib.MattiaSalnitri.convertitore.DCConverter_int;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DCConverterTest
{
    DCConverter_int dcConverter = null;

    @Before
    public void setUp()
    {
        dcConverter = new DCConverter();
    }

    @After
    public void tearDown()
    {}

    @Test
    public void setChangeRatio_DtoC_correctInput_correctOutput()
    {
        dcConverter.setChangeRatio_DtoC(2.0);
        assertEquals(dcConverter.toCHF(1),2,0);

    }

    @Test
    public void toCHF_correctInput_correctOutput()
    {
        dcConverter.setChangeRatio_DtoC(2.0);
        assertEquals(dcConverter.toDollar(2.0),1,0);

    }

    @Test (expected = IllegalArgumentException.class)
    public void toCHF_negativeInput_throwsIllegalArgumentException()
    {
        dcConverter.toCHF(-2);

    }

    @Test
    public void toCHF_zeroInput_throwsIllegalArgumentException()
    {
        assertEquals(dcConverter.toCHF(0),0,0);

    }

    @Test
    public void toDollar_correctInput_correctOutput()
    {
        dcConverter.setChangeRatio_DtoC(2.0);
        assertEquals(dcConverter.toDollar(2.0),1,0 );

    }

    @Test (expected = IllegalArgumentException.class)
    public void toDollar_negativeInput_throwsIllegalArgumentException()
    {
        dcConverter.toDollar(-2.0);

    }

    @Test
    public void toDollar_zeroInput_throwsIllegalArgumentException()
    {
        dcConverter.toDollar(0);

    }


}
