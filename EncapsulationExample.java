public class EncapsulationExample 
{
    private String Name;
    private int age;
    public String getName() 
    {
        return Name;
    }

    public void setName(String name) 
    {
        Name = name;
    }

    public int getAge() 
    {
        return age;
    }

    public void setAge(int age) 
    {
        this.age = age;
    }


public static void main(String args[]) 
{
    EncapsulationExample obj = new EncapsulationExample();
    obj.setName("Meenakshi");;
    obj.setAge(22);
    System.out.println("Name:" + obj.getName() + " " + "Age:" + obj.getAge());
}
}