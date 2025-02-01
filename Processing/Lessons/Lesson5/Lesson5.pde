// Name - Daksh Gulati
// Date - 
// Purpose - 

int diameter;
int speed = 3;
int dir = 1;

void setup (){
 size (500,500);
 background (150);
 diameter = width;
}

void draw (){
  background (150);
  
 diameter = diameter + speed * dir;
 
 if (diameter < 50) {
    fill (0, 150, 0); 
 } else if (diameter < 150){
    fill (0, 0, 255); 
 } else {
    fill (255, 0, 0); 
 }
 
 if (diameter >= 150) {
    dir = -1; 
 } 
 
 if (diameter <= 20) {
    dir = 1; 
 }
 
 ellipse (width/2, height/2, diameter, diameter);
}
