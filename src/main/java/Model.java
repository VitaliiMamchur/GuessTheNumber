public class Model {
    private int minBorder;
    private int maxBorder;

    public int getMinBorder() {
        return minBorder;
    }

    public void setMinBorder(int minBorder) {
        this.minBorder = minBorder;
    }

    public int getMaxBorder() {
        return maxBorder;
    }

    public void setMaxBorder(int maxBorder) {
        this.maxBorder = maxBorder;
    }

    public boolean setRange(int minBorder, int maxBorder) {

        if ((maxBorder - minBorder) >= 2) {
            setMinAndMaxBorders(minBorder, maxBorder);
            return true;
        }

        return false;
    }

    private void setMinAndMaxBorders(int minBorder, int maxBorder) {
        setMinBorder(minBorder);
        setMaxBorder(maxBorder);
    }
}
