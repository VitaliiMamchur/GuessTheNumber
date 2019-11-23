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
        if (minBorder > maxBorder) {
            return false;
        }
        else if ((maxBorder - minBorder) >= 2){
            setMinBorder(minBorder);
            setMaxBorder(maxBorder);
            return true;
        }
        return false;
    }
}
