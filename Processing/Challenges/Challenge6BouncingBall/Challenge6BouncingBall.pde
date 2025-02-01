// Name - Daksh Gulati
// Date - 
// Purpose - creates a ball which bounces off the walls

void setup(){
  size(700, 700);
  background(155);
}

// sets variables
float ballX = 50;
float ballY = 50;
float ballSpeedX = 3;
float ballSpeedY = 5;

void draw(){
  background(150);
  
  fill(255);
  ellipse(ballX, ballY, 50, 50);
  
  // updates x and y position of the ball respectively
  ballX += ballSpeedX;
  ballY += ballSpeedY; 

  
  // Check if the ball hits the left or right edge of the canvas
  if(ballX > width || ballX < 0){
    // reverse its x-direction by multiplying the speed by -1
    ballSpeedX *= -1; 
  }
  
  // Check if the ball hits the top or bottom edge of the canvas
  if (ballY > height || ballY < 0){
    // reverse its y-direction by multiplying the speed by -1
    ballSpeedY *= -1;
  }
}
