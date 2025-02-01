// Name - Daksh Gulati
// Date - 
// Purpose - draws circles where the mouses coordinates are, also a line is drawn if a key is pressed and a circle is drawn if a mouse button is pressed

void setup (){
 size (500,500);
}

void draw() {
  background (150);
  
  // draws a circle which follows mouse coordinates
  fill(255);
  circle(mouseX, mouseY, 50);
}

// a diagonal line is drawn if a key is pressed
void keyPressed(){
  line(0, 0, width, height);  
}

// draws a circle if mouse is pressed
void mousePressed(){
  fill(0);
  circle(50, 50, 90);
}
