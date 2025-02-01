// Name - Daksh Gulati
// Date -
// Purpose - has circles on a screen with a gradiant pattern (background and foreground) and if a mouse button is pressed, the circles switch to triangles
//           also a circle at the bottom half of the screen decreasing in saturation

// sets circle pressed to true so the loop initially starts with circles
boolean circlePressed = true;

void setup () {
  size (400, 500);
  background (155);
}

// sets squareSize variable
float squareSize = 13;

// sets radius for the circle
float radius = 100;

void draw () {
  noStroke ();
  
  fill (255);
  rect (0, height / 2, width, height);

  // sets variables for gradiants
  float gradiant = 0;
  float shapeGradiant = 255;

  // loops to make the gradiant of the background and shapes
  for (int yPos = 0; yPos <= height / 2; yPos += squareSize) {
    for (int xPos = 0; xPos <= width; xPos += squareSize) {
      // makes the gradiant background
      fill (gradiant);
      square (xPos, yPos, squareSize);
      
      // makes the shape gradiant the opposite way
      fill (shapeGradiant);
      // checks to place circles or triangles
      if (circlePressed == true) {
        circle (xPos + squareSize / 2, yPos + squareSize / 2, squareSize / 2);
      } else {
        triangle (xPos + squareSize / 4, yPos + squareSize / 4 * 3, xPos + squareSize / 2, yPos + squareSize / 4, xPos + squareSize / 4 * 3, yPos + squareSize / 4 * 3);
      }
    }
    // creates the gradiant effect
    gradiant += 20;
    shapeGradiant -= 10;
  }
  
  // sets variables for circle
  float circleSaturation = 15;
  float radius = 250;
  
  // creates a loop so the circles saturation at the edges is the lowest while it gets higher in the middle
  while (circleSaturation <= 255){
   fill (245, 80, 220, circleSaturation);
   ellipse (width / 2, height / 4 * 3, radius, radius);
   circleSaturation += 0.5;
   radius -= 1;
  }
}

// if the mouse is pressed, the boolean switches to make triangles instead of circles vice versa
void mousePressed () {
  circlePressed = !circlePressed;
}
