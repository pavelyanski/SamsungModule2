public class Terminator extends Unit{
    private int power = 20;

    @Override
    public void attack(Unit unit) {
        super.attack(unit);
    }

    @Override
    public String toString() {
        return "Terminator{" +
                "power=" + power +
                ", health=" + health +
                ", defence=" + defence +
                ", criticalChance=" + criticalChance +
                ", parryChance=" + parryChance +
                '}';
    }
}
