import java.util.*;

public class advPattern {
    public static void hollow_rectangle (int row, int col){
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=col; j++){
                if (i==1 || i==row || j==1 || j==col){
                    System.out.print(" *");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void inverted_rotated_half_pyramid (int row){
        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=row-i; j++){
                System.out.print("  ");
            }
            for (int k = 1; k<=i; k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void inverted_half_pyramid (int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floyds_triangle (int n){
        int counter = 1;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void triangle (int x){

        for (int i = 1; i<=x; i++){
            for (int j = 1; j<=i; j++){
                if ((i+j)%2 == 0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly (int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            for (int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = n; i>=1; i--){
            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            for (int j = 1; j<=2*(n-i); j++){
                System.out.print("  ");
            }

            for (int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void solid_rhombus (int a){
        for (int i = 1; i<=a; i++){
            for (int j = 1; j<=(a-i); j++){
                System.out.print("  ");
            }

            for (int k = 1; k<=a; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void hollow_rhombus (int n){
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=(n-i); j++){
                System.out.print("  ");
            }
            for (int k = 1; k<=n; k++){
                if(i==1|| i==n|| k==1|| k==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void daimond (int n){
        for (int i = 1; i<=n; i++){
            for (int j  = 1; j<=(n-i); j++){
                System.out.print("  ");
            }

            for (int k = 1; k<=((2*i)-1); k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }

        for (int i = n-1; i>=1; i--){
            for (int j  = 1; j<=(n-i); j++){
                System.out.print("  ");
            }

            for (int k = 1; k<=((2*i)-1); k++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }

    public static void solid_rectangle (int a, int b){
        for (int i = 1; i<=a; i++){

            for (int k = 1; k<=b; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main (String args[]){
        //daimond(9);
        //floyds_triangle(6);
        //solid_rectangle(5,9);
        
       
        }
    }
