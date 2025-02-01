// Name - Daksh Gulati
// Date - 
// Purpose - has a circle in the middle and has the option to change the circles colour, size of the stroke and if the stroke exists or not by different functions

// sets variable
float circleStroke = 10;

void setup(){
 size (500, 500); 
 background(155);
 fill (0);
}

void draw (){
 background(155);
  
 stroke (255);
 
 // if mouse is pressed the stroke disappears 
 if (mousePressed == true) {
    stroke (0);
  }
  
  // changes how big the stroke is
  if (keyPressed && (key == '+') && circleStroke < 20) {
     circleStroke += 0.5; 
  } else if (keyPressed && (key == '-')  && circleStroke > 5) {
     circleStroke -= 0.5; 
  }
   
  strokeWeight (circleStroke);
  ellipse (width/2, height/2, 150, 150); 
}

// fills the colour to red, blue, green or back to black if specific key was clicked
void keyPressed (){
    if (key == 'r' || key == 'R'){
       fill (255, 0, 0);
    } else if (key == 'g' || key == 'G') {
       fill (0, 255, 0);
    } else if (key == 'b' || key == 'B') {
       fill (0, 0, 255);
    } else if (key == ENTER){
       fill (0);
    }
  }
