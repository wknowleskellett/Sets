package sets;

public class Union implements Set {
    Set first;
    Set second;

    // The set that contains all objects in either of two sets
    public Union(Set first, Set second) {
	this.first = first;
	this.second = second;
    }

    // contains an object in either set
    public boolean contains(Object A) {
	return first.contains(A) || second.contains(A);
    }

}
