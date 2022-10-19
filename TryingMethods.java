public class TryingMethods {
    
    public static void main(String[] args){
        System.out.println("Exam excellence");
        TryingMethods Result = new TryingMethods();
        Result.DaysOfTheWeek(6);
        Result.Temperature(23);

        System.out.println("Sum of even numbers between 12 and 103: "+SumOfEvenNumbers());
        System.out.println("Sum of numbers less than 1000 :"+thousandSum());
    }
    public String DaysOfTheWeek(int dayNum) {
        String day= "";
        switch (dayNum) {
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
                day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                day="Its a glorious day";
                break;
        }
        System.out.println(day);
        return day;
    }
    public void Temperature (int celsius){
        if (celsius >= 30 ) {
            System.out.println("The weather is hot");
        }
        else if(celsius <= 15){
            System.out.println("The weather is cold");
        }
        else{
            System.out.println("it is a fair weather");
        }

    }

    public static int SumOfEvenNumbers() {
        int sum = 0;
        for (int i = 12; i <= 103; i++) {
            if(i % 2 ==0){
                sum +=i;
                System.out.println(sum);
            }
        }
        System.out.println(sum);
        return sum;
    }
    public static int thousandSum () {
        int sum = 0;
        int counter = 0;
        while (counter < 1001) {
        sum +=counter;
        counter +=1;
        }
        return sum;
    }
    
} 