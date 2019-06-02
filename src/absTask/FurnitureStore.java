package absTask;

public class FurnitureStore {

    public static void main(String[] args) {
        Chair aeron = new Aeron();
        aeron.model = "XF 02";
        aeron.color = "Blue";
        aeron.sit();

        Rollable r = (Rollable)aeron;
        Aeron a = (Aeron)aeron;
        r.rollBack();
        System.out.println(a.color);

        Humanscale h = new Humanscale();
        // Chair, Rollable, Collapsable, Humanscale, Object
        Collapsible c = h;
        Rollable rr = (Rollable)c;
        rr.rollForward();
        Collapsible ccc = (Collapsible)a;
        ccc.fold();


    }
}
