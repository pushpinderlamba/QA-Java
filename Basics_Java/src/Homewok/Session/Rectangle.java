package Homewok.Session;

import java.util.Scanner;

public class Rectangle implements Resizable {
	

	
	int width;
    int height;
    
    
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        
        
    }
	@Override
	public void resizeWidth(int width) {
		this.width = width;
		
	}

	@Override
	public void resizeHeight(int height) {
		this.height = height;
		
	}
	
	public void printSize() {
        System.out.println("Width: " + width + ", Height: " + height);
	
}
}
	