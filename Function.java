package sets;
//	William Knowles-Kellett
//	10/19/18

public abstract class Function {
	// A function maps any value from its domain consistently
	// to some value in its codomain. It is not required that every
	// element of the codomain be hit, nor that a given pair of elements
	// from the domain map to distinct values in the codomain.
	//
	// Programmers implementing their own function class are encouraged
	// to make available an "Image" class that implements Set, for which
	// the contains method returns true if and only if the given object can
	// be returned by the function for some object in the domain.

	protected Set domain;
	protected Set codomain;
	protected boolean tracksResults;

	// Any given function must pass a domain and codomain
	public Function(Set domain, Set codomain) {
		this.domain = domain;
		this.codomain = codomain;
	}

	public Object run(Object x) throws Exception {
		if (!domain.contains(x)) {
			throw new RuntimeException("Object not in function domain.");
		}
		Object y = function(x);
		if (!codomain.contains(y)) {
			throw new RuntimeException("Function return not in codomain.");
		}
		return y;
	}

	public boolean domainContains(Object a) {
		return domain.contains(a);
	}

	// Every function must define how the function translates objects
	// from the domain to the codomain
	abstract protected Object function(Object x);

}
