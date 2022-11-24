package SingleTon;

public class SingletonWithoutNull {
	

	    public static SingletonWithoutNull getInstance1() {
			return singleTonInstance;}


	private static SingletonWithoutNull singleTonInstance = new SingletonWithoutNull();


	public static SingletonWithoutNull getInstance() {
	    return singleTonInstance;
	}

}
