// Name - Daksh Gulati
// Date - 
// Purpose - draws circles in a random spot with random colour and if any key is pressed a random sized rectangle is placed as well starting from 0,0 with random colour
//           if mouse is pressed everything is removed

void setup (){
 size (500,500);
 background (150);
}


// allows shapes to be drawed and draws random circles with random colour
void draw (){
  fill (random(255), random(255), random(255));
  circle(random(width), random (height), 40);
}


// draws a random sized rectangle with random colour
void keyPressed (){
  fill (random (255), random(255), random(255));
 rect(0, 0, random(width), random(height)); 
}


// when mouse is pressed entire screen is cleared back to original colour
void mousePressed (){
  background (150);
}
