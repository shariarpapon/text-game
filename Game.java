import java.util.Random;

public class Game
{
    public static void main(String[] args) 
    {
        Random rand = new Random(System.currentTimeMillis());

        String msg = "The adventure starts as Galahara finds herself in the depths of the dwarven dungeons."+
        "\nUpon igniting her lantern, she hears distant screeches of beings not of this world.\n"+
        "AS Galahara courageously moves onward, three undead ghouls emerge from the lightless corridors.\n\n";

        System.out.print(msg);

        //Player Stats
        String player = "Galahara";
        int health = rand.nextInt(50, 101);
        int attackPower = rand.nextInt(5, 16);
        int armorLevel = rand.nextInt(3, 6);

        String enemyType = "Ghoul";
        int enemyIndex = 0;

        //Enemy 1 Stats
        enemyIndex++;
        String enemy = enemyType + " " + enemyIndex;
        int enemy1Health = rand.nextInt(5, 16);
        int enemy1AttackPower = rand.nextInt(5, 11);
        int enemy1ArmorLevel = rand.nextInt(1, 4); 

        //Confrontation 1 Started ###################################################################
        msg = enemy + " is attacking " + player + "\n-----------Controntation Started------------\n\n";
        System.out.print(msg);

        //Player info
        System.out.print("Player: " + player + "\n");
        System.out.print("Health: " + health + "\n");
        System.out.print("Attack Power: " + attackPower + "\n");
        System.out.print("Armor Level: " + armorLevel + "\n\n");

        //Enemy info
        System.out.print("Enemy: " + enemy + "\n");
        System.out.print("Health: " + enemy1Health + "\n");
        System.out.print("Attack Power: " + enemy1AttackPower + "\n");
        System.out.print("Armor Level: " + enemy1ArmorLevel + "\n\n");

        //Enemy attacks player
        health = health - enemy1AttackPower + armorLevel;
        System.out.print(enemy + " attacks with attack power " + enemy1AttackPower + "\n");
        System.out.print(player + "'s health has been reduced to " + health + "\n\n");

        boolean survived = health > 0;
        System.out.print("Player has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 1 Ended ##################################################################


        //Enemy 2 info
        enemyIndex++;
        enemy = enemyType + " " + enemyIndex;
        int enemy2Health = rand.nextInt(5, 16);
        int enemy2AttackPower = rand.nextInt(5, 11);
        int enemy2ArmorLevel = rand.nextInt(1, 4); 

        //Confrontation 2 Started ###################################################################
        msg = enemy + " is attacking " + player + "\n-----------Controntation Started------------\n\n";
        System.out.print(msg);

        //Player info
        System.out.print("Player: " + player + "\n");
        System.out.print("Health: " + health + "\n");
        System.out.print("Attack Power: " + attackPower + "\n");
        System.out.print("Armor Level: " + armorLevel + "\n\n");

        //Enemy info
        System.out.print("Enemy: " + enemy + "\n");
        System.out.print("Health: " + enemy2Health + "\n");
        System.out.print("Attack Power: " + enemy2AttackPower + "\n");
        System.out.print("Armor Level: " + enemy2ArmorLevel + "\n\n");

        //Enemy attacks player
        health = health - enemy2AttackPower + armorLevel;
        System.out.print(enemy + " attacks with attack power " + enemy2AttackPower + "\n");
        System.out.print(player + "'s health has been reduced to " + health + "\n\n");

        survived = health > 0;
        System.out.print("Player has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 2 Ended ##################################################################


        //Enemy 3 info
        enemyIndex++;
        enemy = enemyType + " " + enemyIndex;
        int enemy3Health = rand.nextInt(5, 16);
        int enemy3AttackPower = rand.nextInt(5, 11);
        int enemy3ArmorLevel = rand.nextInt(1, 4);

        //Confrontation 3 Started ###################################################################
        msg = enemy + " is attacking " + player + "\n-----------Controntation Started------------\n\n";
        System.out.print(msg);

        //Player info
        System.out.print("Player: " + player + "\n");
        System.out.print("Health: " + health + "\n");
        System.out.print("Attack Power: " + attackPower + "\n");
        System.out.print("Armor Level: " + armorLevel + "\n\n");

        //Enemy info
        System.out.print("Enemy: " + enemy + "\n");
        System.out.print("Health: " + enemy3Health + "\n");
        System.out.print("Attack Power: " + enemy3AttackPower + "\n");
        System.out.print("Armor Level: " + enemy3ArmorLevel + "\n\n");

        //Enemy attacks player
        health = health - enemy3AttackPower + armorLevel;
        System.out.print(enemy + " attacks with attack power " + enemy3AttackPower + "\n");
        System.out.print(player + "'s health has been reduced to " + health + "\n\n");

        survived = health > 0;
        System.out.print("Player has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 3 Ended ##################################################################


        //Player attacks enemy -----------------------------------------------------------------------------------------
        //Reset enemy index
        enemyIndex = 0;

        //Format enemy name
        enemyIndex++;
        enemy = enemyType + " " + enemyIndex;

        //Confrontation 1 Started *************************************************************************
        msg = player + " is attacking " + enemy + "\n-----------Controntation Started------------\n\n";
        System.out.print(msg);

        //Player info
        System.out.print("Player: " + player + "\n");
        System.out.print("Health: " + health + "\n");
        System.out.print("Attack Power: " + attackPower + "\n");
        System.out.print("Armor Level: " + armorLevel + "\n\n");

        //Enemy info
        System.out.print("Enemy: " + enemy + "\n");
        System.out.print("Health: " + enemy1Health + "\n");
        System.out.print("Attack Power: " + enemy1AttackPower + "\n");
        System.out.print("Armor Level: " + enemy1ArmorLevel + "\n\n");

        enemy1Health = enemy1Health - attackPower + enemy1ArmorLevel;

        System.out.print(player + " attacks with attack power " + attackPower + "\n");
        System.out.print(enemy + "'s health has been reduced to " + enemy1Health + "\n\n");

        survived = enemy1Health > 0;

        System.out.print( enemy + " has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 1 Ended *****************************************************************************

        //Enemy 2 info
        enemyIndex++;
        enemy = enemyType + " " + enemyIndex;

        //Confrontation 2 Started *************************************************************************
        msg = player + " is attacking " + enemy + "\n-----------Controntation Started------------\n\n";
        System.out.print(msg);

        //Player info
        System.out.print("Player: " + player + "\n");
        System.out.print("Health: " + health + "\n");
        System.out.print("Attack Power: " + attackPower + "\n");
        System.out.print("Armor Level: " + armorLevel + "\n\n");

        //Enemy info
        System.out.print("Enemy: " + enemy + "\n");
        System.out.print("Health: " + enemy2Health + "\n");
        System.out.print("Attack Power: " + enemy2AttackPower + "\n");
        System.out.print("Armor Level: " + enemy2ArmorLevel + "\n\n");

        enemy2Health = enemy2Health - attackPower + enemy2ArmorLevel;

        System.out.print(player + " attacks with attack power " + attackPower + "\n");
        System.out.print(enemy + "'s health has been reduced to " + enemy2Health + "\n\n");

        survived = enemy2Health > 0;

        System.out.print( enemy + " has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 2 Ended *****************************************************************************


        //Enemy 3 info
        enemyIndex++;
        enemy = enemyType + " " + enemyIndex;

        //Confrontation 3 Started *************************************************************************
        msg = player + " is attacking " + enemy + "\n-----------Controntation Started------------\n\n";
        System.out.print(msg);

        //Player info
        System.out.print("Player: " + player + "\n");
        System.out.print("Health: " + health + "\n");
        System.out.print("Attack Power: " + attackPower + "\n");
        System.out.print("Armor Level: " + armorLevel + "\n\n");

        //Enemy info
        System.out.print("Enemy: " + enemy + "\n");
        System.out.print("Health: " + enemy3Health + "\n");
        System.out.print("Attack Power: " + enemy3AttackPower + "\n");
        System.out.print("Armor Level: " + enemy3ArmorLevel + "\n\n");

        enemy3Health = enemy3Health - attackPower + enemy3ArmorLevel;

        System.out.print(player + " attacks with attack power " + attackPower + "\n");
        System.out.print(enemy + "'s health has been reduced to " + enemy3Health + "\n\n");

        survived = enemy3Health > 0;

        System.out.print( enemy + " has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 3 Ended *****************************************************************************

        System.out.print(player + "'s comrades have arrived to aid her! They cut down the rest of the ghouls with ease.");

    }


}