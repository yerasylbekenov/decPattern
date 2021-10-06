package com.company;

public class GameDecorator implements Game {
    protected Game decoratedGame;

    public GameDecorator(Game decoratedGame){
        this.decoratedGame = decoratedGame;
    }

    public void play(){
        decoratedGame.play();
    }
}
