/**
 * Created by garrett on 1/27/16.
 */
public class PhraseGen {


        String[] adjectives = {"vicious", "fluffy", "ramblin'", "greater", "slimy", "arthritic", "boss rank"};
        String[] monsters = {"red dragon", "mushroom", "chihuaha", "hippie", "starving artist"};
        String[] actions = {"attacked!", "just ambled by.", "caught you by suprise!", "slapped you across the face!",
        "looks at you lewdly!", "did an impressive Trump impression!"};
        // since you need an int to use the randomizer, convert the array lengths to ints.
        int a = (int) adjectives.length;
        int m = (int) monsters.length;
        int ac = (int) actions.length;
        //now to create the random numbers, which requires a casting to int. I could just tell it the lengths by hand
        //but that would make my code more brittle.
        void generate(int num) {
            int phraseCount= num;
            while(phraseCount>0) {
                int rand1 = (int) (Math.random() * a);
                int rand2 = (int) (Math.random() * m);
                int rand3 = (int) (Math.random() * ac);
                String phrase = ("a " + adjectives[rand1] + " " + monsters[rand2] + " " + actions[rand3]);
                System.out.println(phrase);
                phraseCount--;
            }
    }



}
