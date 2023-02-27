public class Game
{
    public static void main(String[] args) 
    {
        String msg = "Welcome adventurer...\n\n";
        System.out.print(msg);

        //Player Stats
        String player = "Galahara";
        int health = 60;
        int attackPower = 9;
        int armorLevel = 3;

        //Enemy 1 Stats
        String enemy = "Ghoul 1";
        int enemyHealth = 11;
        int enemyAttackPower = 6;
        int enemyArmorLevel = 2; 

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
        System.out.print("Health: " + enemyHealth + "\n");
        System.out.print("Attack Power: " + enemyAttackPower + "\n");
        System.out.print("Armor Level: " + enemyArmorLevel + "\n\n");

        //Enemy attacks player
        health = health - enemyAttackPower + armorLevel;
        System.out.print(enemy + " attacks with attack power " + enemyAttackPower + "\n");
        System.out.print(player + "'s health has been reduced to " + health + "\n\n");

        boolean survived = health > 0;
        System.out.print("Player has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 1 Ended ##################################################################


        //Enemy 2 info
        enemy = "Ghoul 2";
        enemyHealth = 6;
        enemyAttackPower = 8;
        enemyArmorLevel = 1;

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
        System.out.print("Health: " + enemyHealth + "\n");
        System.out.print("Attack Power: " + enemyAttackPower + "\n");
        System.out.print("Armor Level: " + enemyArmorLevel + "\n\n");

        //Enemy attacks player
        health = health - enemyAttackPower + armorLevel;
        System.out.print(enemy + " attacks with attack power " + enemyAttackPower + "\n");
        System.out.print(player + "'s health has been reduced to " + health + "\n\n");

        survived = health > 0;
        System.out.print("Player has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 2 Ended ##################################################################


        //Enemy 3 info
        enemy = "Ghoul 3";
        enemyHealth = 9;
        enemyAttackPower = 6;
        enemyArmorLevel = 3;

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
        System.out.print("Health: " + enemyHealth + "\n");
        System.out.print("Attack Power: " + enemyAttackPower + "\n");
        System.out.print("Armor Level: " + enemyArmorLevel + "\n\n");

        //Enemy attacks player
        health = health - enemyAttackPower + armorLevel;
        System.out.print(enemy + " attacks with attack power " + enemyAttackPower + "\n");
        System.out.print(player + "'s health has been reduced to " + health + "\n\n");

        survived = health > 0;
        System.out.print("Player has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 3 Ended ##################################################################


        //Player attacks enemy --------------------------------------------------------------------------
        
        //Enemy 1 info
        enemy = "Ghoul 1";
        enemyHealth = 11;
        enemyAttackPower = 6;
        enemyArmorLevel = 2; 


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
        System.out.print("Health: " + enemyHealth + "\n");
        System.out.print("Attack Power: " + enemyAttackPower + "\n");
        System.out.print("Armor Level: " + enemyArmorLevel + "\n\n");

        enemyHealth = enemyHealth - attackPower + enemyArmorLevel;

        System.out.print(player + " attacks with attack power " + attackPower + "\n");
        System.out.print(enemy + "'s health has been reduced to " + enemyHealth + "\n\n");

        survived = enemyHealth > 0;

        System.out.print( enemy + " has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 1 Ended *****************************************************************************

        //Enemy 2 info
        enemy = "Ghoul 2";
        enemyHealth = 6;
        enemyAttackPower = 8;
        enemyArmorLevel = 1; 

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
        System.out.print("Health: " + enemyHealth + "\n");
        System.out.print("Attack Power: " + enemyAttackPower + "\n");
        System.out.print("Armor Level: " + enemyArmorLevel + "\n\n");

        enemyHealth = enemyHealth - attackPower + enemyArmorLevel;

        System.out.print(player + " attacks with attack power " + attackPower + "\n");
        System.out.print(enemy + "'s health has been reduced to " + enemyHealth + "\n\n");

        survived = enemyHealth > 0;

        System.out.print( enemy + " has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 2 Ended *****************************************************************************


        //Enemy 3 info
        enemy = "Ghoul 3";
        enemyHealth = 9;
        enemyAttackPower = 6;
        enemyArmorLevel = 3; 

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
        System.out.print("Health: " + enemyHealth + "\n");
        System.out.print("Attack Power: " + enemyAttackPower + "\n");
        System.out.print("Armor Level: " + enemyArmorLevel + "\n\n");

        enemyHealth = enemyHealth - attackPower + enemyArmorLevel;

        System.out.print(player + " attacks with attack power " + attackPower + "\n");
        System.out.print(enemy + "'s health has been reduced to " + enemyHealth + "\n\n");

        survived = enemyHealth > 0;

        System.out.print( enemy + " has survived = " + survived + "\n"); 
        System.out.print("-----------Confrontation Complete----------\n\n");
        //Confrontation 3 Ended *****************************************************************************

        System.out.print(player + "'s comrades have arrived to aid her! They cut down the rest of the ghouls with ease.");

    }


}