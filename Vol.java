class Box {
    int length;
    int breadth;
    int height;

    int Volume(int length,int breadth, int height) {
        
              return length * breadth * height;
    }

}public class Vol{

    public static void main(String[] arg)
    {
        Box v1 = new Box();
        int result = v1.Volume(10,10,6);
        System.out.println("volume:" + result);
    }
}