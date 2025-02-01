// Name - Daksh Gulati
// Date - 
// Purpose - Draws a circle in only the left half of the window not allowing it to move to the right half

void setup(){
  size(700, 700);
  background(150);
}

void draw(){
  background(150);
  
  // checks when the mouse cursor reaches the line, it sets the 
  // x and y value of the circle to half the width of the window and mouseY ensuring it moves only from top to bottom.
  if (mouseX >= width/2){
    circle(width/2, mouseY, 50);
  } else{
    circle(mouseX, mouseY, 50);
  }
  
  line(width/2, 0, width/2, height);
}
