package com.voya.runner;

import com.HA.volume.Volume;

public class VolumeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Volume vol=new Volume();
		double result=vol.volumeOfSphere(15.5);
		System.out.println("Volume of sphere is"+result);
		
		result=vol.volumeOfCylinder(15.5, 65.2);
		
		System.out.println("Volume of cylinder is "+result);
		
		result=vol.volumeOfCuboid(20, 20.5, 65.2);
		
		System.out.println("Volume of cuboid is "+result);
		
		result=vol.volumeOfCone(2, 3);
		
		System.out.println("Volume of cone is "+result);
			

	}

}
