
void setup(){
  size(500,500);
  PImage face = loadImage("face.jpeg");
  face.resize(500,500);
  image(face, 0, 0);

 
  
  
}
int bob = 10;
void draw(){
fill(mouseY,bob,mouseX);
  if(mouseX > mouseY){
  bob = bob + 1;
}

  if(mouseX < mouseY){bob = bob - 1;}
  ellipse(215,145,50,50);
  ellipse(330,175,50,50);
  
 fill(0,0,0);
 ellipse(215+mouseX/50 - 5,145+mouseY/50-5,20,20);
 ellipse(330+mouseX/50 - 5,175+mouseY/50-5,20,20);
  

}
  

