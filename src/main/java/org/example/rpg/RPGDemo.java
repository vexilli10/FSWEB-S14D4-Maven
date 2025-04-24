package org.example.rpg;

public class RPGDemo {
    public static void main(String[] args) {
        Monster troll = new Troll("Gruff", 120, 15.0);
        System.out.println(troll.getName() + " HP: " + troll.getHitPoints());
        System.out.println("Base damage: " + troll.getDamage());
        System.out.println("Total attack damage: " + troll.attack());
    }
}
