package sets;

public class Intersect implements Set {
    Set first;
    Set second;

    public Intersect(Set first, Set second) {
	this.first = first;
	this.second = second;
    }

    public boolean contains(Object A) {
	return first.contains(A) && second.contains(A);
    }

}
