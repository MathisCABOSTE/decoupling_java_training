package fr.lernejo.guessgame;

import java.security.*;

public class Launcher {    
    public static void main(String[] args) {
        HumanPlayer player = new HumanPlayer();
        Simulation simulation = new Simulation(player);
        SecureRandom random = new SecureRandom();
        long randomNumber = random.nextLong(100); // génère un nombre entre Long.MIN_VALUE et Long.MAX_VALUE
        //long random Number = random.nextInt(100); // génère un nombre entre 0 (inclus) et 100 (exclus)
        simulation.initialize(randomNumber);
        simulation.loopUntilPlayerSucceed();
    }
}
