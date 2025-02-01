// Name - Daksh Gulati
// Date - 
// Purpose - moves a square inside the window depending on which arrow key is pressed and turns green if clicked on it.

void setup (){
 size (600, 600);
 background (155);
}

float rectX1 = 10;
float rectY1 = 10;
float rectX2 = 50;
float rectY2 = 50;

void draw (){
  background (155);
  
  // checks which arrow key is pressed and moves the square in that direction
  if (keyPressed == true && (keyCode == RIGHT)){
    rectX1 += 2;
  } else if (keyPressed == true && (keyCode == LEFT)){
    rectX1 -= 2;
  } else if (keyPressed == true && (keyCode == UP)){
    rectY1 -= 2;
  } else if (keyPressed == true && (keyCode == DOWN)){
    rectY1 += 2;
  }
  
  // ensures that the colour of the square turns to green only if pressed on it
  if (mousePressed && mouseX > rectX1 && mouseX < rectX1 + rectX2 - 10 && mouseY > rectY1 && mouseY < rectY1 + rectY2 - 10){
    fill(0,255,0);
  } else{
    fill(0);
  }
  
  // draws the rectangle
  rect (rectX1, rectY1, rectX2, rectY2);
}
