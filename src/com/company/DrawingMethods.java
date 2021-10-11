package com.company;

import java.awt.*;
import java.awt.geom.AffineTransform;

public class DrawingMethods {


    static void spaceHandler(JLabelCell input, Graphics g){

        switch (input.relativePos) {
            case 0: drawGoStart(input,g,0); break;
            case 1: downColorCells(input, new Color(100, 60, 30), g); break;
            case 2: drawBox(input,g,0); break;
            case 3: downColorCells(input, new Color(100, 60, 30), g); break;
            case 4: drawTax(input,g,0); break;
            case 5: drawTrain(input,g,0);  break;
            case 6: downColorCells(input, Color.CYAN, g); break;
            case 7: drawQuestionMark(input,g,0,Color.MAGENTA); break;
            case 8: downColorCells(input, Color.CYAN, g); break;
            case 9: downColorCells(input, Color.CYAN, g); break;
            case 10: drawPrison(input,g,0); break;
            case 11: rightColorCells(input, Color.MAGENTA, g); break;
            case 12: drawLightBulb(input,g,1); break;
            case 13: rightColorCells(input, Color.MAGENTA, g); break;
            case 14: rightColorCells(input, Color.MAGENTA, g); break;
            case 15: drawTrain(input,g,1); break;
            case 16: rightColorCells(input, Color.ORANGE, g); break;
            case 17: drawBox(input,g,1); break;
            case 18: rightColorCells(input, Color.ORANGE, g); break;
            case 19: rightColorCells(input, Color.ORANGE, g); break;
            case 20: drawParking(input,g,1); break;
            case 21: topColorCells(input, Color.RED, g); break;
            case 22: drawQuestionMark(input,g,2,Color.BLUE); break;
            case 23: topColorCells(input, Color.RED, g); break;
            case 24: topColorCells(input, Color.RED, g); break;
            case 25: drawTrain(input,g,2); break;
            case 26: topColorCells(input, Color.YELLOW, g); break;
            case 27: topColorCells(input, Color.YELLOW, g); break;
            case 28: drawWater(input,g,2); break;
            case 29: topColorCells(input, Color.YELLOW, g); break;
            case 30: drawWarden(input,g,2); break;
            case 31: leftColorCells(input, Color.GREEN, g); break;
            case 32: leftColorCells(input, Color.GREEN, g); break;
            case 33: drawBox(input,g,3); break;
            case 34: leftColorCells(input, Color.GREEN, g); break;
            case 35: drawTrain(input,g,3); break;
            case 36: drawQuestionMark(input,g,3,Color.ORANGE); break;
            case 37: leftColorCells(input, Color.BLUE, g); break;
            case 38: drawTax(input,g,3); break;
            case 39: leftColorCells(input, Color.BLUE, g); break;
        }
    }



    static void drawLines(Graphics g,int [][] points){
        g.setColor(Color.BLACK);
        g.drawLine(points[0][0],points[1][0],points[0][1],points[1][1]);
    }
    static void drawShapes(Graphics g,int [][] points){
        g.setColor(Color.BLACK);
        g.drawPolygon(points[0],points[1],points[0].length);
    }
    static void fillShapes(Graphics g,int [][] points,Color color){
        g.setColor(color);
        g.fillPolygon(points[0],points[1],points[0].length);
    }

    static void rotateClockwise(JLabelCell input, int [][] points){
        for (int i = 0; i < points[0].length; i++) {
            int temp=points[1][i];
            points[1][i]=points[0][i];
            points[0][i]=input.sizeX-1-temp;
        }
    }

    static Graphics rightColorCells(JLabelCell input, Color color, Graphics g){
        g.setColor(color);
        g.fillRect(input.getWidth()/4*3,0,input.getWidth()/4,input.getHeight());
        return g;
    }
    static Graphics leftColorCells(JLabelCell input, Color color, Graphics g){
        g.setColor(color);
        g.fillRect(0,0,input.getWidth()/4,input.getHeight());
        return g;
    }
    static Graphics topColorCells(JLabelCell input, Color color, Graphics g){
        g.setColor(color);
        g.fillRect(0,input.getHeight()/4*3,input.getWidth(),input.getHeight()/4);
        return g;
    }
    static Graphics downColorCells(JLabelCell input, Color color, Graphics g){
        g.setColor(color);
        g.fillRect(0,0,input.getWidth(),input.getHeight()/4);
        return g;
    }

