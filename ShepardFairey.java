import java.awt.Color;

/**
 * Transforms a picture by applying a Shepard Fairey-inspired effect.
 *
 * @author ArjSan1
 * @version 6 January 2021
 */
public class ShepardFairey
{
    private ColorManipulator manipulator;
    private Picture picture;

    private static final Color YELLOW = new Color( 255, 243, 71 );
    private static final Color CYAN = new Color( 157, 254, 225 );
    private static final Color ORANGE = new Color( 255, 89, 0 );
    private static final Color PURPLE = new Color( 167, 86, 255);
    /**
     * Default constructor for Shepard Fairey object
     */
    public ShepardFairey( Picture newPicture )
    {
        this.manipulator = new ColorManipulator( newPicture );
        this.picture = newPicture;
    }

    /**
     * Transforms the picture by applying a Shepard Fairey-inspired effect.
     *
     */
    public void transform()
    {
        //invoked greyscale method on manipulator object
        this.manipulator.grayscale();
        // finding largest greyscale value
        int width = this.picture.getWidth();
        int height = this.picture.getHeight();
        int max = 0;
        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                int red = color.getRed();

                if (red > max)
                {
                    max = red;
                }
            }
        }
        //finding smallest greyscale value
        int min = 255;
        for( int y = 0; y < height; y++ )
        {
            for( int x = 0; x < width; x++ )
            {
                Pixel pixel = this.picture.getPixel( x, y );
                Color color = pixel.getColor();
                int red = color.getRed();

                if (red < min)
                {
                    min = red;
                }
            }
        }
        double totalRange = max-min;
        double subrange1 = (totalRange)/(4);
        double subrange2 = subrange1 * 2;
        double subrange3 = subrange1 * 3;        
        this.manipulator.posterize(PURPLE, ORANGE, CYAN,YELLOW, subrange1, subrange2, subrange3);

    }

    public static void main(String args[])
    {
        // create a new picture object based on the original selfie
        //  (the selfie image must be in the Shepard Fairey folder)
        Picture selfie = new Picture( "Selfie2.jpg" );

        // create a ShepardFairey object to transform the selfie picture
        ShepardFairey fairey = new ShepardFairey( selfie );

        // display the original selfie picture
        //selfie.explore();

        // transform the selfie picture by applying a Shepard Fairey-inspired effect
        fairey.transform();

        // display the transformed selfie picture
        selfie.explore();

        // save the transformed selfie picture

        /* This code doesn't work for some students for unknown reasons.
         * You may need to specify an absolute path. For example:
         *  finalPic.write("C:\\Users\\gschmit\\GitHub\\decisions-loops-gcschmit\\Shepard Fairey\\MrSchmitPortrait.jpg");
         */
        /*
        selfie.write( "MrSchmitPortrait.jpg" );

        // repeat the steps for the selfie in landscape orientation
        selfie = new Picture( "selfieLandscape.jpg" );
        fairey = new ShepardFairey( selfie );
        selfie.explore();
        fairey.transform();
        selfie.explore();
        selfie.write( "MrCallaghanLandscape.jpg" );

        // display the transformed selfie picture
        selfie.explore();
        */
    }
    
}
