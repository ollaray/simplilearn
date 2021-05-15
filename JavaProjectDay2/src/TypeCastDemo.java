
public class TypeCastDemo {

	public static void main(String[] args) {
		//Implementing implicit(Widening) Typecasting
		short shortVar = 100;
		int intVar = shortVar;
		
		//Implementing explicit(narrowing)Typecasting
		double dbVar = 23.56;
		int intVar2 = (int)dbVar;
		
		System.out.println("An Example of  Implicit Typecasting: "+intVar);
		System.out.println("An Example of Explicit Typecasting: "+intVar2);

	}

}
