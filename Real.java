package sets;
//	William Knowles-Kellett
//	10/6/18

public class Real implements Set {
    // contains all real numbers
    public boolean contains(Object A) {
	return A == null ? false : (A instanceof Number);
    }
}
