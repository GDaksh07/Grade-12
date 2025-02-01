// Name - Daksh Gulati
// Date - 
// Purpose - changes colour of mouse ball while also leaving a trail of circles at th specific coordinates

void setup (){
 size (700,500);
 background (150);
}

void draw (){
  // adds a fill to the circle and circle follows mouse
  fill (mouseX, mouseY, 255);
  circle (mouseX, mouseY, 50);
}
