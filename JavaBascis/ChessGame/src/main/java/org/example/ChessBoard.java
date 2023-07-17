package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ChessBoard extends JFrame{
    private BoardPanel panel;

    public ChessBoard(){

        panel = new BoardPanel();
        this.setContentPane(panel);

        this.paintComponents(panel.getGraphics());
        MouseClickListener Listener = new MouseClickListener();
        panel.addMouseListener(Listener);
        this.setVisible(true);
        this.setSize(400,400);
        this.setTitle("Chess Board");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    class BoardPanel extends JPanel{
        private static final int rows = 8;
        private static final int columns = 8;
        private int xCoord = 50;
        private int yCoord = 50;

        public void setxCoord(int x){
            xCoord = x;
        }
        public void setyCoord(int y){
            yCoord =y;
        }

        @Override
        public void paintComponent(Graphics g){
            int sqSize = this.getHeight()/rows;
            for(int i = 0;i<rows; i++){
                for(int j = 0; j<columns;j++){
                    g.drawRect(sqSize*j,sqSize*i,sqSize,sqSize);
                    if((i+j)%2==0){
                        g.setColor(Color.BLUE);
                        g.fillRect(sqSize*j,sqSize*i,sqSize,sqSize);
                    }else if((i+j)%2==1){
                        g.setColor(Color.red);
                        g.fillRect(sqSize*j,sqSize*i,sqSize,sqSize);
                    }
                }
            }
            g.setColor(Color.black);
            g.fillOval(xCoord,yCoord,30,30);


        }
    }
    class MouseClickListener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            panel.setxCoord(x-20);
            panel.setyCoord(y-20);
            panel.repaint();
        }

        @Override
        public void mouseExited(MouseEvent e) {}

        @Override
        public void mouseEntered(MouseEvent e) {}

        @Override
        public void mousePressed(MouseEvent e) {}

        @Override
        public void mouseReleased(MouseEvent e) {}
    }
}
