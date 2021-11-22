public class RandomAnimation
{
    public static void main (String[] args)
    {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);

        StdDraw.enableDoubleBuffering();

        double randomPosition1 = (2 * Math.random()) - 1;
        double randomPosition2 = (2 * Math.random()) - 1;
        int HouseWindows = 1 + (int)(Math.random() * 4);
        int HouseColor = 1 + (int)(Math.random() * 4);
        double randomPosition3 = Math.random() - 0.5;
        double randomPosition4 = Math.random() - 0.5;
        int FaceEyeColor = 1 + (int)(Math.random() * 5);
        double randomPosition5 = (Math.random() / 2) - 1;
        double randomPosition6 = (Math.random() / 4) + 0.75;
        int FlowerPetals1 = 1 + (int)(Math.random() * 4);
        int FlowerColorOfCenter1 = 1 + (int)(Math.random() * 3);
        double randomPosition7 = (Math.random() / 2) + 0.5;
        double randomPosition8 = (Math.random() / 4) + 0.75;
        int FlowerPetals2 = 1 + (int)(Math.random() * 4);
        int FlowerColorOfCenter2 = 1 + (int)(Math.random() * 3);
        double randomPosition9 = Math.random() - 0.5;
        double randomPosition10 = Math.random() - 0.5;
        int FlagLength = 1 + (int)(Math.random() * 4);
        int FlagNumber = 1 + (int)(Math.random() * 4);

        while(true)
        {
            double HouseX1 = randomPosition1;
            double HouseY1 = randomPosition2;

            double HouseXPath1 = 0 - HouseX1;
            double HouseYPath1 = 1 - HouseY1;
            double HouseXStep1 = HouseXPath1 / 50;
            double HouseYStep1 = HouseYPath1 / 50;

            double HouseX2 = 0;
            double HouseY2 = 1.0;

            double HouseXPath2 = 1 - 0;
            double HouseYPath2 = -0.3 - 1;
            double HouseXStep2 = HouseXPath2 / 50;
            double HouseYStep2 = HouseYPath2 / 50;

            double HouseX3 = 1;
            double HouseY3 = -0.3;

            double HouseXPath3 = -0.5 - 1;
            double HouseYPath3 = -1 - (-0.3);
            double HouseXStep3 = HouseXPath3 / 50;
            double HouseYStep3 = HouseYPath3 / 50;

            double HouseX4 = -0.5;
            double HouseY4 = -1;

            double HouseXPath4 = -1.1 - (-0.5);
            double HouseYPath4 = 0.6 - (-1);
            double HouseXStep4 = HouseXPath4 / 50;
            double HouseYStep4 = HouseYPath4 / 50;

            double FaceX1 = randomPosition3;
            double FaceY1 = randomPosition4;

            double FaceXPath1 = 1 - FaceX1;
            double FaceYPath1 = 0.9 - FaceY1;
            double FaceXStep1 = FaceXPath1 / 50;
            double FaceYStep1 = FaceYPath1 / 50;

            double FaceX2 = 1;
            double FaceY2 = 0.9;

            double FaceXPath2 = 0.7 - 1;
            double FaceYPath2 = -1 - 0.9;
            double FaceXStep2 = FaceXPath2 / 50;
            double FaceYStep2 = FaceYPath2 / 50;

            double FaceX3 = 0.7;
            double FaceY3 = -1;

            double FaceXPath3 = -0.5 - FaceX3;
            double FaceYPath3 = 0 - FaceY3;
            double FaceXStep3 = FaceXPath3 / 50;
            double FaceYStep3 = FaceYPath3 / 50;

            double FaceX4 = -0.5;
            double FaceY4 = 0;

            double FaceXPath4 = 0 - FaceX4;
            double FaceYPath4 = 1 - FaceY4;
            double FaceXStep4 = FaceXPath4 / 50;
            double FaceYStep4 = FaceYPath4 / 50;

            double FlowerX1 = randomPosition5;
            double FlowerY1 = randomPosition6;

            double FlowerYPath1 = -1 - FlowerY1;
            double FlowerYStep1 = FlowerYPath1 / 50;

            double FlowerY2 = -1;
            double FlowerYStep2 = -1.0/13.3;

            double FlowerX2 = randomPosition7;
            double FlowerY3 = randomPosition8;

            double FlowerYPath2 = -1 - FlowerY1;
            double FlowerYStep3 = FlowerYPath2 / 50;

            double FlowerY4 = -1;
            double FlowerYStep4 = -1.0/13.3;

            for(int counter1 = 0; counter1 < 50; counter1++)
            {
                StdDraw.clear();
                RandomDrawing.House(HouseX1, HouseY1, HouseWindows, HouseColor);
                RandomDrawing.Face(FaceX1, FaceY1, FaceEyeColor);
                RandomDrawing.Flower(FlowerX1, FlowerY1, FlowerPetals1, FlowerColorOfCenter1);
                RandomDrawing.Flower(FlowerX2, FlowerY3, FlowerPetals2, FlowerColorOfCenter2);
                RandomDrawing.Flag(randomPosition9, randomPosition10, FlagLength, FlagNumber);
                StdDraw.show();
                StdDraw.pause(30);

                HouseX1 += HouseXStep1;
                HouseY1 += HouseYStep1;
                FaceX1 += FaceXStep1;
                FaceY1 += FaceYStep1;
                FlowerY1 += FlowerYStep1;
                FlowerY3 += FlowerYStep3;
            }

            for(int counter2 = 0; counter2 < 50; counter2++)
            {
                if(Math.abs(FlowerY2 + FlowerYStep2) >= 1)
                {
                    FlowerYStep2 = - FlowerYStep2;
                }
                FlowerY2 += FlowerYStep2;

                if(Math.abs(FlowerY4 + FlowerYStep4) >= 1)
                {
                    FlowerYStep4 = - FlowerYStep4;
                }
                FlowerY4 += FlowerYStep4;

                StdDraw.clear();
                RandomDrawing.House(HouseX2, HouseY2, HouseWindows, HouseColor);
                RandomDrawing.Face(FaceX2, FaceY2, FaceEyeColor);
                RandomDrawing.Flower(FlowerX1, FlowerY2, FlowerPetals1, FlowerColorOfCenter1);
                RandomDrawing.Flower(FlowerX2, FlowerY4, FlowerPetals2, FlowerColorOfCenter2);
                RandomDrawing.Flag(randomPosition9, randomPosition10, FlagLength, FlagNumber);
                StdDraw.show();
                StdDraw.pause(30);

                HouseX2 += HouseXStep2;
                HouseY2 += HouseYStep2;
                FaceX2 += FaceXStep2;
                FaceY2 += FaceYStep2;
            }

            for(int counter3 = 0; counter3 < 50; counter3++)
            {
                StdDraw.clear();
                RandomDrawing.House(HouseX3, HouseY3, HouseWindows, HouseColor);
                RandomDrawing.Face(FaceX3, FaceY3, FaceEyeColor);
                RandomDrawing.Flag(randomPosition9, randomPosition10, FlagLength, FlagNumber);
                StdDraw.show();
                StdDraw.pause(30);

                HouseX3 += HouseXStep3;
                HouseY3 += HouseYStep3;
                FaceX3 += FaceXStep3;
                FaceY3 += FaceYStep3;
            }

            for(int counter4 = 0; counter4 < 50; counter4++)
            {
                StdDraw.clear();
                RandomDrawing.House(HouseX4, HouseY4, HouseWindows, HouseColor);
                RandomDrawing.Face(FaceX4, FaceY4, FaceEyeColor);
                RandomDrawing.Flag(randomPosition9, randomPosition10, FlagLength, FlagNumber);
                StdDraw.show();
                StdDraw.pause(30);

                HouseX4 += HouseXStep4;
                HouseY4 += HouseYStep4;
                FaceX4 += FaceXStep4;
                FaceY4 += FaceYStep4;

                FaceYStep4 -= 0.002;
            }
        }
    }
}
