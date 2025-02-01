// Title: Built in variables and methods
// Date - 26 / 09 / 24
// Name - Daksh Gulati

void setup () {
  size (600,600);
  background (200, 150, 0);
}


// draws in 30 fps
void draw () {
  background (200, 150, 0);
  
  //circle (width/2, height/2, 50);
  
  circle (mouseX, mouseY, 50);
  
  //rect (width/2, height/2, mouseX, mouseY);
}


void keyPressed(){
  line (0, 0, width, height);
}


void mousePressed(){
 fill(0);
 circle (50, 50, 10);
}
