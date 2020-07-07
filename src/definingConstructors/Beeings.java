package definingConstructors;
public class Beeings {

    private String legs;
    private String head;
    private int eyes;

    Beeings( String Name, String legs, String head, int eyes) {
    }

    public String getLegs() {
        return legs;
    }

    public void setLegs(String legs) {
        this.legs = legs;
    }

    public String getHead() {
        return head;
    }

    public int getEyes() {
        return eyes;
    }



    public void setHead(String head) {
        this.head = head;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }




    private void whatAreYou(String legs, String head, int eyes)
    {
        Beeings newBeeing = new Beeings("name","4", "1", 2);
        System.out.println( newBeeing.toString());
    }
}
