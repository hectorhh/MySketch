/**
 * Name : Hector Herrera
 * PennKey : Hectorh
 * Recitation : 216
 * 
 * Execution: java MySketch
 * 
 * This draws a cabin in the forest with a tree, a sun, and a cat.
 */

public class MySketch{
    public static void main(String[] args) {
        PennDraw.setCanvasSize(500, 500);
        // draw a blue background
        PennDraw.clear(0, 180, 250);
        
        // draw a green field
        PennDraw.setPenColor(70, 180, 0);
        PennDraw.filledRectangle(.5, .15, .5, .25);
        
        //draw a chiminey
        PennDraw.setPenColor(100, 100, 100);
        PennDraw.filledRectangle(.915, .65, .035, .09);
       
        //draw the house with the roof
        PennDraw.setPenColor(140, 70, 20);
        double[] xcoords = {.7,  .95,  .95, .825, .7 };
        double[] ycoords = {.4 , .4, .6, .75,   .6  };
        PennDraw.filledPolygon(xcoords, ycoords);
        
        //draw windows
        PennDraw.setPenColor(70, 30, 0);
        PennDraw.square(.77, .55, .02);
        PennDraw.square(.88, .55, .02);
        PennDraw.line(.75, .55, .79, .55);
        PennDraw.line(.77, .53, .77, .57);
        PennDraw.line(.88, .53, .88, .57);
        PennDraw.line(.86, .55, .9, .55);
        
        //draw a door
        PennDraw.setPenColor(70, 30, 0);
        PennDraw.rectangle(.825, .44, .02, .04);
        
        //draw cat's tail
        PennDraw.setPenColor(180, 150, 0);
        PennDraw.filledEllipse(.82, .21, .04, .01, 55);
        PennDraw.setPenColor(90, 70, 0);
        PennDraw.ellipse(.82, .21, .04, .01, 55);
        
        //draw cat's legs
        PennDraw.setPenColor(180, 150, 0);
        PennDraw.filledEllipse(.73, .17, .01, .04);
        PennDraw.filledEllipse(.77, .17, .01, .04);
        PennDraw.filledEllipse(.8,.17, .01, .04);
        PennDraw.filledEllipse(.7, .17, .01, .04);
        PennDraw.setPenColor(90, 70, 0);
        PennDraw.ellipse(.73, .17, .01, .04);
        PennDraw.ellipse(.77, .17, .01, .04);
        PennDraw.ellipse(.8,.17, .01, .04);
        PennDraw.ellipse(.7, .17, .01, .04); 
        
        //draw cat's body
        PennDraw.setPenColor(180, 150, 0);
        PennDraw.filledEllipse(.75, .2, .075, .03);
        PennDraw.setPenColor(90, 70, 0);
        PennDraw.ellipse(.75, .2, .075, .03);
        
        //draw cat's ears
        PennDraw.setPenColor(180, 150, 0);
        PennDraw.filledPolygon(.69, .28, .7, .24, .68, .24);
        PennDraw.filledPolygon(.65, .28, .66, .24, .64, .24);
        PennDraw.setPenColor(90, 70, 0);
        PennDraw.polygon(.69, .28, .7, .24, .68, .24);
        PennDraw.polygon(.65, .28, .66, .24, .64, .24);
        
        //draw cat's head
        PennDraw.setPenColor(180, 150, 0);
        PennDraw.filledEllipse(.67, .23, .035, .035);
        PennDraw.setPenColor(90, 70, 0);
        PennDraw.ellipse(.67, .23, .035, .035);
        
        //draw cat's face
        PennDraw.setPenRadius(.005);
        PennDraw.point(.66, .24);
        PennDraw.point(.68, .24);
        PennDraw.arc(.67, .22, .01, 170, 10);

        //outline the house and roof
        PennDraw.setPenColor(70, 30, 0);
        PennDraw.setPenRadius(.007);
        PennDraw.polygon(xcoords, ycoords);
        PennDraw.line(.95, .6, .7, .6); 
        
        //draw a yellow sun
        PennDraw.setPenColor(255, 250, 0);
        PennDraw.filledEllipse(.15, .85, .1, .1);
        PennDraw.line(.01, .85, .29, .85);
        PennDraw.line(.15, .99, .15, .71);
        PennDraw.line(.04, .74, .25, .96);
        PennDraw.line(.04, .96, .25, .74);
        
        //draw a tree trunk
        PennDraw.setPenColor(90, 55, 0);
        PennDraw.filledRectangle(.2, .25, .04, .08);
        
        //draw the leaves
        PennDraw.setPenColor(50, 120, 0);
        PennDraw.filledPolygon(.2, .35, .1, .25, .3, .25);
        PennDraw.filledPolygon(.2, .4, .1, .3, .3, .3);
        PennDraw.filledPolygon(.2, .45, .1, .35, .3, .35);
   
    }
}