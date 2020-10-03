package eg1;

public class MethodReference2 {

	public static void main(String[] args) {
	
		HelloByName h=Message::new;
		h.helloByName("PATIENCE");

	}

}


@FunctionalInterface
interface HelloByName{
	void helloByName(String name);
}

class Message{
	public Message(String msg) {
		System.out.println("msg = "+msg);
	}
}