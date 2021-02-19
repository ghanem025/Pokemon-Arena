class Pokemon{
  private String name;
  private int hp;
//  int attack,energy cost;
  
  public Pokemon(String info){
    String [] stat = info.split(",");
    name = stat[0];
    hp = Integer.parseInt(stat[1]);
   
  }
  public String toString(){
    return name +" HP: "+hp;
  }
  
}