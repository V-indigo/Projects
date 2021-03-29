package ChristmasIsComing;

import java.util.List;

public class Program {
    public static void main(String[] args) {
        Kid kid1 = new Kid("Slavo", 15);
        Kid kid2 = new Kid("Kuba", 6);
        Kid kid3 = new Kid("Ben", 7);

        System.out.println(kid1.introduce());
        System.out.println(kid2.introduce());
        System.out.println(kid3.introduce());

        Santa santa1 = new Santa("Claus", 123);

        System.out.println(santa1.introduce());

        School school1 = new School(List.of(kid1, kid2, kid3));

        school1.startChristmasParty(santa1);


    }
}
