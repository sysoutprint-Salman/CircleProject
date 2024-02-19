
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class MyPanel extends JPanel {

    Scanner scan = new Scanner(System.in);

    int input = scan.nextInt();

    MyPanel(){ //Creating a pop-up screen to then show results
        this.setBackground(Color.BLACK);
        this.setPreferredSize(new Dimension(420, 420));
    }

    public void paint(Graphics g) { //Method to draw everything
        int n=input; //N = number of sides
        Graphics2D g2d = (Graphics2D) g;
        int xValues[]=new int[n]; //Initializing array which will contain the x coordinates
        int yValues[]=new int[n]; //Initializing array which will contain the y coordinates
        for(int i=0;i<n;i++) {
            xValues[i]= (int) ( 200 + 150*Math.cos(i * 2 * Math.PI / n)); //creating X values, 200 is center of circle, 150 is radius of circle.
            yValues[i] = (int) ( 200 + 150*Math.sin(i * 2 * Math.PI / n)); //creating y values
        }
        g2d.drawOval(50, 50, 300, 300); //Drawing the circle. width is diameter (300), and center is 200 x 200
        // the center is 200 and (200= 50 + 300/2 (radius))
        g2d.drawPolygon(xValues,yValues,n); //Drawing polygon,
        g2d.setColor(Color.green);
        g2d.fillPolygon(xValues,yValues,n); //Filling the inner region of the polygon

        Double area=(n/2)*Math.sin(2*Math.PI/n); //Finding area of polygon with N sides, drawn on unit circle

        g2d.setColor(Color.black);
        g2d.drawString("When number of sides is " + n, 130, 190); //X,Y is in pixels relative to top left corner
        g2d.drawString("\u03c0 \u2245 " + area, 140, 210);


    }
}