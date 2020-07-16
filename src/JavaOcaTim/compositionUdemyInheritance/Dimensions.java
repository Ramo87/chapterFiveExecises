package JavaOcaTim.compositionUdemyInheritance;

/**
 * Created by Loky on 07/07/2020.
 */
public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public Dimensions(int width, int height, int depth){
        this.depth = depth;
        this.width = width;
        this.height = height;

    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public int getDepth(){
        return depth;
    }
}
