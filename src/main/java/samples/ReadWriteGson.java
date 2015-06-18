package main.java.samples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.naming.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;

public class ReadWriteGson {
	
	public static void main(String [] args) {
		String filename = "cars.json";
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Car audiA4 = new Car("Audi", "A4", 2010);
		Car audiA6 = new Car("Audi", "A6", 2010);
		ArrayList<Car> cars = new ArrayList<Car>();
		cars.add(audiA6);
		cars.add(audiA4);
		String jsonElement = gson.toJson(cars);
		writeToJson(filename, jsonElement);
		
		System.out.println("ArrayList of Car objects to json");
		System.out.println(jsonElement);
		
		try {
			readFromJson(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void writeToJson(String filename, String string) {
		FileWriter writer;
		try {
			writer = new FileWriter(filename);
			writer.write(string);
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void readFromJson(String filename) throws FileNotFoundException {
		Gson gson = new Gson();
		BufferedReader br = new BufferedReader(new FileReader("cars.json"));
		
		Car[] list = gson.fromJson(br, Car[].class);
		System.out.println("read json file into list of CAR objects");
		for (Car car: list) {
			System.out.println(car);
		}
	}

}
