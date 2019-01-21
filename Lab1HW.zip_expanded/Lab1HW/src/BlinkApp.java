

public class BlinkApp
{
	public static void main(String[] args)
	{
		boolean debug = true;
		Blink lock = new Blink(debug);
		lock.startMonitoring();
	}
}
