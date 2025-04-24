package org.example.rpg;

public abstract class Monster {
    private String name;
    private int hitPoints;
    private double damage;

    public Monster(String name, int hitPoints, double damage) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }
    public int getHitPoints() {
        return hitPoints;
    }
    public double getDamage() {
        return damage;
    }

    /**
     * Toplam saldırı hasarı: temel damage + varsa bleed + varsa poison
     */
    public double attack() {
        double total = damage;
        if (this instanceof Bleedable) {
            total += ((Bleedable) this).bleed();
        }
        if (this instanceof Poisonable) {
            total += ((Poisonable) this).poison();
        }
        return total;
    }
}
