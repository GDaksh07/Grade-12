// Name - Daksh Gulati
// Date - 
// Purpose - makes a arc pattern

void setup(){
  size(500, 500);
  background (255);
}

// sets variables
float widthX = 250;
float heightX = 250;
float widthY = 300;
float heightY = 300;

void draw(){
  noFill();
  
  // red arc
  stroke(249, 15, 15);
  strokeWeight(15);
  arc(widthX, heightX, widthY + 115, heightY + 100, PI, TWO_PI);
  
  // yellow arc
  stroke(241, 249, 5);
  strokeWeight(17);
  arc(widthX, heightX + 70, widthY + 65, heightY + 90, 3, 6.2);
  
  // green arc
  stroke(70, 241, 2);
  strokeWeight(13);
  arc(widthX, heightX - 5, widthY + 100, heightY + 50,  2.8, 6.2);
  
  // purple arc
  stroke(195, 54, 235);
  strokeWeight(5);
  arc(widthX, heightX + 20, widthY + 115, heightY + 120, 3.4, 6.4);
  
  // blue arc
  stroke(5, 165, 240);
  strokeWeight(7);
  arc(widthX, heightX + 40, widthY + 70, heightY + 100, PI, TWO_PI);
  
  noStroke ();
  
  // red circle
  fill (249, 15, 15);
  circle (widthX, heightX, 10);
  
  // yellow circle
  fill (241, 249, 5);
  circle (widthX, heightX + 70, 10);
  
  // green circle
  fill (70, 241, 2);
  circle (widthX, heightX - 5, 10);
  
  // purple circle
  fill (195, 54, 235);
  circle (widthX, heightX + 20, 10);
  
  // blue circle
  fill (5, 165, 240);
  circle (widthX, heightX + 40, 10);
}
