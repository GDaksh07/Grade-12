// Name - Daksh Gulati
// Date - 24 / 09 / 24
// Purpose - builds a house with a sun and grass

void setup (){ 
  size (400, 400);
  background (150);
}

int houseX = 270;
int houseY = 165;

int sunX = 125;
int sunY = 200;

int cloudX = 100;
int cloudY = 100;


// drawHouse (int, int) -> void
// purpose: draws the house waiting to be displayed
public void drawHouse (int houseX, int houseY){
// Draws House
  fill (150, 0, 0);
  stroke (0);
  rect (houseX, houseY, 105, 85);
  
  // Draws Door
  fill (255);
  stroke (0);
  rect (houseX + 39, houseY + 30, 28, 45);
  
  // Draws Door Handle
  fill (0);
  stroke (0);
  circle (houseX + 45,houseY + 52, 5);
  
  // Draws House Roof
  fill (0);
  stroke (0);
  triangle (houseX + 52.5, houseY - 20, houseX - 10, houseY, houseX + 115, houseY);
}



// drawSun (int, int) -> void
// purpose: draws the sun and sun rays waiting to be displayed
public void drawSun (int sunX, int sunY){
  // Draws Sun
  fill (246, 250, 7);
  stroke (246, 250, 7);
  circle (sunX, sunY, 100);
  
  // Sun rays
  stroke (246, 250, 7);
  strokeWeight(3);
  line (sunX, sunY, sunX, sunY - 75);
  line (sunX, sunY, sunX + 33, sunY - 66);
  line (sunX, sunY, sunX + 55, sunY - 48);
  line (sunX, sunY, sunX + 66, sunY - 21);
  line (sunX, sunY, sunX - 33, sunY - 66);
  line (sunX, sunY, sunX - 55, sunY - 48);
  line (sunX, sunY, sunX - 66, sunY - 21);
}



// drawCloud (int, int) -> void 
// purpose: draws a cloud
public void drawCloud (int cloudX, int cloudY){
  noStroke ();
  
  fill (255);
  circle (cloudX - 5, cloudY,25);
  circle (cloudX + 5, cloudY,25);
  circle (cloudX + 15, cloudY + 15, 25);
  circle (cloudX, cloudY + 15, 25);
  circle (cloudX - 15, cloudY + 15, 25);
}


void draw (){
  drawSun (125,200);
  
  // Draws Grass
  fill (55, 235, 86);
  stroke (55, 235, 86);
  rect(0,200,400,200);
  
  drawHouse (270, 165);
  
  drawCloud (100, 50);
  drawCloud (200, 75);
}
