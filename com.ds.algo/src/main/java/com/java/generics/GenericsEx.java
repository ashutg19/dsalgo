public class GenericsEx {
	public static void addTwoNumberWithoutTypedeclaration(T a, T b) {
		// T cannot be resolved to a type---this will not compile-Method should
		// declare T as type first,like below updated method
	}

	public static <T> void addTwoNumberWithTypedecalaration(T a, T b) {
         a.doubleValue();
		// The method doubleValue() is undefined for the type T, thats why above line not compiles.Method declaration should clearly mention what T is
		// like-<T extends Number>,see below updated method
          }

	public static <T extends Number> void addTwoNumber(T a, T b) {
             double sad = a.doubleValue();
	     	System.out.println();
     }

	public static void main(String[] args) {
		// static method invocation without Type Argument, not type safe. Both
		// Integer and double is allowed.
		GenericsEx.addTwoNumber(1.4, 3.8);// it should work fine as we are passing double-below showuld not as we passing integer
		GenericsEx.addTwoNumber(1, 3);// but it also works as addTwoNumber(T a,T b) defines T extends Number--which  run double method of interface Numebr
										// not implementation--for integer sad
										// vaiable will have -1.0

		// static method invocation with Type Argument. It is type safe, only
		// Integer is allowed.
		GenericsEx.<Integer> addTwoNumber(3, 4);
		GenericsEx.<Integer> addTwoNumber(3.6, 4);// compilation error-The
													// parameterized method
													// <Integer>addTwoNumber(Integer,
													// Integer) of type
													// GenericsEx is not
													// applicable for the
													// arguments (Double,
													// Integer)
}

}
