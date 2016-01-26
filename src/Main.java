/**
 * Created by Garrett on 1/21/2016.
 * This is meant to be the primary file to practice random stuff in Java, for the sake of learning it.
 * Make a seperate branch if you aren't sure what you're doing. This should be a chromebook based change.
 * I'll check at home whether or not github decided to freak out.
 */
/*This is an application that will use a loop to display a song called x rogues stealing the gold, which will loop
and there will be methods to change the lyrics when the number of rogues is singluar, or nonexistent.
 */
public class Main {



    public static void main(String[] args){
        int rogueNum= 10;
        while(rogueNum>0){
            if (rogueNum==1){
                System.out.print("The rogue that remained left with his gain");
                rogueNum--;

            }
            //for when rogues are greater than one
            else {
                System.out.print(rogueNum + " rogues stealing the gold, but in comes the guard! He takes one out");

                rogueNum--;
                System.out.print(" the rest of them shout, " + rogueNum + " rogues stealing the gold!");
                System.out.println();
            }
        }
    System.out.print(" and the rogues were gone when the moon started to wane.");
    }

}
