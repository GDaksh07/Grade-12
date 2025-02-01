void setup(){
size (400, 400);
}

int x = 50;
int y = 50;

//void draw (){
// background (50);
// ellipse(x, y, 50, 50); 
 
// // smooth and triggered right away
// if (mousePressed) {
//  x += 2;
// }
//}

//// only triggered once, choppy
//void mousePressed (){
//  x += 2;
//}

void draw (){
 background (50);
 
 if (mousePressed && mouseButton == LEFT){
    ellipse(width/2, height/2, 50, 50); 
 } else if (mousePressed && mouseButton == RIGHT) {
   rect(width/2, height/2, 50, 50);
 } else if (mousePressed && mouseButton == CENTER) {
    rect (width/2, height/2, 150,150); 
 }
 
 
  if (keyPressed && (key == 'e' || key == 'E')) {
      triangle(width/2, height/2, 50, 50, 100, 230);
  } else if (keyPressed && (key == 'r' || key == 'R')) {
      line(width/2, height/2, 50, 50);
  }
}
