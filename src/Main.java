public class Main {

    public static void main(String[] args) {

        printStars(4);
        System.out.println("---");
        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);

    }

    public static void printStars(int number) {
        // part 1 of the exercise

        // number of stars to print

        int count = 0;

        while (count < number) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise

        // produce number of spaces specific by the number

        // task: keep track of number of times to space
        int count = 0;

        while (count < number) {
            System.out.print(" ");
            count++;
        }
    }
    public static void printTriangle(int size) {

       int count = size;
       int space = 1;

       while (space <= count) {
           printSpaces(count - space);
           printStars(space);
           space++;
       }
    }

    public static void christmasTree(int height) {

        // print correct Christmas tree
        // consists of triangle with specified height as well as the base
        // base = two stars high and three stars wide AND
        // placed at center of triangle's bottom
        // use printSpaces and printStars

        // keep track of number of times
        int count = 0;
        int line = 0;


        while (count < height) {
            // increment count by 1 first-- keeping track of counts
            count++;
            // print spaces first - do so by subtracting the number of times from
            // the overall height to get the number of spaces needed
            printSpaces(height - count);
            // each loop print the number of stars accordingly
            printStars(count + count - 1);

            if (count == height) {
                while (line < 2) {
                    printSpaces(height - 2);
                    printStars(3);
                    line++;
                }
            }
        }

        // if christmasTree(4)
        // first loop:
        // 3 space 1 star
        // second loop:
        // 2 space 2 star
        // third loop:
        // 1 space 3 star
        // fourth loop:
        // 0 space 4 star

        // since the space only print out the left side,
        // we need to account for the stars on right side AND LEFT
        // space: so if height is 4, we need to subtract count 1 from it, we get 3 space
        // star: add number of count (times it loops) to number of count (times it loops)
        // and subtract 1 since
        // the top doesn't need another star.








    }
}