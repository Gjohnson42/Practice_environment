/**
 * Created by Garrett on 1/21/2016.
 * This program will use arrays to reference objects, in this case monsters, and list their stats.
 */
public class Main {
    public static void main(String[] args){

        LevelTenMons[] tester= new LevelTenMons[3];
        tester[0]= new LevelTenMons(20,30,100,"Donald Trump");
        tester[0].displayStats();
    }
}
