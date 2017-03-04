
//1. Make a variable to hold the X co-ordinate of the dot, and set it to something.
int B = 0;
void setup() {
  size(800, 200);
}

void draw() {
  //3. make it a nice color
 fill(0,0,0);
  //4. if the mouse is pressed...
 if(mousePressed){
 B = B+1;
 }
 if(B>700){
 text("YOU WON",400,10);
 }
  //5. ... change the X co-ordinate so that the dot moves to the right
    
  //2. Draw an ellipse of height and width 100. Make sure to use your variable for the X position.
 ellipse(B,mouseY,20,20);
  //6. Make your dot move really fast so that it can win the race (you have to figure out what part of your code to change)

  //7. Use this method to play a ding when your dot crosses the finish line.
 
}


