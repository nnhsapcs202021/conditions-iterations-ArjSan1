import java.awt.Color;

/**
 * Class that manipulates the colors in a specified picture
 *
 * @author ArjSan1
 * @version 6 January 2021
 */
public class ColorManipulator
{
    private Picture picture;

    /**
     * Constructs a new ColorManipulator object with the specified picture
     *
     * @param  newPicture  the picture to manipulate
     */
    public ColorManipulator( Picture newPicture )
    {
        this.picture = newPicture;
    }

    /**
     * Returns the Picture associated with this ColorManipulator object. Intended to
     *      be used by the test class.
     *
     * @returns the Picture associated with this ColorManipulator object
     */
    public Picture getPicture()
    {
        return this.picture;
    }

    /**
     * Sets the blue component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxBlue()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setBlue( 255 );
            }
        }
    }

    /**
     * Sets the red component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxRed()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setRed( 255 );
            }
        }
    }

    /**
     * Sets the Green component of the color of every pixel in the picture to the maximum value
     *
     *      An example of manipulating one component of the color of a pixel.
     */
    public void maxGreen()

    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                pixel.setGreen( 255 );
            }
        }
    }
    /**
     * 
     */
    public void Grayscale()
    {
        {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();

                int greyscaleRed = ((color.getRed()+color.getBlue()+color.getGreen())/3);
                int greyscaleBlue = ((color.getRed()+color.getBlue()+color.getGreen())/3);
                int greyscaleGreen = ((color.getRed()+color.getBlue()+color.getGreen())/3);

                Color greyscale = new Color( greyscaleRed, greyscaleBlue, greyscaleGreen );
                pixel.setColor( greyscale );
            }
        }
    }
    }

    /**
     * Negates the color of every pixel in the picture
     *
     *      An example of manipulating the color of a pixel using a Color object
     */
    public void negate()
    {
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();

        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();

                int negatedRed = 255 - color.getRed();
                int negatedBlue = 255 - color.getBlue();
                int negatedGreen = 255 - color.getGreen();

                Color negated = new Color( negatedRed, negatedBlue, negatedGreen );
                pixel.setColor( negated );
            }
        }
    }

    public static void main(String args[])
    {
        // the selfie image must be in the Shepard Fairey folder
        Picture picture= new Picture( "Selfie2.jpg" );
        ColorManipulator manipulator = new ColorManipulator( picture );
        picture.explore();
        manipulator.Grayscale();
        picture.explore();
    }
}
