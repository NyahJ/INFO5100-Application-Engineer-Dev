package QA;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mreview mreview = new Mreview("abc", 5);
		mreview.addRating(1);
		mreview.addRating(2);
		mreview.addRating(6);
		double ave = mreview.aveRating();
		System.out.println(ave);
		System.out.println(mreview.getTitle());
		System.out.println(mreview.numRatings());
		
		Mreview obj = new Mreview("abcd", 8);
		System.out.println(mreview.getTitle().compareTo(obj.getTitle()));
		System.out.println(mreview.getTitle().equals(mreview.getTitle()));
		System.out.println(mreview.getTitle()+ ",average " + mreview.aveRating() + " out of " + mreview.numRatings() + " ratings");

	}

}
