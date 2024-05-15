public class TripleTacoBox implements TacoBox{

    private int tacos;
    public TripleTacoBox() {
        this.tacos = 3;
    }
    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        if (tacos>=1) {
            this.tacos--;
        }
    }
}
