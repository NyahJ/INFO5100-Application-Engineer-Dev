package Q2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PsychiatristObject psychiatrist = new PsychiatristObject();
		HappyObject happy = new HappyObject();
		SadObject sad = new SadObject();
		psychiatrist.examine(happy);
		psychiatrist.observe(happy);
		psychiatrist.examine(sad);
		psychiatrist.observe(sad);
	}

}
