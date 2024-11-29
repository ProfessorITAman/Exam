package kg.geeks.game.template;

public class Bomber extends Hero{
    public Bomber(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.EXPLODE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (this.getHealth() <= 0) {
            boss.setHealth(boss.getHealth() - 100);
            System.out.println(this.getName() + " взорвался и нанес 100 урона боссу!");
            System.out.println("Bomber's health: " + this.getHealth());
        }
    }
}

