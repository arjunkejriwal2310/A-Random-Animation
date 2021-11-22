public class RandomDrawing
{
    public static void main (String[] args)
    {
        StdDraw.setPenColor(StdDraw.BOOK_BLUE);
        StdDraw.filledRectangle(0.5, 0.75, 0.5, 0.25);

        double background = Math.random();

        if(background > 0.66)
        {
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.filledRectangle(0.5, 0.25, 0.5, 0.25);
        }
        else if(background > 0.33)
        {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledRectangle(0.5, 0.25, 0.5, 0.25);
        }
        else
        {
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledRectangle(0.5, 0.25, 0.5, 0.25);
        }


        StdDraw.setPenColor();
        boolean HouseBoolean1 = false;
        boolean HouseBoolean2 = false;
        boolean FlowerBoolean1 = false;
        boolean FlowerBoolean2 = false;
        boolean FlowerBoolean3 = false;
        boolean FaceBoolean1 = false;
        boolean FaceBoolean2 = false;
        boolean FlagBoolean1 = false;
        boolean FlagBoolean2 = false;

        double inclusion = Math.random();
        if (inclusion > 0)
        {
            HouseBoolean1 = true;
            FlowerBoolean1 = true;
            FaceBoolean1 = true;
        }
        if (inclusion > 0.2)
        {
            FlowerBoolean2 = true;
            FlagBoolean1 = true;
        }
        if (inclusion > 0.4)
        {
            FlowerBoolean3 = true;
            FaceBoolean2 = true;
        }
        if (inclusion > 0.7)
        {
            FlagBoolean2 = true;
            HouseBoolean2 = true;
        }

        if (HouseBoolean1)
        {
            House(Math.random(), Math.random(), 1 + (int)(Math.random() * 4), 1 + (int)(Math.random() * 4) );
        }
        if (HouseBoolean2)
        {
            House(Math.random(), Math.random(), 1 + (int)(Math.random() * 4), 1 + (int)(Math.random() * 4) );
        }
        if (FlowerBoolean1)
        {
            Flower (Math.random(), Math.random(), 1 + (int)(Math.random() * 4), 1 + (int)(Math.random() * 3));
        }
        if (FlowerBoolean2)
        {
            Flower (Math.random(), Math.random(), 1 + (int)(Math.random() * 4), 1 + (int)(Math.random() * 3));
        }
        if (FlowerBoolean3)
        {
            Flower (Math.random(), Math.random(), 1 + (int)(Math.random() * 4), 1 + (int)(Math.random() * 3));
        }
        if (FaceBoolean1)
        {
            Face(Math.random(), Math.random(), 1 + (int)(Math.random() * 5));
        }
        if (FaceBoolean2)
        {
            Face(Math.random(), Math.random(), 1 + (int)(Math.random() * 5));
        }
        if (FlagBoolean1)
        {
            Flag(Math.random(), Math.random(), 1 + (int)(Math.random() * 4), 1 + (int)(Math.random() * 4));
        }
        if (FlagBoolean2)
        {
            Flag(Math.random(), Math.random(), 1 + (int)(Math.random() * 4), 1 + (int)(Math.random() * 4));
        }
    }

    public static void House (double x, double y, int windows, int colorOfHouse)
    {
        if(colorOfHouse == 1)
        {
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledSquare(x, y, 0.1);
        }
        if(colorOfHouse == 2)
        {
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledSquare(x, y, 0.1);
        }
        if(colorOfHouse == 3)
        {
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.filledSquare(x, y, 0.1);
        }
        if(colorOfHouse == 4)
        {
            StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
            StdDraw.filledSquare(x, y, 0.1);
        }

        StdDraw.setPenRadius(0.003);
        StdDraw.setPenColor();
        StdDraw.line(x-0.1, y+0.1, x, y+0.2);
        StdDraw.line(x+0.1, y+0.1, x, y+0.2);
        StdDraw.line(x+0.04, y+0.16, x+0.04, y+0.19);
        StdDraw.line(x+0.06, y+0.14, x+0.06, y+0.19);
        StdDraw.line(x+0.04, y+0.19, x+0.06, y+0.19);
        StdDraw.line(x-0.02, y-0.1, x-0.02, y-0.04);
        StdDraw.line(x+0.02, y-0.1, x+0.02, y-0.04);
        StdDraw.line(x-0.02, y-0.04, x+0.02, y-0.04);

        StdDraw.setPenRadius();
        StdDraw.setPenColor(StdDraw.WHITE);
        if(windows == 1)
        {
            StdDraw.filledRectangle(x-0.05, y+0.05, 0.015, 0.01);
        }
        if(windows == 2)
        {
            StdDraw.filledRectangle(x-0.05, y+0.05, 0.015, 0.01);
            StdDraw.filledRectangle(x+0.05, y+0.05, 0.015, 0.01);
        }
        if(windows == 3)
        {
            StdDraw.filledRectangle(x-0.05, y+0.05, 0.015, 0.01);
            StdDraw.filledRectangle(x+0.05, y+0.05, 0.015, 0.01);
            StdDraw.filledRectangle(x-0.05, y-0.05, 0.015, 0.01);
        }
        if(windows == 4)
        {
            StdDraw.filledRectangle(x-0.05, y+0.05, 0.015, 0.01);
            StdDraw.filledRectangle(x+0.05, y+0.05, 0.015, 0.01);
            StdDraw.filledRectangle(x-0.05, y-0.05, 0.015, 0.01);
            StdDraw.filledRectangle(x+0.05, y-0.05, 0.015, 0.01);
        }
        StdDraw.setPenColor();
        StdDraw.setPenRadius();
    }

    public static void Flower (double x, double y, int petals, int colorOfCenter)
    {
        if(colorOfCenter == 1)
        {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledCircle(x, y, 0.05);
        }
        if(colorOfCenter == 2)
        {
            StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
            StdDraw.filledCircle(x, y, 0.05);
        }
        if(colorOfCenter == 3)
        {
            StdDraw.setPenColor(StdDraw.MAGENTA);
            StdDraw.filledCircle(x, y, 0.05);
        }

        StdDraw.setPenRadius(0.004);
        StdDraw.setPenColor(StdDraw.PINK);
        if(petals == 1)
        {
            StdDraw.arc(x+0.07, y+0.06, 0.08, 150, 190);
            StdDraw.arc(x-0.07, y+0.06, 0.08, 350, 30);
        }
        if(petals == 2)
        {
            StdDraw.arc(x+0.07, y+0.06, 0.08, 150, 190);
            StdDraw.arc(x-0.07, y+0.06, 0.08, 350, 30);
            StdDraw.arc(x+0.07, y-0.06, 0.08, 170, 210);
            StdDraw.arc(x-0.07, y-0.06, 0.08, 330, 10);
        }
        if(petals == 3)
        {
            StdDraw.arc(x+0.07, y+0.06, 0.08, 150, 190);
            StdDraw.arc(x-0.07, y+0.06, 0.08, 350, 30);
            StdDraw.arc(x+0.07, y-0.06, 0.08, 170, 210);
            StdDraw.arc(x-0.07, y-0.06, 0.08, 330, 10);
            StdDraw.arc(x+0.06, y+0.07, 0.08, 260, 300);
            StdDraw.arc(x+0.06, y-0.07, 0.08, 60, 100);
        }
        if(petals == 4)
        {
            StdDraw.arc(x+0.07, y+0.06, 0.08, 150, 190);
            StdDraw.arc(x-0.07, y+0.06, 0.08, 350, 30);
            StdDraw.arc(x+0.07, y-0.06, 0.08, 170, 210);
            StdDraw.arc(x-0.07, y-0.06, 0.08, 330, 10);
            StdDraw.arc(x+0.06, y+0.07, 0.08, 260, 300);
            StdDraw.arc(x+0.06, y-0.07, 0.08, 60, 100);
            StdDraw.arc(x-0.06, y+0.07, 0.08, 240, 280);
            StdDraw.arc(x-0.06, y-0.07, 0.08, 80, 120);
        }
        StdDraw.setPenColor();
        StdDraw.setPenRadius();

    }

    public static void Face (double x, double y, int eyeColor)
    {
        StdDraw.setPenColor(StdDraw.PINK);
        StdDraw.filledEllipse(x, y, 0.1, 0.13);

        StdDraw.setPenRadius(0.003);
        StdDraw.setPenColor();
        StdDraw.line(x, y, x, y-0.05);

        StdDraw.arc(x, y-0.05, 0.05, 225, 315);
        StdDraw.arc(x+0.1, y, 0.02, 250, 110);
        StdDraw.arc(x-0.1, y, 0.02, 70, 290);
        StdDraw.setPenRadius();

        if(eyeColor == 1)
        {
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledEllipse(x+0.04, y+0.05, 0.03, 0.015);
            StdDraw.filledEllipse(x-0.04, y+0.05, 0.03, 0.015);
        }
        if(eyeColor == 2)
        {
            StdDraw.setPenColor(StdDraw.GRAY);
            StdDraw.filledEllipse(x+0.04, y+0.05, 0.03, 0.015);
            StdDraw.filledEllipse(x-0.04, y+0.05, 0.03, 0.015);
        }
        if(eyeColor == 3)
        {
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledEllipse(x+0.04, y+0.05, 0.03, 0.015);
            StdDraw.filledEllipse(x-0.04, y+0.05, 0.03, 0.015);
        }
        if(eyeColor == 4)
        {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledEllipse(x+0.04, y+0.05, 0.03, 0.015);
            StdDraw.filledEllipse(x-0.04, y+0.05, 0.03, 0.015);
        }
        if(eyeColor == 5)
        {
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.filledEllipse(x+0.04, y+0.05, 0.03, 0.015);
            StdDraw.filledEllipse(x-0.04, y+0.05, 0.03, 0.015);
        }
        StdDraw.setPenColor();
        StdDraw.setPenRadius();
    }

    public static void Flag (double x, double y, int length, int flagNumber)
    {
        if (length == 1)
        {
            StdDraw.setPenRadius(0.0035);
            StdDraw.line(x, y+0.12, x, y-0.2);
        }
        if (length == 2)
        {
            StdDraw.setPenRadius(0.003);
            StdDraw.line(x, y+0.12, x, y-0.25);
        }
        if (length == 3)
        {
            StdDraw.setPenRadius(0.0025);
            StdDraw.line(x, y+0.12, x, y-0.30);
        }
        if (length == 4)
        {
            StdDraw.setPenRadius(0.002);
            StdDraw.line(x, y+0.12, x, y-0.35);
        }

        if (flagNumber == 1)
        {
            StdDraw.setPenColor(StdDraw.BOOK_RED);
            StdDraw.filledRectangle(x+0.1, y+0.02, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledRectangle(x+0.1, y+0.06, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(x+0.1, y+0.1, 0.1, 0.02);
        }
        if (flagNumber == 2)
        {
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.filledRectangle(x+0.1, y+0.02, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.filledRectangle(x+0.1, y+0.06, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(x+0.1, y+0.1, 0.1, 0.02);
        }
        if (flagNumber == 3)
        {
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.filledRectangle(x+0.1, y+0.02, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(x+0.1, y+0.06, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
            StdDraw.filledRectangle(x+0.1, y+0.1, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledCircle(x+0.1, y+0.06, 0.015);
        }
        if (flagNumber == 4)
        {
            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
            StdDraw.filledRectangle(x+0.1, y+0.02, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.filledRectangle(x+0.1, y+0.06, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.BOOK_LIGHT_BLUE);
            StdDraw.filledRectangle(x+0.1, y+0.1, 0.1, 0.02);
            StdDraw.setPenColor(StdDraw.PRINCETON_ORANGE);
            StdDraw.filledCircle(x+0.1, y+0.06, 0.015);
        }
        StdDraw.setPenColor();
        StdDraw.setPenRadius();
    }
}
