package supplier;

public class Sample {

	public static void main(String[] args) {
		Test test = new Test();
		test.excute(()-> new B());
	}

}
