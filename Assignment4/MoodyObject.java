package Q2;

public abstract class MoodyObject {
	protected abstract String getMood();
	
	protected abstract void expressFeelings();
	
	public void queryMood() {
		if (getMood().equals("Happy")) {
			System.out.println("I feel happy today£¡");
		} else {
			System.out.println("I feel sad today£¡");
		}
	}
}
