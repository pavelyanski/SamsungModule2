public class Unit {
    protected int health = 100;
    protected int defence = 100;
    protected int power = 10;
    protected float criticalChance = 0.1f;
    protected float parryChance = 0.1f;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(float criticalChance) {
        this.criticalChance = criticalChance;
    }

    public float getParryChance() {
        return parryChance;
    }

    public void setParryChance(float parryChance) {
        this.parryChance = parryChance;
    }

    public void attack(Unit unit){
        unit.getDamage(power);
    }

    public void getDamage(int damage){
        this.health -= damage;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "health=" + health +
                ", defence=" + defence +
                ", power=" + power +
                ", criticalChance=" + criticalChance +
                ", parryChance=" + parryChance +
                '}';
    }
}
