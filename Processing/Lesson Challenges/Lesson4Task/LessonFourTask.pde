// Name - Daksh Gulati
// Date - 
// Purpose - creates a ripple affect using circles, one goes diagonally down and one goes upwards

void setup (){
 size (500,500);
 background (150);
}

// sets variables
float circleOneX = 0;
float circleOneY = 0;
float circleOneDiameter = 30;

float circleTwoX = 250;
float circleTwoY = 500;
float circleTwoDiameter = 50;

void draw (){
  // draws the circle going diagonally down
  fill (200);
  circle(circleOneX, circleOneY, circleOneDiameter);
  
  circleOneX = circleOneX + 1.5;
  circleOneY = circleOneY + 1;
  circleOneDiameter = circleOneDiameter + 0.025;
  
  // draws the circle going upwards
  fill (200);
  circle(circleTwoX, circleTwoY, circleTwoDiameter);
  
  circleTwoY = circleTwoY - 5;
  circleTwoDiameter = circleTwoDiameter - 0.15;
}
