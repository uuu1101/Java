public class SimpleDotComTestDrive {

	public static void main (String[] args) {
		simpleDotCom dot = new SimpleDotCom();
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		String userGuess = "2";
		String result = dot.checkYourself(userGuess);
	}
}

public calss SimpleDotCom {
	int[] locationCells;
	int numOfHits = 0;

	public void setLocationCells (int [] locs) {
		locationCells = locs;
	}

	public String checkYourself(String stringGuess) {
		int guess = Integer.parseInt(stringGuess);
		String result = "miss";
		for(int i = 0; i < locationCells.length; i++) {
		  if (guess == locationCells[i]) {
			result = "hit";
			numOfHits++;
			break;
		   }
		}

		if (numOfHits == locationCells.length) {
			result = "kill";
		}
		System.out.pirntln(result);
		  return result;
	}
}


