package sets;
//	William Knowles-Kellett
//	10/6/18

public class Even implements Set {
    public boolean contains(Object A) {
	if (!((A instanceof Number) && (Math.floor(((Number) A).doubleValue()) == ((Number) A).doubleValue()))) {
	    return false;
	}
	return A == null ? false : (int) A % 2 == 0;
    }
}