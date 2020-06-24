package org.enumexercises.zad_2;

public enum PackageSize {

    SMALL(5, 25),
    MEDIUM(25, 50),
    LARGE(50, 100),
    UNKNOWN(0,0);

    private int min;
    private int max;

    PackageSize(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public static PackageSize getPacketSizeSecond(int min, int max) {
        for (PackageSize packageSize : values()) {
            if(min >= packageSize.min && max < packageSize.max) {
                return packageSize;
            }
        }
        return UNKNOWN;
    }
    /*
    public static PackageSize getPacketSize(int min, int max) {
        if(min >= 5 && max < 25) {
            return SMALL;
        } else if(min >= 26 && max < 50) {
            return MEDIUM;
        } else {
            return LARGE;
        }
    }

     */
    // values() - odnosi sie do wartości enuma
}
