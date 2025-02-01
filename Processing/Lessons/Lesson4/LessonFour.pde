// Name - Daksh Gulati
// Date - 
// Purpose - 

void setup (){
 size (500,500);
 background (150);
}

float circleX = 50;
float circleY = 50;


void draw (){
  background (150);
  
  fill (255);
  circle(circleX, circleY, 40);
  
  circleX = circleX + 0.1;
  circleY = circleY + 0.1;
}
