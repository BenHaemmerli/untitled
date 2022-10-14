package Benjamin_Haemmerli;

public class BusSimpleTest
{
    public static void main(String[] args)
    {
        BusSimple linie4 = new BusSimple("MAN", 30000, 45000, 1989);
        BusSimple meinPrivatBus = new BusSimple("VW", 20000, 0, 1989);
        linie4.oelwechsel();
        meinPrivatBus.oelwechsel();
    }

}
