package com.company;

public class SkinsInGameDecorator extends GameDecorator{

    public SkinsInGameDecorator(Game decoratedGame){
        super(decoratedGame);
    }

    @Override
    public void play(){
        decoratedGame.play();
        setWithSkins(decoratedGame);
    }

    private void setWithSkins(Game decoratedGame){
        System.out.println("Skins: on");
    }
}
