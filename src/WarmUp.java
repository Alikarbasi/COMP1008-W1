import java.util.Arrays;

public class WarmUp {
    public static void main(String[] args) {
        for(int i=100;i>=0 ;i-=5)
        {
            System.out.println(i);
        }
        for(int j=0;j<=100;j+=10)
        {
            if(j%20==0) {
                System.out.println(j + "Java");

            }
            else{
                System.out.println(j);
            }
        }
        System.out.printf("%5s   %5s%n","j","divisible for 20");
        for(int j=0;j<=100;j+=10)
        {
            System.out.printf("%5d",j);
            if(j%20==0){
                System.out.printf("%10s","yes");
            }
            System.out.println();
        }
//        the two line version
        for(int i=0;i<=100;i+=10)
            System.out.printf("%3d%s%n",i,(i%20==0)?" Java":" ");
//call Method 1
        System.out.println("the initials for Ali Karbasi are :"+getInitials("Ali","Karbasi"));
//        call Method 2
        System.out.println("the snow depth is 32,can I ski? " + timeToSki(32));
        System.out.println("the snow depth is 22,can I ski? " + timeToSki(22));

    }
    /**
     * Method 1
     *This method will use the user initials
     * public static(it means this method can be called from any other class)
     * public static String(it means that this method will return a string)
     * getInitials(), this is the name of the method
     * (String first, String last) these are the "arguments" this is how we pass information into a method
     */
    public static String getInitials(String first,String last)
    {
        return String.format("%s.%s.",first.charAt(0),last.charAt(0));
        //.charAt(0) means get character number 0 of the variable called first. characters begin from 0.
        //.CharAt(1) means get character number 1 of the variable called first which is l in this example because second character of Ali is l
    }

    /**
     * Method 2
     *timeToSki() returns true if the snow depth is greater than 30, returns false otherwise
     */
    public static Boolean timeToSki(int snowDepth)
    {
            return snowDepth>30;
    }

}
