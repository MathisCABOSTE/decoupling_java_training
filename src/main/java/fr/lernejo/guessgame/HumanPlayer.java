package fr.lernejo.guessgame;

import fr.lernejo.logger.*;

import java.util.*;

public class HumanPlayer implements Player{
    public void respond(boolean lowerOrGreater){
        if (lowerOrGreater) {
            System.out.println("Higher !");
            return;
        }
        System.out.println("Lower !");
        return;

    }
    public long askNextGuess(){
        Scanner scanner = new Scanner(System.in);
        var input = scanner.nextLine();
        scanner.close();
        return Integer.parseInt(input);
    }
}