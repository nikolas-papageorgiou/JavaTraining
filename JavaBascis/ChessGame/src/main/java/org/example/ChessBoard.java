package org.example;

import javax.swing.*;
import java.awt.*;

public class ChessBoard extends JFrame{
    private BoardPanel panel;

    public ChessBoard(){

        panel = new BoardPanel();
        this.setContentPane(panel);

        this.paintComponents(panel.getGraphics());

        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Chess Board");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class BoardPanel extends JPanel{
        private static final int rows = 8;
        private static final int columns = 8;

        @Override
        public void paintComponent(Graphics g){
            int sqSize = this.getHeight()/rows;
            for(int i = 0;i<rows; i++){
                for(int j = 0; j<columns;j++){
                    g.drawRect(sqSize*j,sqSize*i,sqSize,sqSize);
                    if((i+j)%2==0){
                        g.fillRect(sqSize*j,sqSize*i,sqSize,sqSize);
                    }
                }
            }
        }
    }

}
