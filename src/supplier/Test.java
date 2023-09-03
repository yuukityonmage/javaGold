package supplier;

import java.util.function.Supplier;

public class Test {
	public void excute(Supplier<A> supplier) {
		System.out.println("お決まりの事前処理");
		A a = supplier.get();
		a.hello();
		System.out.println("お決まりの事後処理");
	}
}
