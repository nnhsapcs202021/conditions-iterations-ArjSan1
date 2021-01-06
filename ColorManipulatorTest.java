
import java.awt.Color;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ColorManipulatorTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorManipulatorTest
{
    /**
     * Default constructor for test class ColorManipulatorTest
     */
    public ColorManipulatorTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    @Test
    public void GrayscaleTest()
    {
        Picture picture = new Picture( "Selfie2.jpg" );
        ColorManipulator testColorManipulator = new ColorManipulator(picture);
        testColorManipulator.Grayscale();
       //test first pixel

        Pixel pixel = picture.getPixel( 213, 187 );
        Color color = pixel.getColor();
        int red = color.getRed();
        assertEquals(192, red);
        
        //test second pixel
        Pixel pixel2 = picture.getPixel( 434, 560 );
        Color color2 = pixel2.getColor();
        int red2 = color2.getRed();
        assertEquals(89, red2);
        
       //test third pixel
        Pixel pixel3 = picture.getPixel( 64, 398 );
        Color color3 = pixel3.getColor();
        int red3 = color3.getRed();
        assertEquals(255, red3);
        
    }
   
}
