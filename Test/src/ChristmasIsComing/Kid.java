package ChristmasIsComing;

public class Kid {
    private String name;
    private int age;
    private boolean isHappy;
    private boolean beenNice;

    public Kid(String name, int age) {
        this.name = name;
        this.age = age;
        this.isHappy = true;
        this.beenNice = true;
    }
    public void receiveGift() {
        isHappy = true;
    }

    public String introduce() {
        if (isHappy = true ) {
            return "My name is " + name + ", I'm " + age + " years old and I'm happy :)";
        } else {
            return "My name is " + name + ", I'm " + age + " years old and I'm sad :(";
        }
    }

    public String getName() {
        return name;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public boolean isBeenNice() {
        return beenNice;
    }

    public int getAge() {
        return age;
    }
}
