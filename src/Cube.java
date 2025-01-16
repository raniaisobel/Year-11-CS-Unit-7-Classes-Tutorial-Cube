public class Cube {
    private int side;

    public int getSide(){
        return side;
    }

    public void setSide(int side){
        if(side<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public Cube(){
        this.side = 1;
    }

    public Cube(int side){
        if(side<1){
            throw new IllegalArgumentException("A cube's side length cannot be less than 1!");
        }
        this.side = side;
    }

    public int calculateVolume(){
        return side*side*side;
    }

    public String toString(){
        return "Cube{side="+side+"}.";
    }
}
