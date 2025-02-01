// Name - Daksh Gulati
// Date - 
// Purpose - draws 2 circles in a ripple pattern while one goes horizontally right and one goes vertically down

void setup (){
 size (500, 700);
 background (0);
 // changes colour mode from RGB to HSB
 colorMode (HSB, 100);
}

// sets variables
float circleOneX = 250;
float circleOneY = 0;
float circleOneRadius = 3;
float circleTwoX = 0;
float circleTwoY = 350;
float circleTwoRadius = 3;

int colourVar = 0;

void draw (){
  noStroke ();

  // checks which colour it should be
  colourVar = (colourVar + 1) % 100;
  
  fill (colourVar, 100, 100);
  
  // draws circle 1
  circle (circleOneX, circleOneY, circleOneRadius);
  circleOneY += 2;
  circleOneRadius += 0.7;
  
  // draws circle 2
  circle (circleTwoX, circleTwoY, circleTwoRadius);
  circleTwoX += 0.5;
  circleTwoRadius += 0.1;
}
