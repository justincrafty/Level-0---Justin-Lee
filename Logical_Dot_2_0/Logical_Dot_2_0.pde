 
   int b = 0;
 void setup() {
  
   
   size(800, 800);
  ellipse(400,400,400,400);
}

void draw() {
  fill(100,100,b);
  if(mousePressed){
  b=b+1;
  ellipse(400,400,400,400);
  if(b>255){
  text("You Won" ,300,100);
  }
}
   //2. make it a nice color

   //3. if the mouse is pressed, fill the circle with a different color          

   //1. draw an ellipse

}
// Copyright Wintriss Technical Schools 2013


