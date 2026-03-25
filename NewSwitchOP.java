public class NewSwitchOP 
{
    public static void main(String[] arg)
    {
        String Day = "Monday";
        String result;
        result=switch(Day)
        {
            case "Sunday","Saturday" -> "9am";
            case "Monday","Tuesday","wednesday","Thursday","friday" -> "6am";
            default -> "Invalid Day";
        };
        System.out.println(result);
    }
}