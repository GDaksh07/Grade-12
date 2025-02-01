// Name - Daksh Gulati
// Date -
// Purpose - creates circles in a checker pattern (if starting from top left corner)

void setup () {
  size (500, 500);
  background (255);
}

void draw () {
  noStroke ();
  // sets variables
  float xPos = 10;
  float yPos = 10;

  while (xPos <= mouseX) {
    // checks to create a full circle or not
    float rem = mouseX % 2;
    
    // runs the code if the remainder is 0
    if (rem == 0) {
      // fills a random saturation from 0 - 255 of the colour pink
      fill (245, 61, 245, random(255));
      circle (xPos, mouseY, 10);
    }
    xPos += 10;
  }

  while (yPos <= mouseY) {
    // checks to create a full circle or not
    float rem = mouseY % 2;
    
    // runs the code if the remainder is 0
    if (rem == 0) {
      // fills a random saturation from 0 - 255 of the colour pink
      fill (245, 61, 245, random(255));
      circle (mouseX, yPos, 10);
    }
    yPos += 10;
  }
  
  // creates blank space when mouse is not in that x or y axis
  if (yPos> mouseY){
   noStroke ();
   fill (255);
   rect (mouseX, mouseY, 500, 500);
   rect (mouseX, mouseY, -500, 500);
   rect (mouseX, mouseY, 500, -500);
  }
}
