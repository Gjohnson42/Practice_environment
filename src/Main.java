/**
 * Created by Garrett on 1/21/2016.
 * This is meant to be the primary file to practice random stuff in Java, for the sake of learning it.
 * Make a seperate branch if you aren't sure what you're doing. This should be a chromebook based change.
 * I'll check at home whether or not github decided to freak out.
 */
public class Main {

    public static void main(String[] args) {
        String[] adjectives= {"Vicious", "Fluffy", "Ramblin'","Elder"};
        String[] monsters= {"red dragon", "mushroom", "chihuaha"};
        String[] actions= {"attacked!", "just ambled by.", "caught you by suprise!"};
// since you need an int to use the randomizer, convert the array lengths to ints.
        int a= (int)adjectives.length;
        int m= (int)monsters.length;
        int ac= (int)actions.length;
        //now to create the random numbers, which requires a casting to int. I could just tell it the lengths by hand
        //but that would make my code more brittle.
        int rand1= (int)(Math.random()*a);
        int rand2= (int)(Math.random()*m);
        int rand3= (int)(Math.random()*ac);
        String phrase= ("a "+ adjectives[rand1]+ " "+ monsters[rand2]+ " "+ actions[rand3]);
        System.out.println(phrase);


    }
}
