/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("arch.jpg");
    //caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
	  {
	    Picture caterpillar = new Picture("arch.jpg");
	    //caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
	  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testKeepOnlyBlue()
		{
			Picture koala = new Picture("koala.jpg");
			koala.explore();
			koala.keepOnlyBlue();
			koala.explore();
		}
  
  public static void testNegate()
	  {
		  Picture koa = new Picture("koala.jpg");
		 // koa.explore();
		  koa.negate();
		  koa.explore();
	  }
  
  public static void testGrayscale()
  {
	  Picture koa = new Picture("koala.jpg");
	  koa.grayscale();
	  koa.explore();
  }
  
  public static void testFixUnderwater()
  {
	Picture fish = new Picture ("water.jpg");
	fish.fixUnderwater();
	fish.explore();
  }
  
  public static void testMirrorHorizontal()
  {
	  Picture bike = new Picture ("snowman.jpg");
	  bike.mirrorHorizontal();
	  bike.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
	  {
		  Picture robot = new Picture ("robot.jpg");
		  robot.explore();
		  robot.mirrorHorizontalBotToTop();
		  robot.explore();
		  //help
	  }
  
  public static void testMirrorDiagonal()
	  {
		  Picture moon = new Picture ("moon-surface.jpg");
		  moon.explore();
		  moon.mirrorDiagonal();
		  moon.explore();
	  }
  
  public static void testMirrorArms()
  {
	  Picture snow = new Picture ("snowman.jpg");
	  snow.mirrorArms();
	  snow.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture ("seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();
  }
  

  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
	 //testMirrorHorizontal();
	  //testMirrorHorizontalBotToTop();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}