public class stars2 {

    public static void Butterfly(int n){

        for(int i=1; i<=n; i++){

            // print i stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // print 2*(n-i) spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // print i stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            // print 2*(n-i) spaces
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }

            // print i stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void solidRhombus(int n){

        // int Current_line = 1;
        // int Total_lines = n;
        // int spaces = n - Current_line;
        
        // while (Current_line <= Total_lines) {

        //     // print n - Current_line spaces
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     // print n stars
        //     for(int j=1; j<=n; j++){
        //         System.out.print("*");
        //     }

        //     // prepare for next line
        //     System.out.println();
        //     spaces--;
        //     Current_line++;

        // }

        // Alternative approach
        for(int i=1; i<=n; i++){

            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // print n stars
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }

    public static void HollowRhombus(int n){
        for(int i=1; i<=n; i++){

            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // print n stars
            for(int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }

    public static void HollowRectangle(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void Diamond(int n){
        // int Current_line = 1;
        // int Total_lines = 2*n;
        // int spaces = n - Current_line;
        // int stars = 1;

        // while (Current_line <= Total_lines) {
            
        //     // print n - i spaces
        //     for(int j=1; j<=spaces; j++){
        //         System.out.print(" ");
        //     }

        //     // print stars
        //     for(int j=1; j<=stars; j++){
        //         System.out.print("*");
        //     }

        //     // prepare for next line
        //     System.out.println();
        //     if (Current_line<n) {
        //         spaces--;
        //         stars+=2;
        //     }
        //     else{
        //         spaces++;
        //         stars-=2;
        //     }
        //     Current_line++;

        // }

        for(int i=1; i<=n; i++){
            
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // print stars
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i=n; i>=1; i--){
            
            // print spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            // print stars
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void Rpattern(int n){

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){

                // print stars at 1st or 3rd row
                if (i==1 || i== 3) {
                    System.out.print("*");
                }

                // print stars at 2nd row
                if (i==2) {
                    if (j==1 || j==n) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

                // print stars at 4rth row
                if (i==4 && (j==1 || j==2)) {
                    System.out.print("*");
                }
                
                // print stars 5fth row
                if (i==5) {
                    if (j==1 || j==3) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

                // print stars 6th row
                if (i==6) {
                    if (j==1 || j==4) {
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }

    public static boolean isPrime(int n){
        for(int i=2; i*i<=n; i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    
    public static void prime_in_range(int n){
        for(int i=2; i<=n; i++){
            if (isPrime(i)) {
                System.out.print(i+" ");
            }
        }
    }

    public static void SandGlass(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=2; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowDiamond(int n){
        
    

    }


    public static void main(String[] args) {

        // Square pattern
        // int n = 5;
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Bottom left triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row >= col) {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // Top left triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row + col <= n + 1) {
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        // Bottom right triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row + col >= n + 1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Top right triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (col >= row) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // X pattern
        // int n = 7;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row - col == 0 || row + col == n + 1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Count triangle or col triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row >= col) {
        //             System.out.print(col+" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Row triangle
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row >= col) {
        //             System.out.print(row+" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Floyd's triangle
        // int n = 5;
        // int num = 1;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row >= col) {
        //             System.out.print(num+" ");
        //             num++;
        //         }
        //     }
        //     System.out.println();
        // }

        // Hollow Rectangle 
        // int r = 6;
        // int c = 6;
        // for(int row = 1; row <= r; row++){
        //     for(int col = 1; col <= c; col++){
        //         if (row == 1 || row == r || col == 1 || col == c) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 0 1 pattern
        // int n = 5;
        // for(int row = 1; row <= n; row++){
        //     for(int col = 1; col <= n; col++){
        //         if (row >= col) {
        //             if ((row + col) % 2 == 0) {
        //                 System.out.print(1);
        //             }
        //             else{
        //                 System.out.print(0);
        //             }
        //         }
                

        //     }
        //     System.out.println();
        // }

        // Butterfly(5);
        // solidRhombus(6);
        // HollowRhombus(5);
        // HollowRectangle(5); 

        // Diamond(4);
        // Rpattern(7);

        // hollow Rectangle or O 
        // int n = 6;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if (i==1 || i==n || j==1 || j==n) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // 
        // int n=4;
        // for(int i=1; i<=n; i++){

        //     // print n-i spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     // print 2i-1 stars
        //     for(int j=1; j<=(2*i)-1; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();

        // }
        // for(int i=n; i>=1; i--){

        //     // print n-i spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }

        //     // print 2i-1 stars
        //     for(int j=1; j<=(2*i)-1; j++){
        //         System.out.print("*");
        //     }

        //     System.out.println();
            
        // }

        // prime_in_range(20);
        
        // SandGlass(5);

        // pyramid pattern
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     // spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // reverse pyramid pattern
        // int n=5;
        // for(int i=n; i>=1; i--){
        //     // spaces
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     // stars
        //     for(int j=1; j<=i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // hollow square pattern with diagonals
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if (i==1 || i==n || j==1 || j==n || i==j || i+j == n+1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        // Right arrow pattern
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // Left arrow pattern
        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if (i+j>=n+1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i=n-1; i>=1; i--){
        //     for(int j=1; j<=n; j++){
        //         if (i+j>=n+1) {
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


        hollowDiamond(5);
    }
}
