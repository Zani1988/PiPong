package nl.sanderhoevers.helloworld;

import javax.swing.*;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        JFrame frame = new JFrame("Sample Frame");
        Game game = new Game();
        frame.add(game);
        frame.setSize(1200, 900);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        game.setHeigthOfField(768);
        game.setWidthOfField(1024);

        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(2);
        }
    }
}

