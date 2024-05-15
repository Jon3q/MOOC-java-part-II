public class Organism implements Movable{
    private int posX;
    private int posY;

    public Organism(int x, int y){
        this.posY = y;
        this.posX = x;
    }

    public String toString(){
        return "x: " + posX + "; y: " + posY;
    }

    @Override
    public void move(int dx, int dy) {
        posX += dx;
        posY += dy;
    }
}
