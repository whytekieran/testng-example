package com.whyte.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyExample {
  
  @Test
  public void startCar() {
	  System.out.println("Car started");
	  Assert.fail();
  }
  
  //Says this method needs startCar to pass before it will execute
  @Test(dependsOnMethods = {"startCar"})
  public void driveCar() {
	  System.out.println("Car driving");
  }
  
  @Test(dependsOnMethods = {"driveCar"})
  public void stopCar() {
	  System.out.println("Car stopped");
  }
  
  //driveCar() and stopCar() must both pass before this will execute. however alwaysRun will force to run regardless
  @Test(dependsOnMethods = {"driveCar", "stopCar"}, alwaysRun = true)
  public void parkCar() {
	  System.out.println("Car parked");
  }
}
