package ie.tudublin;

import processing.core.PApplet;

public class BugZapFollow extends PApplet
{
	float playerX, playerY, playerWidth; // Setting values for the player

	float bugX, bugY, bugWidth; // Setting values for the bug

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);

		smooth();
		// Giving the values for player meaning
		playerX = width / 2; // your screen halfed
		playerY = height - 50; // 50 down or half
		playerWidth = 50;

		// The position the bug respawns in should be different each time
		resetBug();
		
	}

	// Randoming the position of where the bug respawns 
	private void resetBug() {
	bugX = random(bugWidth / 2, width - (bugWidth/2)); // half the bugs width on left and right
	bugY = 50;
	bugWidth = 50;
	}

	void drawBug(float x, float y, float w)
	{
		float halfW = w / 2;
		stroke(255); //set colour
		noFill(); // will be wire
		triangle(y - halfW, y + halfW, x, y - halfW, x + halfW, y + halfW); // creates a trinagle in equal width to the width set
	}


	void drawPlayer(float x, float y, float w)
	{
		stroke(255); // Colour set
		noFill(); // Wireframe
		rectMode(CENTER); // Will do rect function automatically - starts from middle of object
		rect(x, y, w, 20); // Creates body - a small rectangle at bottom of screen
		line(x, y - 10, x, y - 20); // Is the shooter line
	}


	float playerSpeed = 5;

	public void keyPressed()
	{
		if (keyCode == LEFT)
		{
			playerX -= playerSpeed;
		}
		if (keyCode == RIGHT)
		{
			playerX += playerSpeed;
		}
	}

	void moveBug()
	{
		bugY ++;
		bugX += random(-20, 20);
	}

	
	public void draw()
	{	
		background(0);
		strokeWeight(2);
		drawPlayer(playerX, playerY, playerWidth);
		drawBug(bugX, bugY, bugWidth);

		}
	}

