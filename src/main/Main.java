package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.CountryData;

public class Main {

	private static CountryData data;
	
	public static void main(String[] args) {
		data = new CountryData();
		
		readTxt();
		showList1();
		showList2();
		showList3();
	}
	
	public static void readTxt() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("data/country-medals.txt"));
			String line = br.readLine();
			int countriesNum = Integer.parseInt(line);
			
			for (int i = 0; i < countriesNum; i++) {
				line = br.readLine();
				
				data.addCountry(line);				
			}
			
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe, manín.");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void showList1() {
		System.out.println(data.showList1());
	}

	public static void showList2() {
		System.out.println(data.showList2());
	}

	public static void showList3() {
		System.out.println(data.list3());
	}
}
