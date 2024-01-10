package generyczna.zad29;

public class Test29 {

    public static void main(String[] args) {
        Tree[] tab = new Tree[4];
        tab[0]  = new Tree(45.3);
        tab[1]  = new Tree(3.4);
        tab[2]  = new Tree(22.3);
        tab[3]  = new Tree(12.5);
        Pair<Tree> result = new Pair<>();
        findMinMaxHeigth(tab, result);
        System.out.println(result.getFirst());
        System.out.println(result.getSecond());
        Pair<Plant> result2 = new Pair<>();
        findMinMaxHeigth(tab, result2);
        System.out.println(result2.getFirst());
        System.out.println(result2.getSecond());
    }

    public static void findMinMaxHeigth(Tree[] array, Pair<? super Tree> result){
        Tree min = array[0];
        Tree max = array[0];
        for(var elem: array){
            if (elem.compareTo(min) < 0){
                min = elem;
            }
            if (elem.compareTo(max) >0)
                max = elem;
        }
        result.setFirst(min);
        result.setSecond(max);
    }
}
