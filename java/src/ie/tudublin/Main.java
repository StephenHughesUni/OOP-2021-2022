package ie.tudublin;



public class Main
{
    public static void HelloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

    public static void StarMap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new StarMap());
    }

    public static void BugZap()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZap());
    }

    public static void Loops()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Loops());
    }

    public static void Arrays()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Arrays());
    }

    public static void Life()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Life());
    }

    public static void Timing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new TimingExample());
    }


    public static void Audio1()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio1());
    }

    public static void Audio2()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new Audio2());
    }

    public static void ColorfulLife()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new ColorfulLife());
    }

    public static void YASC()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new YASC());
    }
    public static void BugZapFollow()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new BugZapFollow());
    }

    public void Cat()
    {
        System.out.println("Hello world");

        Animal misty = new Animal("Misty");
        Animal lucy = new Animal("Lucy");

        lucy = misty;
        misty.setName("Tara");

        System.out.println(misty);
        System.out.println(lucy);

        
        Cat cat = new Cat("Ginger");

        while(cat.getNumLives() > 0)
        {
            cat.kill();
        }
        cat.kill();

    }
    public static void main(String[] args)
    {
        //Timing();
        StarMap();
        // Tara Misty
        // Tara Tara
        //BugZap();
        //BugZapFollow();
    }
}