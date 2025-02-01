// Name - Daksh Gulati
// Date -
// Purpose - places static lines horizontally at each y coordinate (every 5 y pixels)

void setup () {
  size (500, 500);
  background (155);
}

// sets variables
float x = 0;
float y = 0;

void draw () {
  // changes stroke weight to 5
  strokeWeight (5);

  // loops to print static lines everytime the y goes down by 5 (this is due to the stroke weight being 5)
  while (y < height) {
    line (x, y, random (500), y);
    y += 5;
  }
}
