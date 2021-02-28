package QA;

import java.util.ArrayList;

public class Mreview implements Comparable<Mreview>{
	private String title;
	private ArrayList<Integer> ratings;
	public Mreview() {
		title = "";
		ratings = new ArrayList<Integer>(); 
	}
	
	public Mreview(String ttl) {
		title = ttl;
		ratings = new ArrayList<Integer>();
	}
	
	public Mreview(String ttl, int firstRating) {
		title = ttl;
		ratings = new ArrayList<>();
		ratings.add(firstRating);
	}
	
	public String getTitle() {
		return title;
	}
	
	public void addRating(int r) {
		ratings.add(r);
	}
	
	public double aveRating() {
		int sum = 0;
		for (int i = 0; i < ratings.size(); i++) {
			sum += ratings.get(i);
		}
		return sum / (double) ratings.size();
	}
	
	public int numRatings() {
		return ratings.size();
	}
	
	@Override
	public int compareTo(Mreview obj) {
		return title.compareTo(obj.getTitle());
	}
	
	@Override
	public boolean equals(Object obj) {
		Mreview mreview = (Mreview) obj;
		return title.equals(mreview.getTitle());
	}
		
	@Override
	public String toString() {
		return title + ", average " + aveRating() + " out of " + ratings.size() + " ratings";
	}
}


