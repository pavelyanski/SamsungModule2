public class Player {
    protected String name;
    String[] units = new String[3];

    public Player(String name) {
        this.name = name;
    }

    public void setUnits(String[] units){
        this.units = units;
    }


}
