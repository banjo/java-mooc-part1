public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int loop = 0;
        while (loop < amount) {
            System.out.print("*");
            loop++;
        }
        
        System.out.println("");
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int loop = 0;
        while (loop < amount) {
            System.out.print(" ");
            loop++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int loop = 0;
        while (loop < size) {
            printWhitespaces(size-loop-1);
            printStars(loop+1);
            loop++;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int loop = 0;
        int stars = 1;
        
        // julgransdel
        while (loop < height){
            printWhitespaces(height-loop-1);
            printStars(stars);
            loop++;
            stars += 2;
                  
        }
        
        
        // fot
        int loop2 = 0;
        while (loop2 < 2){
            printWhitespaces(height-2);
            printStars(3);
            loop2++;
        } 
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
