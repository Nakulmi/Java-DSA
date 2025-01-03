package mypack.oops.abstraction; 

public class Abstract{  
   public static void main(String args[]){  
      System.out.println("Welcome to package"); 
      
      // Galaxy g = new Galaxy();
      // g.expansion();
      // g.planet();
      // System.out.println(g.color);

      // MilkyWay mw = new MilkyWay();
      // mw.expansion();
      // mw.planet();

      // Queen q = new Queen();
      // q.moves();
      // Rook r = new Rook();
      // r.moves();
      // Pawn p = new Pawn();
      // p.moves();

      Bear b = new Bear();
      b.eatsGrass();
      b.eatsMeat();
   }
}

//Multiple Inheritance
interface Herbivore{
   void eatsGrass();
}
interface Carnivore{
   void eatsMeat();
}
class Bear implements Herbivore, Carnivore{
   public void eatsGrass(){
      System.out.println("Eats Vegetarian food");
   }
   public void eatsMeat(){
      System.out.println("Eats non-Vegetarian food");
   }
}

//Interfaces concept
interface ChessPlayer{
   void moves();
}
class Queen implements ChessPlayer{
   public void moves(){
      System.out.println("up,down,left,right,diagonal (in every directions)");
   }
}
class Pawn implements ChessPlayer{
   public void moves(){
      System.out.println("up (only 1 step)");
   }
}
class Rook implements ChessPlayer{
   public void moves(){
      System.out.println("up,down,left,right");
   }
}

// Abstract class concept
abstract class Universe{
   String color;
   Universe(){
      color = "Black";
   }

   void expansion(){
      System.out.println("exapnding faster than speed of light");
   }
   abstract void planet();
}
class Galaxy extends Universe{
   void changeColor(){
      color = "Blue";
   }
   void planet(){
      System.out.println("have 1billon planets");
   }
}
class MilkyWay extends Universe{
   void planet(){
      System.out.println("have 100billon planets");
   }
}