package kg.geeks.game.template;

import kg.geeks.game.logic.RPG_Game;

public class Deku extends Hero{
    public Deku(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.ADJUST_DAMAGE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.random.nextBoolean()) {
            int multiplier = RPG_Game.random.nextInt(3) + 1;
            int damageBoost = switch (multiplier) {
                case 1 -> 20;
                case 2 -> 50;
                case 3 -> 100;
                default -> 0;
            };
            int healthCost = damageBoost / 10;
            if (this.getHealth() > healthCost) {
                this.setDamage(this.getDamage() + damageBoost);
                this.setHealth(this.getHealth() - healthCost);
                System.out.println(this.getName() + " увеличил урон на " + damageBoost + " и потерял " + healthCost + " здоровья.");
            }
        }
    }
}
