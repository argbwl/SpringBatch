package com.ab.app;

import com.ab.util.GenerateData;

public class App {
  public static void main(String[] args) {
		
	//generate data
	GenerateData data = new GenerateData();
	data.getSampleData("src/main/resources/DATA/sampleData.csv");
	
  }
}
