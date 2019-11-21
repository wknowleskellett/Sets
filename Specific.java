package sets;
//	William Knowles-Kellett
//	10/6/18

public class Specific<E> implements Set {
	// Provides the opportunity to manually define all items in a set
	// Cannot be changed post-initialization

	protected E[] items;

	@SuppressWarnings("unchecked")
	public Specific() {
		this((E[]) new Object[0]);
	}

	public Specific(E[] items) {
		this.items = items.clone();
	}

	// items should not be changeable after initialization
	public E[] getItems() {
		return items.clone();
	}

	public int cardinality() {
		return items.length;
	}


	public boolean equals(Object other) {
		if (!(other instanceof Specific)) {
			return false;
		}
		@SuppressWarnings("unchecked")
		Specific<Object> o = (Specific<Object>) other;
		Object[] oList = (o).getItems();
		for (int i = 0; i < oList.length; i++) {
			if (!contains(oList[i])) {
				return false;
			}
		}
		for (int i = 0; i < items.length; i++) {
			if (!(o).contains(items[i])) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean contains(Object A) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].equals(A)) {
				return true;
			}
		}
		return false;
	}

	public boolean isSubset(Set other) {
		for (int i = 0; i < items.length; i++) {
			if (!other.contains(items[i])) {
				return false;
			}
		}
		return true;
	}

	public boolean isProperSubset(Specific<? super E> other) {
		return isSubset(other) && other.cardinality() > cardinality();
	}
}
