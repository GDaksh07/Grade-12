// Title - ProcessingUnit2Assignment
// Date - 18/10/24
// Name - Daksh Gulati

void setup () {
  size (800, 500);
}

// sets variables for name
float back = 0;
float xStart = 50;
float xVar = 50;
float yStart = 150;
float yEnd = 350;

// sets variable for colour of shapes
color colourShapes = color (155);

// variable for if name should be shown or not
boolean showName = true;

// sets variables for triangle
float triX1 = 0;
float triY1 = 15;
float triX2 = 5;
float triY2 = 0;
float triX3 = 10;
float triY3 = 15;
color triCol = color (0, 0, 100);

void draw () {
  // Changes background colour
  background (back);

  // if the first letter of my name is pressed, a blue background of triangles are also placed in the background
  if (keyPressed && (key == 'd') || (key == 'D')) {
    drawTriangleBack (triX1, triY1, triX2, triY2, triX3, triY3, triCol);
  }
  
  // Moves name back to original spot
  if (mousePressed == true && mouseButton == CENTER){
    xStart = 50;
  }
  
  // Changes colour of triangles
  // changes colour to red
  if (keyPressed == true && key == 'a' || key == 'A'){
    triCol = color (100, 0, 0);
    // changes colour back to blue
  } else if (keyPressed == true && key == 'c' || key == 'C') {
    triCol = color (0, 0, 100); 
  }

  // Draws name
  if (showName == true) {
    drawLetterD (xStart, xVar, yStart, yEnd, colourShapes);
    drawLetterA (xStart, xVar, yStart, yEnd, colourShapes);
    drawLetterK (xStart, xVar, yStart, yEnd);
    drawLetterS (xStart, xVar, yStart);
    drawLetterH (xStart, xVar, yStart, yEnd);
  }
}

// Changes background colour each time the mouse is clicked then released
void mouseWheel () {
  if (back == 0) {
    back = 245;
  } else {
    back = 0;
  }
}

// Moves name to the right or left depending on the mouse button
void mousePressed () {
  if (mouseButton == RIGHT) {
    // moves name to the right
    xStart += 2;
  } else if (mouseButton == LEFT) {
    // moves name to the left
    xStart -= 2;
  }
}

// drawTriangleBack (float, float, float, float, float, float) -> void
// Draws a triangle grid behind the name
public void drawTriangleBack (float x1, float y1, float x2, float y2, float x3, float y3, color col) {
  // variable for while loop
  float yPos = 0;

  // Fills triangles with designated colour
  fill (col);
  
  // Creates a grid of triangles behind the name
  while (yPos < height) {
    for (float xPos = 0; xPos < width; xPos += 10) {
      triangle (x1 + xPos, y1 + yPos, x2 + xPos, y2 + yPos, x3 + xPos, y3 + yPos);
    }
    yPos += 15;
  }
}

// drawLetterD (float, float, float, float) -> void
// Draws letter D
public void drawLetterD (float x1, float x2, float y1, float y2, color col) {
  // changes colour of stroke and fill for the rect
  stroke (col);
  fill (col);
  rect (x1, y1 - 50, x2 - 30, y2 - 50);

  // changes colour of stroke and stroke weight for arc
  noFill ();
  strokeWeight (15);
  arc (x1, y2 - 100, x2 + 150, y2 - 59, 4.9, 7.7);
}

// drawLetterA (float, float, float, float) -> void
// Draws letter A
public void drawLetterA (float x1, float x2, float y1, float y2, color col) {
  // changes stroke weight back to 1 and fills colour for the letters below
  strokeWeight (1);
  fill (col);
  quad (x1 + 120, y2 + 50, x1 + 140, y2 + 50, x1 + 200, y1 - 40, x1 + 180, y1 - 40);
  quad (x1 + 240, y2 + 50, x1 + 260, y2 + 50, x1 + 200, y1 - 40, x1 + 180, y1 - 40);
  rect (x1 + 155, y2 / 2 + 70, x2 + 20, y1 - 135);
}

// drawLetterK (float, float, float, float) -> void
// Draws letter K
public void drawLetterK (float x1, float x2, float y1, float y2) {
  rect (x1 + 300, y1 - 40, x2 - 30, y1 + 140);
  quad (x1 + 320, y2 / 2 + 60, x1 + 320, y2 / 2 + 90, x1 + 395, y1 - 40, x1 + 370, y1 - 40);
  quad (x1 + 320, y2 / 2 + 60, x1 + 320, y2 / 2 + 90, x1 + 370, y2 + 50, x1 + 395, y2 + 50);
}

// drawLetterS (float, float, float) -> void
// Draws letter S
public void drawLetterS (float x1, float x2, float y) {
  rect (x1 + 430, y - 40, x2 + 60, y - 120);
  rect (x1 + 430, y - 40, x2 - 30, y + 10);
  rect (x1 + 430, y + 90, x2 + 60, y - 120);
  rect (x1 + 520, y + 90, x2 - 30, y + 10);
  rect (x1 + 430, y + 220, x2 + 60, y - 120);
}

// drawLetterH (float, float, float, float) -> void
// Draws letter H
public void drawLetterH (float x1, float x2, float y1, float y2) {
  rect (x1 + 580, y1 - 40, x2 - 20, y2 - 60);
  rect (x1 + 680, y1 - 40, x2 - 20, y2 - 60);
  rect (x1 + 600, y1 + 90, x2 + 50, y1 - 120);
}

// Depending on what key is pressed, the colour of the name will change
void keyPressed () {
  // Changes colour to red
  if (key == 'r' || key == 'R') {
    colourShapes = color (255, 0, 0);
    // Changes colour to green
  } else if (key == 'g' || key == 'G') {
    colourShapes = color (0, 255, 0);
    // Changes colour to blue
  } else if (key == 'b' || key == 'B') {
    colourShapes = color (0, 0, 255);
    // Changes colour to orange
  } else if (key == 'o' || key == 'O') {
    colourShapes = color (255, 165, 0);
    // Changes colour to grey
  } else if (key == ENTER) {
    colourShapes = color (155);
  }
}

// If the boolean is true, the name will show but once backspace is released, the name will disappear, same for vice versa
void keyReleased () {
  if (keyCode == BACKSPACE) {
    showName = !showName;
  }
}