    static void drawTrain(JLabelCell input, Graphics g, int rotateTimes){
        int [][]points=trainPoints();
        for (int i = 0; i < rotateTimes; i++) {
            rotateClockwise(input, points);
        }
        fillShapes(g,points,Color.BLACK);
    }
    static void drawBox(JLabelCell input, Graphics g, int rotateTimes){
        int [][][]points=boxPoints();
        for (int i = 0; i < rotateTimes; i++) {
            for (int [][]xy : points) {
                rotateClockwise(input, xy);
            }
        }
        fillShapes(g,points[0],Color.WHITE);
        fillShapes(g,points[1],Color.BLUE);
        fillShapes(g,points[2],Color.BLUE);
        fillShapes(g,points[3],Color.BLUE);
        fillShapes(g,points[4],Color.BLUE);
        fillShapes(g,points[5],Color.BLUE);
        fillShapes(g,points[6],Color.BLUE);
        drawShapes(g,points[0]);
    }
    static void drawQuestionMark(JLabelCell input, Graphics g, int rotateTimes, Color color) {
        Graphics2D g2 = (Graphics2D) g;
        Font font = new Font("Book Antiqua", Font.BOLD, 40);
        g2.setFont(font);

        AffineTransform orig = g2.getTransform();

        FontMetrics fm = g2.getFontMetrics();
        int x = ((input.sizeX- fm.stringWidth("?")) / 2);
        int y = ((input.sizeY - fm.getHeight()) / 2) + fm.getAscent();

        g2.rotate(Math.PI / 2 * rotateTimes, (int)(input.sizeY / 2),(int)(input.sizeX / 2));
        g2.setColor(color);
        g2.drawString("?", x, y);
        System.out.println(x + "/" + y + "," + rotateTimes);
        g2.setTransform(orig);

    }
    static void drawPrison(JLabelCell input, Graphics g, int rotateTimes){
        int [][][]points=jailPoints();
        for (int i = 0; i < rotateTimes; i++) {
            for (int [][]xy : points) {
                rotateClockwise(input, xy);
            }
        }
        fillShapes(g,points[0],Color.ORANGE);
        fillShapes(g,points[1],Color.WHITE);

        drawShapes(g,points[0]);
        drawShapes(g,points[1]);

        drawLines(g,points[2]);
        drawLines(g,points[3]);
        drawLines(g,points[4]);
        drawLines(g,points[5]);
    }
    static void drawLightBulb(JLabelCell input, Graphics g, int rotateTimes){
        int [][][]points=lightBulbPoints();
        for (int i = 0; i < rotateTimes; i++) {
            for (int [][]xy : points) {
                rotateClockwise(input, xy);
            }
        }
        fillShapes(g,points[0],new Color(100, 60, 30));
        fillShapes(g,points[1],Color.YELLOW);
        drawShapes(g,points[0]);
        drawShapes(g,points[1]);
        drawLines(g,points[2]);
        drawLines(g,points[3]);
        drawLines(g,points[4]);
    }
    static void drawWater(JLabelCell input, Graphics g, int rotateTimes){
        int [][]points=waterPoints();
        for (int i = 0; i < rotateTimes; i++) {
            rotateClockwise(input, points);
        }
        fillShapes(g,points,Color.WHITE);
        drawShapes(g,points);
    }
    static void drawWarden(JLabelCell input, Graphics g, int rotateTimes){
        int [][][]points=wardenPoints();
        for (int i = 0; i < rotateTimes; i++) {
            for (int [][]xy : points) {
                rotateClockwise(input, xy);
            }
        }
        fillShapes(g,points[0],Color.BLUE);
        fillShapes(g,points[1],Color.BLUE);
        fillShapes(g,points[2],Color.GRAY);
        fillShapes(g,points[3],Color.CYAN);
        fillShapes(g,points[4],Color.WHITE);
        fillShapes(g,points[5],Color.WHITE);

        drawShapes(g,points[0]);
        drawShapes(g,points[1]);
        drawShapes(g,points[2]);
        drawShapes(g,points[3]);
        drawShapes(g,points[4]);
        drawShapes(g,points[5]);
    }
    static void drawParking(JLabelCell input, Graphics g, int rotateTimes){
        int [][][]points=parkingPoints();
        for (int i = 0; i < rotateTimes; i++) {
            for (int [][]xy : points) {
                rotateClockwise(input, xy);
            }
        }
        Graphics2D g2=(Graphics2D) g;
        AffineTransform orig = g2.getTransform();
        g2.rotate(Math.PI / 4 , (int)(input.sizeY / 2),(int)(input.sizeX / 2));
        fillShapes(g,points[0],Color.RED);
        fillShapes(g,points[1],Color.DARK_GRAY);
        fillShapes(g,points[2],Color.DARK_GRAY);
        fillShapes(g,points[3],Color.WHITE);
        fillShapes(g,points[4],Color.WHITE);
        fillShapes(g,points[5],Color.WHITE);

        drawShapes(g,points[0]);
        drawShapes(g,points[1]);
        drawShapes(g,points[2]);
        drawShapes(g,points[3]);
        drawShapes(g,points[4]);
        drawShapes(g,points[5]);

        g2.setTransform(orig);
    }
    static void drawGoStart(JLabelCell input, Graphics g, int rotateTimes){
        int [][][]points=goStartPoints();
        for (int i = 0; i < rotateTimes; i++) {
            for (int [][]xy : points) {
                rotateClockwise(input, xy);
            }
        }

        fillShapes(g,points[0],Color.RED);

        Graphics2D g2=(Graphics2D) g;
        AffineTransform orig = g2.getTransform();
        g2.rotate(-Math.PI / 4 , (int)(input.sizeY / 2),(int)(input.sizeX / 2));

        fillShapes(g,points[1],Color.BLACK);
        fillShapes(g,points[2],Color.BLACK);

        g2.setTransform(orig);
    }
    static void drawTax(JLabelCell input, Graphics g, int rotateTimes){
        int [][][]points=taxPoints();
        for (int i = 0; i < rotateTimes; i++) {
            for (int [][]xy : points) {
                rotateClockwise(input, xy);
            }
        }
        fillShapes(g,points[0],Color.BLACK);
        fillShapes(g,points[1],Color.BLACK);
        fillShapes(g,points[2],Color.BLACK);
        fillShapes(g,points[3],Color.BLACK);
        fillShapes(g,points[4],Color.BLACK);
    }

