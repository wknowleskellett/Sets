package sets;

public class CartesianProduct<A, B> extends Specific<CartesianProduct.Pair<A, B>> {
	// The Cartesian product of two sets A and B contains every
	// ordered pair (a, b) such that A.contains(a) and B.contains(B)

	Pair<A, B>[] items;

	public static <A, B> CartesianProduct<A, B> makeCartesianProduct(Specific<A> a, Specific<B> b) {

		@SuppressWarnings("unchecked")
		Pair<A, B>[] items = (Pair<A, B>[]) new Pair[a.cardinality() * b.cardinality()];
		A[] aItems = a.getItems();
		B[] bItems = b.getItems();
		for (int i = 0; i < aItems.length; i++) {
			for (int j = 0; j < bItems.length; j++) {
				items[i * aItems.length + j] = new Pair<A, B>(aItems[i], bItems[j]);
			}
		}
		return new CartesianProduct<A, B>(items);
	}

	protected static class Pair<A, B> {
		A a;
		B b;

		public Pair(A a, B b) {
			this.a = a;
			this.b = b;
		}

		public boolean equals(Object other) {
			if (!(other instanceof Pair)) {
				return false;
			}

			@SuppressWarnings("unchecked")
			Pair<Object, Object> o = (Pair<Object, Object>) other;
			return a.equals(o.a) && b.equals(o.b);
		}
	}

	public CartesianProduct(Pair<A, B>[] items) {
		super(items);
	}

	public boolean containsPair(Object a, Object b) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].a.equals(a) && items[i].b.equals(b)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean contains(Object other) {
		if (!(other instanceof Pair)) {
			return false;
		}
		@SuppressWarnings("rawtypes")
		Pair o = (Pair) other;
		return containsPair(o.a, o.b);
	}

}
