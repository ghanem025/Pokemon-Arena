import java.util.*;
import java.io.*;
class Pokemon{
  private String name;
  public int hp;
  private String type;
  private int energycost1;
  private int damage1;
//  private Attack[]attacks;
  private String attackname1;
  int num =10;
  int k=0;
  ArrayList<Attack>attacks = new ArrayList<Attack>();
 
  public Pokemon(String info) throws IOException{
 
    String [] stats = info.split(",");
    
    name = stats[0];
    hp = Integer.parseInt(stats[1]);
    type = stats[2];
    int numAtt = Integer.parseInt(stats[5]);
    String weakness = stats[4];
    
    
    for(int i=0;i<numAtt;i++){
     String n = stats[6+i*4]; 
     int c = Integer.parseInt(stats[7+i*4]); 
     int d = Integer.parseInt(stats[8+i*4]); 
     String s = stats[9+i*4];
     attacks.add(new Attack(n,c,d,s));
     System.out.println(attacks);
      
    }
  }

  
  public String toString(){
 
    return  name + hp ;
        
  }
  
  
  public void moves(){
    
  }
  
  public boolean awake(){
    return hp>0;
  }
 
  public void attack(Pokemon other, int att){
   System.out.println(attacks.get(att));
   Attack atk = attacks.get(att);
   int dam =atk.damage;
//   if(type.equals(other.weakness)){
//     dam *= 2;
//   }
    other.hp -= dam;
    System.out.println(other.hp);
    System.out.println(damage1);
   
    if (other.hp<0){
      other.hp = 0;
      
    }
//    if (energy<10){
//      System.out.println("you do not have enough energy to attack");
//    }
  }
}
