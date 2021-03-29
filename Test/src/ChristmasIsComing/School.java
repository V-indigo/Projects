package ChristmasIsComing;

import java.util.List;
import java.util.ArrayList;

public class School {
    private List<Kid> listOfKids = new ArrayList<>();

    public School(List<Kid> listOfKids) {
        this.listOfKids = listOfKids;
    }

    public void enroll(Kid kid) {
       if (kid.isBeenNice()) {
           listOfKids.add(kid);
       }
    }

    public void startChristmasParty(Santa santa) {
        System.out.println("Santa has given away " + santa.giveaway(listOfKids) + " gifts during the Christmas party.");

    }

    public List<Kid> getSadYoungsters() {
        List<Kid> sadKids = new ArrayList<>();
        for (int i = 0; i < listOfKids.size(); i++) {
            if (!listOfKids.get(i).isHappy() && listOfKids.get(i).getAge() < 10) {
                sadKids.add(listOfKids.get(i));
            }
        }
        return sadKids;

    }
}
