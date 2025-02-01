// Name - Daksh Gulati
// Date - 
// Purpose - has 2 different circles in a ripple pattern going upwards / downwards respectively and get teleported back to the bottom / top once the circle reaches the middle line

void setup (){
 size (500, 500);
 background (155);
}

// sets variables
int ellipseOneX = 0;
int ellipseOneY = 500;
int ellipseTwoX = 0;
int ellipseTwoY = 0;

void draw (){
  // line in middle
  stroke (0);
  line (width, width/2, 0, height/2);
  
  // circle 1
  fill (255);
  ellipse (ellipseOneX, ellipseOneY, 50, 50);
  ellipseOneX += 1.5;
  ellipseOneY -= 7;
  
  // moves circle right if it hits the border in the middle
  if (ellipseOneY <= height/2){
    ellipseOneX += 2;
    ellipseOneY = 500;
  }
  
  // moves circle back to the left when reaching edge
  if (ellipseOneX > height) {
    ellipseOneX = 0;
  }
  
  // circle 2
  fill (0);
  stroke (255);
  ellipse (ellipseTwoX, ellipseTwoY, 75, 75); 
  ellipseTwoX += 1;
  ellipseTwoY += 2;
  
  // moves circle right if it hits the border in the middle
  if (ellipseTwoY >= height/2){
    ellipseTwoX += 2;
    ellipseTwoY = 0;
  }
  
  // moves circle back to the left when reaching edge
  if (ellipseTwoX > height) {
    ellipseTwoX = 0;
  }
}
