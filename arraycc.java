public class arraycc {

    public static void use(String cars[]){
        cars[0]="Opel";
    }

    public static void use(int marks[]){
        for (int a = 0; a<marks.length; a++){
            marks[a]= marks[a]+1;
        }
    }

    public static int linearsearch(int number[], int k){
        for (int i = 0; i<number.length; i++){
            if (number[i]==k){
                return i;
            }
        }
        return -1;          //represents that number does not exist.
    }

    public static int linearsearch2(String food[], String f){
        for (int i = 0; i<food.length; i++){
            if (food[i].equals(f)){
                return i;
            }
        }
        return -1;
    }

    public static int find (int nakul[]){
        int largest = Integer.MIN_VALUE;    // -infinity
        int smallest = Integer.MAX_VALUE;   // +infinity

        for(int i = 0; i<nakul.length; i++){
            if (largest < nakul[i]){
                largest = nakul[i];
            }
            if (smallest > nakul[i]){
                smallest = nakul[i];
            }
        } 
        System.out.println("Smallest value is : "+smallest);
        return largest;
    }

    public static void Arraypair(int pair[]){
        for (int i = 0; i<pair.length; i++){
            int curr = pair[i];
            for (int j = i+1; j<pair.length; j++){
                System.out.print("("+curr+" , "+pair[j]+") ");
            }
            System.out.println();
        }
    }

    public static void Subarray(int sub[]){
       for(int i = 0; i<sub.length; i++){
        for(int j = i; j<sub.length; j++){
            for(int k=i; k<=j;k++){
                System.out.print(sub[k]+" ");
            }
            System.out.println();
        }
        System.out.println();
       }
    }

    public static void main(String args[]){

        // Linear Search
        // int number[]= {10, 25, 54, 63, 74, 12, 20, 41, 98, 13};
        // int k = 58;

        // int index = linearsearch(number, k);
        // if (index==-1){
        //     System.out.println("NOT Found");
        // }
        // else{
        //     System.out.println("The number is at index : "+index);
        // }

        // String food[]= {"Poha", "Samosa", "Patashi", "Bhelpuri"};
        // String f = "Samosa";

        // int result = linearsearch2(food, f);
        // if (result == -1){
        //     System.out.println("Not Found");
        // }
        // else{
        //     System.out.println("Item is found at index : "+result);
        // }

        // Largest/Smallest number in array
        // int nakul[] = {14, 12, 54, 23, 35, 71};
        // System.out.println("Largest Value is : "+find(nakul));

        // Pairs In Array
        // int pair[] = {2, 3, 5, 7, 11};
        // Arraypair(pair);

        // Sub-Array
        int sub[] = {2, 4, 6, 8, 10};
        Subarray(sub);

        // Basic use of Arrays
        // String cars[] = {"volvo", "BMW", "Audi", "Ford"};
        // use(cars);
        // for(int i = 0; i<cars.length; i++){
        //     System.out.print(cars[i]+" ");
        // }
        //  System.out.println();
        

        // int marks[]= {99, 54, 78};
        // use(marks);
        // for (int a = 0; a<marks.length; a++){
        //     System.out.print(marks[a]+" ");
        // }

        // System.out.println(cars[3]);
        // cars[0]="Opel";
        // System.out.println(cars[0]);
        // System.out.println(cars.length);
    }   
}
