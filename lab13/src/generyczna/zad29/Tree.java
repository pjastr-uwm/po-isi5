package generyczna.zad29;

public class Tree extends Plant implements Comparable<Tree>{

    private double height;

    public Tree(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "height=" + height +
                '}';
    }

    @Override
    public int compareTo(Tree o) {
        return Double.compare(this.height, o.height);
    }
}
