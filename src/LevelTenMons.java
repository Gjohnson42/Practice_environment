/**
 * Created by garrett on 1/28/16.
 */
public class LevelTenMons {
    String name;
    int attack;
    int defense;
    int hp;
    LevelTenMons (int att, int def, int h, String n){
       name=n;
        attack=att;
        defense=def;
        hp=h;
    }
    void displayStats(){
        System.out.println( name+"'s stats are as follows:\nAttack:"+attack+ "\nDefense:"+ defense+ "\nHP:"+
        hp+"\n");
    }
}
