package gitInClass;

import java.util.ArrayList;

public class testingGit {
	public static void main(String args[]){
		ArrayList<Stars> stars = new ArrayList<Stars>();
		
		stars.add(new Stars());
		stars.add(new BigStar());
		stars.add(new SmallStar());
		stars.add(new Suppernova());
		stars.add(new BlackWhole()); //new
		
		for(int i = 0; i < stars.size(); i++){
			System.out.println(stars.get(i).toString());
		}
		
	}
}
