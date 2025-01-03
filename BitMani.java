public class BitMani {

    public static void oddOReven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("EVEN NUMBER");
        }
        else{
            System.out.println("ODD NUMBER");
        }
    }

    public static void getBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            System.out.println("0");
        }
        else{
            System.out.println("1");
        }
    }

    public static int setBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int clearBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int cleariBits(int n, int i){
        int bitmask = ~0<<i;
        return n&bitmask;
    }

    public static int updateiBits(int n, int i, int newbit){
        if(newbit == 0){
            return clearBit(n, i);
        }
        else{
            return setBit(n, i);
        }
    }

    public static int clearRange(int n, int i, int j){
        int a = ~0 << (j+1);
        int b = (1<<i) - 1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static boolean powerofTwo(int n){
            return (n & (n - 1)) == 0;
        
    }

    public static int countBits(int n){
        int count = 0;
        while(n>0){
            if((n & 1) != 0){    // Check our LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){   // Check LSB
            if((n & 1) != 0){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static void swapNumbers(int x, int y){
        System.out.println("Before swap x = "+x+" y = "+y);
        
        int a = x ^ y;
        int b = x ^ y;

        System.out.println("After swap x = "+a+" y = "+b);
    } 

    public static int magicNumbers(int n){
        int ans = 0;
        int base = 5;

        while(n > 0){
            int last = n & 1;
            n = n >> 1;

            ans += last*base;
            base *= 5;
        }
        return ans;
    }
    public static void main(String args[]){
        // BInary AND &
        int a = 5&6;
        System.out.println(a);

        // Binary OR |
        int b = 3|6;
        System.out.println(b);

        // Binary XOR ^
        int c = 5^6;
        System.out.println(c);

        // Binary One"s Complement ~
        int d = ~5;
        System.out.println(d);

        // Binary Left Shift <<
        int e = 5<<2;
        System.out.println(e);

        // Binary Right Shift >>
        int f = 5>>2;
        System.out.println(f);

        // oddOReven(3);
        // oddOReven(14);

        //getBit(10, 2);

        //System.out.println(setBit(10, 2));

        //System.out.println(clearBit(10, 1));

        //System.out.println(cleariBits(15, 2));

        //System.out.println(updateiBits(15, 2, 1));

        //System.out.println(clearRange(10, 2, 4));

        //System.out.println(powerofTwo(8));

        //System.out.println(countBits(10));

        //System.out.println(fastExpo(5, 5));

        //swapNumbers(3, 4);

        // ADD 1 TO AN INTEGER x
        // int u = 7;
        // System.out.println("New number " + -~u);

        System.out.println(magicNumbers(6));
    }
} 
