import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class House {
	
	public static void main(String[] args) {
	Tortoise.setSpeed(10);
		start_at_bottom();
		for (int i = 1; i < 10; i++) {
			drawHouseWithFlat("large",Color.black);
		}
		drawHouseWithFlat("large",Color.black);
	
	
	
	

	
	
	
	
}
static void start_at_bottom(){
	Tortoise.setX(20);
	Tortoise.setY(420);
	}
static void drawHouseWithFlat(String height, Color starColor){
	int small = 60;
	int medium = 120;
	int large = 250;
	if(height .equals("small")){
		Tortoise.setAngle(0);
		Tortoise.setPenColor(starColor);
		Tortoise.move(small);
		Tortoise.setAngle(90);
		Tortoise.move(30);
		Tortoise.setAngle(180);
		Tortoise.move(small);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(10);
	}
	if(height .equals("medium") ){
		Tortoise.setAngle(0);
		Tortoise.setPenColor(starColor);
		Tortoise.move(medium);
		Tortoise.setAngle(90);
		Tortoise.move(30);
		Tortoise.setAngle(180);
		Tortoise.move(medium);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(10);
		
		}
	if(height .equals("large") ){
		Tortoise.setAngle(0);
		Tortoise.setPenColor(starColor);
		Tortoise.move(large);
		Tortoise.setAngle(90);
		Tortoise.move(30);
		Tortoise.setAngle(180);
		Tortoise.move(large);
		Tortoise.setAngle(90);
		Tortoise.setPenColor(Color.green);
		Tortoise.move(10);
		
		}
	}
	

static void drawHouseWithSlantedRoof(int height){
}}

