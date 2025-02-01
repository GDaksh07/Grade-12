
void setup() {
  size(500, 500);
  background (0, 204, 102);
}

void draw() {
  // drawing rectangle
  fill (111, 227, 217);
  stroke (255);
  rect (100, 200, 75, 75);
  
  // drawing circle
  fill (100);
  stroke(0);
  circle (100,200,50);
  
  // drawing triangle
  fill (200,200,100);
  stroke(0);
  triangle(100, 200, 200, 200, 50, 80);
}
