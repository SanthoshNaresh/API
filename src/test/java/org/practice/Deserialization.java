package org.practice;

import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;





public class Deserialization {

	public static void main(String[] args) throws IOException {
		
	FileReader fileReader = new FileReader("C:\\Users\\Logesh\\eclipse-workspace\\Deseralization\\src\\test\\resources\\{}tool.json");
	ObjectMapper objectMapper = new ObjectMapper();
	PojoClass readValue = objectMapper.readValue(fileReader,PojoClass.class);
	String name = readValue.getName();
    System.out.println(name);
    System.out.println(readValue.getAge());
    System.out.println(readValue.isStatus());
    
    Address address = readValue.getAddress();
    String city = address.getCity();
    String country = address.getCountry();
    String state = address.getState();
    System.out.println(city);
    System.out.println(country);
    System.out.println(state);
    
    
    
    
    
    
    
	}

}
