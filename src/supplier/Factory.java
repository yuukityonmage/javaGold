package supplier;

public class Factory {
	public static A create() {
		return new B();
	}
}
