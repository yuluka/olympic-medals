package model;

import java.util.ArrayList;
import java.util.Collections;

public class CountryData {
	public ArrayList<Country> countries;

	public CountryData() {
		countries = new ArrayList<>();
	}
	
	public void addCountry(String countryInfo) {
		String[] parts = countryInfo.split(";");
		
		String name = parts[0];
		int maleGold = Integer.parseInt(parts[1]);
		int maleSilver = Integer.parseInt(parts[2]);
		int maleBronze = Integer.parseInt(parts[3]);
		int femaleGold = Integer.parseInt(parts[4]);
		int femaleSilver = Integer.parseInt(parts[5]);
		int femaleBronze = Integer.parseInt(parts[6]);
		
		countries.add(new Country(name, maleGold, maleSilver, maleBronze, femaleGold, femaleSilver,
				femaleBronze));
	}
	
	public String showList1() {
		sortList1();
		String list = "Masculino\n";
		
		for (Country c : countries) {
			list += c.name + " " + c.maleGold + " " + c.maleSilver + " "
					+ c.maleBronze + "\n";
		}
		
		list += "----------";
		
		return list;
	}
	
	public void sortList1() {
		Collections.sort(countries, (A, B) -> {
			if(B.maleGold == A.maleGold) {
				if(B.maleSilver == A.maleSilver) {
					if(B.maleBronze == A.maleBronze) {
						return B.name.compareTo(A.name);
					} else {
						return B.maleBronze - A.maleBronze;
					}
				} else {
					return B.maleSilver - A.maleSilver;
				}
			} else {
				return B.maleGold - A.maleGold;
			}		
		});
	}
	
	public String showList2() {
		sortList2();
		String list = "Femenino\n";
		
		for (Country c : countries) {
			list += c.name + " " + c.femaleGold + " " + c.femaleSilver + " "
					+ c.femaleBronze + "\n";
		}
		
		list += "----------";
		
		return list;
	}
	
	public void sortList2() {
		Collections.sort(countries, (A, B) -> {
			if(B.femaleGold == A.femaleGold) {
				if(B.femaleSilver == A.femaleSilver) {
					if(B.femaleBronze == A.femaleBronze) {
						return B.name.compareTo(A.name);
					} else {
						return A.femaleBronze - B.femaleBronze;
					}
				} else {
					return A.femaleSilver - B.femaleSilver;
				}
			} else {
				return A.femaleGold - B.femaleGold;
			}		
		});
	}
	
	public String list3() {
		sortList3();
		String list = "Combinado\n";
		
		for (Country c : countries) {
			list += c.name + " " + c.totalGold + " " + c.totalSilver + " "
					+ c.totalBronze + "\n";
		}
		
		return list;
	}
	
	public void sortList3() {
		bubbleSortTotalGold();
	}
	

	public void bubbleSortTotalGold() {
		for (int i = 0; i < countries.size()-1; i++) {
			for (int j = 0; j < countries.size()-i-1; j++) {
				if(countries.get(j).totalGold < countries.get(j+1).totalGold) {
					Country aux = countries.get(j+1);
					countries.remove(j+1);
					countries.add(j+1, countries.get(j));
					countries.remove(j);
					countries.add(j, aux);
					
				} else if(countries.get(j).totalGold == countries.get(j+1).totalGold) {
					if(countries.get(j).totalSilver < countries.get(j+1).totalSilver) {
						Country aux = countries.get(j+1);
						countries.remove(j+1);
						countries.add(j+1, countries.get(j));
						countries.remove(j);
						countries.add(j, aux);
						
					} else if(countries.get(j).totalSilver == countries.get(j+1).totalSilver) {
						if(countries.get(j).totalBronze < countries.get(j+1).totalBronze) {
							Country aux = countries.get(j+1);
							countries.remove(j+1);
							countries.add(j+1, countries.get(j));
							countries.remove(j);
							countries.add(j, aux);
							
						} else if(countries.get(j).totalBronze == countries.get(j+1).totalBronze) {
							if(countries.get(j).name.compareTo(countries.get(j+1).name) < 0) {
								Country aux = countries.get(j+1);
								countries.remove(j+1);
								countries.add(j+1, countries.get(j));
								countries.remove(j);
								countries.add(j, aux);
								
							}
						}
					}
				}
			}
		}
	}
}
