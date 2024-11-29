package kg.geeks.game.template;

import kg.geeks.game.logic.RPG_Game;

public class Avenger extends Hero{
    public Avenger(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.PROTECT);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (RPG_Game.random.nextInt(100) < 20) {
            System.out.println(this.getName() + " активировал защиту для всей команды!");
            for (Hero hero : heroes) {
                if (hero.getHealth() > 0) {
                    hero.setHealth(hero.getHealth() + boss.getDamage());
                }
            }
        }
    }
}