public class Knight extends Unit{
    private int health = 110;
    private int power = 15;

    @Override
    public void attack(Unit unit) {
        super.attack(unit);
    }

    @Override
    public String toString() {
        return "Knight{" +
                ", power=" + power +
                ", health=" + health +
                ", defence=" + defence +
                ", criticalChance=" + criticalChance +
                ", parryChance=" + parryChance +
                '}';
    }
}
