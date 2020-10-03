package eg1;

public class MethodReference {

	public static void helooStaticMethod() {
		System.out.println("Hello static method of MethodReference class");
	}
	
	public  void helloNonStaticMethod() {
		System.out.println("Hello NON-static method of MethodReference class");
	}
	
	
	public static void main(String[] args) {
	
		Hello h=()->System.out.println("Hello Lambda");
		h.hey();
		
		Hello href=MethodReference::helooStaticMethod;
		href.hey();
		
		Hello hNs=new MethodReference()::helloNonStaticMethod;
		hNs.hey();

	}

}


@FunctionalInterface
interface Hello{
	void hey();
}
