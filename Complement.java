package sets;

public class Complement implements Set {
    // A set contains everything its complement doesn't
    Set complement;

    public Complement(Set complement) {
	this.complement = complement;
    }

    public boolean contains(Object A) {
	return !complement.contains(A);
    }

}
