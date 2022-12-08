package Racing;

public class Sponsors {
    private final String sponsorName;
    private final int sumSupport;

    public Sponsors(String sponsorName, int sumSupport) {
        this.sponsorName = sponsorName;
        this.sumSupport = sumSupport;
    }

    public String getSponsorName() {
        return sponsorName;
    }

    public int getSumSupport() {
        return sumSupport;
    }

    public void supportRace() {
        System.out.println(getSponsorName() + " спонсирует заезд");
    }

    @Override
    public String toString() {
        return sponsorName + ", сумма поддержки: " + sumSupport;
    }
}
