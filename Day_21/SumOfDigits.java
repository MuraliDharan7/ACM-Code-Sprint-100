import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(String str){
        int sum = 0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if(Character.isDigit(ch)){
                sum += Character.getNumericValue(ch);
            }
        }
        return sum;
    }

    public static int sumOfDigits2(String str){  //used to find Sum of Multi-Digit Numbers in a String
        String temp ="";
        int sum =0;

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(Character.isDigit(ch)){
                temp += ch;
            }
            else{
                if(!temp.isEmpty()){
                    sum += Integer.parseInt(temp);
                    temp = "";
                }
            }
        }
        if(!temp.isEmpty()){
            sum += Integer.parseInt(temp);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String str = sc.nextLine();

        int answer = sumOfDigits(str);
        System.out.println(answer);

        sc.close();
    }
}
