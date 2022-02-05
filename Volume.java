package com.HA.volume;

public class Volume {
	
	public double volumeOfSphere(double radius) {
		
		double sphereArea=(4*3.14*radius*radius*radius)/3;
		return sphereArea;
		
	}
	
public double volumeOfCylinder(double radius,double height) {
		
		double cylinderArea=(3.14*radius*radius*height);
		return cylinderArea;
		
	}

public double volumeOfCuboid(double length,double width, double height) {
	
	double cuboidArea=length*width*height;
	return cuboidArea;
	
}

public double volumeOfCone(double radius,double height) {
	
	double coneArea=(3.14*radius*radius*height)/3;
	return coneArea;
	
}

}
