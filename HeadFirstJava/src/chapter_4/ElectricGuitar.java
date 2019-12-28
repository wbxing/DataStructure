package chapter_4;

class ElectricGuitar {

    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    public String getBrand() {
        return brand;
    }
    public void setBrand(String aBrand) {
        this.brand = aBrand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }
    public void setNumOfPickups(int num) {
        this.numOfPickups = num;
    }

    public boolean getRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean yesOrNo) {
        rockStarUsesIt = yesOrNo;
    }
}
