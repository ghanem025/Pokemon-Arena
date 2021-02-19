class Attack{
  
public int cost;
public int damage;
public String name,special;


public Attack(String n,int c,int d,String s){
  name =n;
  cost=c;
  damage=d;
  special=s;
  }

public String toString(){
  return name+cost+damage+special;
} 
}