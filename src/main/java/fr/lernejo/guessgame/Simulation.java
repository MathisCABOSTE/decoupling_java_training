package fr.lernejo.guessgame;

import java.util.Scanner;

import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class Simulation {
  LoggerFactory loggerFactory = new LoggerFactory();
  private final Logger logger = LoggerFactory.getLogger("simulation");
  private final Player player;  //TODO add variable type
  private long numberToGuess; //TODO add variable type

  public Simulation(Player player) {
    this.player = player;
  }

  public void initialize(long numberToGuess) {
    this.numberToGuess = numberToGuess;
  }
  
  private boolean nextRound() {
    long userNumber = player.askNextGuess();
    if (userNumber < numberToGuess) {
      player.respond(true);
      return false;
    }
    else if  (userNumber > numberToGuess) {
      player.respond(false);
      return false;
    }
    return true;
  }

  public void loopUntilPlayerSucceed() {
    boolean gameEnded = false;
    while (!gameEnded) {
      gameEnded = nextRound();
    }
    return;
  }
}