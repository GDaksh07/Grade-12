// Name - Daksh Gulati
// Date -
// Purpose - creates many shapes in various patterns with colours of each becoming lighter each time the code is ran

void setup () {
  size (650, 650);
  background (170);
}

// lineCreation (float, float, float, float, float) -> void
public void lineCreation (float x, float y, float y2, float yIntervals, float colourLine){
  // sets y to yPosition for the method and draws a new line dependng on this y position
  for (float yPosition = y; yPosition <= y2; yPosition += yIntervals){
   // changes colour of stroke
   stroke (colourLine);
   // draws lines at specific x and y coordinates
   line (width / 2, height, x, yPosition);
   // makes stroke more faint from black to white
   colourLine += 17;
  }
}

void draw () {
  // changes stroke back to 0 as the method above makes it white
  stroke (0);
  
  // initializes triangle variables
  float triX = width / 3.15;
  float triXLength = 20;
  float triY = height / 10;
  float triYHeight = 70;
  float colourBlue = 0;

  // loops to paste 4 triangles within the set parameters
  while (triX <= width / 2 * 1.5) {
    // fills each triangle to a different of blue
    fill (0, 0, colourBlue);

    // pastes a seperate triangle according to the specific x and y coordinates
    triangle (triX - triXLength, triY + triYHeight, triX, triY, triX + triXLength, triY + triYHeight);

    // makes triX higher to move it across by 80 pixels and colour of blue increases each time loop is ran
    triX += 80;
    colourBlue += 100;
  }

  // initializes circle variables
  float circX = width / 3 + 20;
  float circY = width / 3;
  float radius = 45;
  float colourGreen = 70;

  // loops to paste 5 circles within the set parameters
  while (circX < width / 3 * 2) {
    // fills each circle to a different colour of green
    fill (0, colourGreen, 0);

    // pastes a seperate circle according to the specific x and y coordinated
    circle (circX, circY, radius);

    // makes the circle move across by how much the radius is so the circles are touching and colour green increases each time loop is ran
    circX += radius;
    colourGreen += 30;
  }

  // initializes rectangle 1 variables
  float rectX = width / 11;
  float rectY = height / 11;
  float rectWidth = 80;
  float rectHeight = 80;
  float colourRed = 0;
  
  float rect2X = width / 10 * 7.9;
  float rect2Y = height / 11;

  while (rectY < height / 10 * 9) {
    // fills each rectangle to a different colour of red
    fill (colourRed, 0, 0);
    
    // Rectangle 1
    // pastes a seperate rectangle according to the specific x and y coordinates
    rect (rectX, rectY, rectWidth, rectHeight);
    
    // Rectangle 2
    // pastes a seperate rectangle according to the specific x and y coordinates
    rect (rect2X, rect2Y, rectWidth, rectHeight);

    // moves rectangle down by the size of the rectangle and increases the colour of red when the loop is ran for rectangle 1
    rectY += rectHeight;
    
    // moves rectangle down by the size of the rectangle and increases the colour of red when the loop is ran for rectangle 2
    rect2Y += rectHeight;
    
    colourRed += 40;
  }

  // initializes the lines variables
  float lineX = rectX + rectWidth;
  float lineYStart = height / 11;
  float lineYEnd = height / 10 * 10;
  float lineInterval = rectWidth / 2;
  float strokeColour = 0;
  
  // calls the lineCreation method to make lines on the left side
  lineCreation (lineX, lineYStart, lineYEnd, lineInterval, strokeColour);
  
  // variable to have the lines in the opposite direction
  float lineX2 = width / 10 * 7.9;
  
  // calls the lineCreation method to make lines on the right side
  lineCreation (lineX2, lineYStart, lineYEnd, lineInterval, strokeColour);
}
