// Name - Daksh Gulati
// Date - 
// Purpose - if mouse is hovered over a quadrant, that quadrant will change colours from white to any other pre specified colour

void setup (){
 size (600, 600);
 fill (255);
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
  // fills specific colour for each hoverSquare
  color c1 = color(255, 0, 0);  
  hoverSquare (0, 0, width/2, height/2, c1);
  
  color c2 = color(0, 255, 0);  
  hoverSquare (width/2, 0, width/2, height/2, c2);
  
  color c3 = color(0, 0, 255);  
  hoverSquare (0, height/2, width/2, height, c3);
  
  color c4 = color(0);  
  hoverSquare (width/2, height/2, width, height, c4);
}
