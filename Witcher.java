package kg.geeks.game.template;

public class Witcher extends Hero {
    private boolean abilityUsed = false;
    public Witcher(String name, int health, int damage) {
        super(name, health, damage, SuperAbility.BRING_THE_HERO_ALIVE);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (abilityUsed) {
            return;
        }

        for (Hero hero : heroes) {
            if (hero.getHealth() <= 0) {
                hero.setHealth(this.getHealth());
                this.setHealth(0);
                abilityUsed = true;
                System.out.println(this.getName() + " оживил " + hero.getName() + " жертвуя своей жизнью!");
                break;
            }
        }
    }
}