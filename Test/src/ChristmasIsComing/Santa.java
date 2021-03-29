package ChristmasIsComing;

import java.util.List;

public class Santa {
    private String name;
    private int age;
    private int availableGifts;

    public Santa(String name, int age) {
        this.name = name;
        this.age = age;
        this.availableGifts = 100;
    }

    public String introduce() {
        if (availableGifts > 0) {
            return "My name is " + name + ", I'm " + age + " years old. I have " + availableGifts + " gifts in my bag";
        } else {
            return "My name is " + name + ", I'm " + age + " years old. I do not any gifts in my bag";
        }
    }

    public int giveaway(List<Kid> scoreList) {
        int gift = 0;
        for (int i = 0; i < scoreList.size(); i++) {
            if (scoreList.get(i).isBeenNice() && availableGifts > 0); {
                scoreList.get(i).receiveGift();
                gift++;
                availableGifts--;
            }
        }
        return gift;
    }
}
