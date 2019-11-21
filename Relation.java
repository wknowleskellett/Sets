package sets;

public abstract class Relation {
    Set a;
    Set b;

    public Relation(Set a, Set b) {
	this.a = a;
	this.b = b;
    }

    public boolean compare(Object inA, Object inB) throws Exception {
	if (!a.contains(inA)) {
	    throw new Exception("inA is not in set A");
	}
	if (!b.contains(inB)) {
	    throw new Exception("inB is not in set B");
	}
	return function(inA, inB);
    }

    protected abstract boolean function(Object inA, Object inB);
}
