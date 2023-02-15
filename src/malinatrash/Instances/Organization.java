package malinatrash.Instances;

import java.util.Random;

public abstract class Organization {

    private final String name;

    public Organization(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    protected String getObjetName() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(5);
        for (int i = 0; i < 5; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }

        return buffer.toString();
    }

    public abstract String processOperation();
}
