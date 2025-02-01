int squareSize = 100;

void setup () {
  size (800, 800);
  background (155);
}

// mouseInBounds (int, int, int, int) -> boolean
public boolean mouseInBounds (int xLow, int xHigh, int yLow, int yHigh) {
 boolean xInBounds = mouseX > xLow && mouseX < xHigh;
 boolean yInBounds = mouseY > yLow && mouseY < yHigh;
 
 return xInBounds && yInBounds;
}

// hoverSquare (int, int, int, int, int) -> void
// oyroise - creates a hoverable square at x, y that fills with shapeColour when hovered
public void hoverSquare (int x, int y, int sWidth, int sHeight, color shapeColour){
  if (mouseInBounds (x, x + sWidth, y, y + sHeight)){
   fill (shapeColour);
  } else {
   fill (255);
  }
 
  rect (x, y, sWidth, sHeight); 
}

void draw (){
  //// while the y position is less than height the loop will run
  //for (int yPosition = 0; yPosition < height; yPosition += squareSize){
  //  // while the loop inside doesnt hit the width the loop will run
  //  for (int xPosition = 0; xPosition <= width; xPosition += 100){
  //   // puts a hoverSquare at the current xPosition and yPosition
  //   hoverSquare (xPosition, yPosition, squareSize, squareSize, color (255, 0, 0)); 
  //  }
  //}
  
  // while loop version for above, same behaviour
  int yPosition = 0;
  int xPosition = 0;
  while (yPosition <= height){
    // int is being declared everytime loop is runned, more efficient to only declare once
    // int xPosition = 0;
    while (xPosition <= width){
     hoverSquare (xPosition, yPosition, squareSize, squareSize, color (255, 0, 0)); 
     xPosition += squareSize;
    }
   xPosition = 0;
   yPosition += squareSize;
  }
  // same as loop above
  //rect (50, 350, 100, 100);
  //rect (200, 350, 100, 100);
  //rect (350, 350, 100, 100);
  //rect (500, 350, 100, 100);
  //rect (650, 350, 100, 100);
}
