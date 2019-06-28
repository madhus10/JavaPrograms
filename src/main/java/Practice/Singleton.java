package Practice;

public class Singleton {

	public String str;
	private static Singleton singleton_instance = null;

	private Singleton() {
		str = "Hi I am Madhu";
	}

	public static Singleton getInstance() {
		if (singleton_instance == null)
			singleton_instance = new Singleton();
		return singleton_instance;
	}

	public static void main(String[] args) {
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		Singleton z = Singleton.getInstance();
		System.out.println(x.str);
		System.out.println();
		x.str = (x.str).toUpperCase();

		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		z.str = (z.str).toLowerCase();
		System.out.println();
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
	}

}
