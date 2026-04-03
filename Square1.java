class Square {
    public int square(int n) {
        return n * n;
    }
}

public class Square1 {
    public static void main(String[] args) {
        Square sq = new Square();
        int result = sq.square(4);
        System.out.println(result);
        
    }
}