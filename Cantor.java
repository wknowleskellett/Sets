package sets;
//	William Knowles-Kellett

//	10/6/18

public class Cantor implements Set {
	// The set of all sets that do not contain themselves
	// boooooo
	// Try putting a Cantor set through its own contains method
	public boolean contains(Object A) {
		if (!(A instanceof Set)) {
			return false;
		}
		return A == null ? false : !((Set) A).contains(A);
	}
}