    static int[][][] goStartPoints() {
        return new int[][][]{
                {
                        {5, 11, 11, 28, 29, 35, 33, 35, 29, 28, 11, 11},
                        {33, 30, 32, 32, 31, 31, 33, 35, 35, 34, 34, 36}
                },
                {
                        {19, 9, 9, 19, 19, 13, 13, 17, 17, 11, 11, 19},
                        {11, 11, 23, 23, 16, 16, 18, 18, 21, 21, 13, 13}
                },
                {
                        {31, 21, 21, 31, 31, 29, 29, 23, 23, 31},
                        {11, 11, 23, 23, 13, 13, 21, 21, 13, 13}
                }
        };
    }
    static int[][][] parkingPoints() {
        return new int[][][]{
                {
                        {20, 17, 10, 10, 13, 12, 16, 20, 24, 28, 27, 30, 30, 23},
                        {29, 27, 27, 22, 21, 14, 11, 10, 11, 14, 21, 22, 27, 27}
                },
                {
                        {12, 15, 15, 12},
                        {27, 27, 32, 32}
                },
                {
                        {25, 28, 28, 25},
                        {27, 27, 32, 32}
                },
                {
                        {16, 24, 24, 16},
                        {14, 14, 18, 18}
                },
                {
                        {19, 20, 21, 20},
                        {23, 24, 23, 22}
                },
                {
                        {19, 21, 23, 23, 21, 19, 17, 17},
                        {20, 20, 22, 24, 26, 26, 24, 22}
                }
        };
    }
    static int[][][] wardenPoints() {
        return new int[][][]{
                {
                        {2, 15, 21, 21, 17, 17, 15, 15, 11, 9},
                        {21, 33, 33, 25, 25, 21, 23, 12, 15, 15}
                },
                {
                        {22, 29, 34, 23},
                        {6, 14, 12, 5}
                },
                {
                        {22, 29, 29},
                        {6, 16, 14}
                },
                {
                        {15, 12, 17},
                        {18, 23, 21}
                },
                {
                        {21, 23, 27, 37, 37, 36, 32, 33, 32, 30, 29, 27, 23, 21},
                        {26, 26, 24, 24, 25, 26, 26, 27, 30, 31, 31, 30, 31, 31}
                },
                {
                        {22, 27, 27, 26, 25, 25, 24, 23, 23, 22, 20, 17, 15, 15, 16, 18},
                        {6, 13, 15, 16, 18, 20, 20, 19, 18, 20, 21, 21, 18, 12, 9, 7}
                }
        };
    }
    static int[][] waterPoints() {
        return new int[][]{
                {
                        28, 32, 32, 30, 28, 23, 23, 21, 21,
                        23, 24, 25, 26, 26, 25, 24, 23, 21,
                        21, 19, 19, 17, 16, 15, 14, 14, 15,
                        16, 17, 19, 19, 17, 17, 10, 9, 9,
                        10, 17, 19, 21, 23, 26, 28
                },
                {
                        31, 31, 21, 19, 18, 18, 16, 14, 12,
                        12, 13, 13, 12, 11, 10, 10, 11, 11,
                        9, 9, 11, 11, 10, 10, 11, 12, 13,
                        13, 12, 12, 14, 16, 18, 18, 20, 21,
                        23, 23, 24, 24, 23, 23, 24
                }
        };
    }
    static int[][][] lightBulbPoints() {
        return new int[][][]{
                {
                        {17, 23, 23, 20, 17},
                        {27, 27, 32, 34, 32}
                },
                {
                        {17, 13, 14, 16, 20, 24, 26, 27, 23},
                        {27, 12, 8, 6, 5, 6, 8, 12, 27}
                },
                {
                        {20, 20},
                        {27, 19}
                },
                {
                        {18, 20},
                        {16, 21}
                },
                {
                        {22, 20},
                        {16, 21}
                }
        };
    }
    static int[][][] jailPoints() {
        return new int[][][]{
                {
                        {10,40,40,10},
                        {0,0,30,30}
                },
                {
                        {25, 40, 25, 10},
                        {0, 15, 30, 15}
                },
                {
                        {28, 13},
                        {3, 18}
                },
                {
                        {31, 16},
                        {6, 21}
                },
                {
                        {34, 19},
                        {9, 24}
                },
                {
                        {37, 22},
                        {12, 27}
                }
        };
    }
    static int[][] trainPoints() {
        return new int[][]{
                {4, 10, 11, 13, 12, 15, 16, 19, 18, 26, 25, 29, 33, 32, 35,
                        32, 32, 36, 27, 25, 27, 13, 15, 12, 11, 8, 10, 6, 9},
                {31, 31, 25, 25, 28, 31, 31, 28, 25, 25, 28, 31, 28, 25, 25,
                        21, 17, 9, 9, 12, 16, 16, 9, 7, 7, 9, 16, 20, 25}
        };
    }
    static int[][][] boxPoints() {
        return new int[][][]{
                {
                        {5, 19, 28, 28, 34, 33, 19, 14, 5},
                        {29, 33, 29, 21, 11, 9, 9, 18, 20}
                },
                {
                        {7, 18, 18, 7},
                        {24, 27, 31, 28}
                },
                {
                        {7, 18, 18, 7},
                        {21, 24, 26, 23}
                },
                {
                        {19, 19, 27, 27},
                        {31, 24, 21, 28}
                },
                {
                        {10, 18, 26, 16},
                        {21, 23, 20, 19}
                },
                {
                        {16, 26, 31, 20},
                        {18, 19, 10, 10}
                },
                {
                        {27, 28, 33, 32},
                        {19, 19, 11, 10}
                }
        };
    }
    static int[][][] taxPoints(){
        return new  int[][][]{
                {
                        {3,13,13,9,9,7,7,3},
                        {14,14,16,16,26,26,16,16}
                },
                {
                        {15,17,20,23,25,20},
                        {26,26,18,26,26,14}
                },
                {
                        {18,18,22,22},
                        {23,21,21,23}
                },
                {
                        {27,29,37,35},
                        {26,26,14,14}
                },
                {
                        {37,35,27,29},
                        {26,26,14,14}
                }
        };
    }
}
