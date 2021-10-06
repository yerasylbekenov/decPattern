package com.company;

public class Main {

    public static void main(String[] args) {
        Game actionGame = new ActionGame();

        Game actionGameWithSkins = new SkinsInGameDecorator(new ActionGame());

        Game survivalGameWithSkins = new SkinsInGameDecorator(new SurvivalGame());
        System.out.println("Action game without skins");
        actionGame.play();

        System.out.println("\nAction game with skins");
        actionGameWithSkins.play();

        System.out.println("\nSurvival game with skins");
        survivalGameWithSkins.play();
    }
}
