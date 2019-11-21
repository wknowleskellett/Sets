package sets;

public class OrderedPair<A, B> {
	private A a;
	private B b;
	Set firstSet;
	Set secondSet;

	@SuppressWarnings("unchecked")
	public OrderedPair(A a, B b) {
		this.a = a;
		this.b = b;
		this.firstSet = new Specific<A>((A[]) new Object[] { a });
		if (b != a) {
			this.secondSet = new Specific<Object>(new Object[] { a, b });
		} else {
			b = null;
		}
	}

	public A getA() {
		return a;
	}

	public B getB() {
		return b;
	}

	public boolean contains(Object A) {
		if (A instanceof Set) {
			// TODO make sure A is either firstSet or secondSet

			return true;
		} else {
			return false;
		}
	}

}
