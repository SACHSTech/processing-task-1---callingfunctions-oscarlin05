import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(800, 800);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(34, 206, 245);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
	// ground color (foreground)
    stroke(74, 50, 1);
    fill(74, 50, 1);
    rect(0, 650, 800, 200);
    
  // lawn (foreground)
    stroke(0);
    fill(22, 181, 72);
    rect(150, 650, 550, 500);

  // pathway (foreground)
    stroke(0);
    fill(130, 148, 148);
    rect(390, 650, 80, 200);    
    
  // house shape
    stroke(0);
    fill(247, 186, 62);
    rect(250, 300, 350, 350);

  // roof
    stroke(0);
    fill(153, 99, 0);
    triangle(150, 300, 425, 100, 700, 300);
    
  // door
    stroke(0);
    rect(390, 550, 80, 100);
    fill(74, 50, 1);
    ellipse(460, 610, 15, 15);

  // window
    stroke(0);
    fill(185, 250, 249);
    rect(390, 350, 80, 80);
    
    line(390, 390, 470, 390);
    line(430, 350, 430, 430);

  // sun
    stroke(0);
    fill(250, 225, 0);
    ellipse(750, 50, 100, 100);


  }
  
  // define other methods down here.
}