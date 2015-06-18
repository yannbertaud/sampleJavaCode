package main.java.samples;

import java.io.FileOutputStream;
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
		System.out.println(jsonElement);
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

}
