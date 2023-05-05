package chapterThree;

public class Circle {
    private int shape;
    private int size;

    public Circle(int shape, int size){
        this.shape = shape;
        this.size = size;
    }
    public void setShape(int shape){
        this.shape = shape;
    }
    public int getShape(){
        return shape;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        Circle roundCircle = new Circle(6, 5);
        System.out.println("The shape of the round circle is "+ roundCircle.getShape());
        roundCircle.setShape(8);

      Circle BigSizeCircle = new Circle(6, 5);
      System.out.println("The size of a round circle is "+ BigSizeCircle.getSize());
      BigSizeCircle.setSize(9);


    }

}


