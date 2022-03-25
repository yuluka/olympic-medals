package model;

public class Country {
	public String name;
	public int maleGold;
	public int maleSilver;
	public int maleBronze;
	public int femaleGold;
	public int femaleSilver;
	public int femaleBronze;
	
	public int totalGold;
	public int totalSilver;
	public int totalBronze;
	
	public Country(String name, int maleGold, int maleSilver, int maleBronze, int femaleGold, int femaleSilver,
			int femaleBronze) {
		this.name = name;
		this.maleGold = maleGold;
		this.maleSilver = maleSilver;
		this.maleBronze = maleBronze;
		this.femaleGold = femaleGold;
		this.femaleSilver = femaleSilver;
		this.femaleBronze = femaleBronze;
		combineMedals();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaleGold() {
		return maleGold;
	}

	public void setMaleGold(int maleGold) {
		this.maleGold = maleGold;
	}

	public int getMaleSilver() {
		return maleSilver;
	}

	public void setMaleSilver(int maleSilver) {
		this.maleSilver = maleSilver;
	}

	public int getMaleBronze() {
		return maleBronze;
	}

	public void setMaleBronze(int maleBronze) {
		this.maleBronze = maleBronze;
	}

	public int getFemaleGold() {
		return femaleGold;
	}

	public void setFemaleGold(int femaleGold) {
		this.femaleGold = femaleGold;
	}

	public int getFemaleSilver() {
		return femaleSilver;
	}

	public void setFemaleSilver(int femaleSilver) {
		this.femaleSilver = femaleSilver;
	}

	public int getFemaleBronze() {
		return femaleBronze;
	}

	public void setFemaleBronze(int femaleBronze) {
		this.femaleBronze = femaleBronze;
	}
	
	public void combineMedals() {
		totalGold = maleGold + femaleGold;
		totalSilver = maleSilver + femaleSilver;
		totalBronze = maleBronze + femaleBronze;
	}
}
