public class Hello {
    public static void main(String[] args){
        System.out.println("Hello world!");
        //Any code surrounded with "" is a string literal

        byte num1 = 100;
        short num2 = 3040;
        int num3 = 4003;
        //Default value is always an int unless specified
        //In the case of num4, no errors encountered as long will always be able to hold ints
        long num4 = (50000L+ 10L*(num1+num2+num3));
        System.out.println(num4);

        short num5 = (short) (1000 + 10*(num1 + num2 +num3));
        System.out.println(num5);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value : " + myMinFloatValue);
        System.out.println("Float maximum value : " + myMaxFloatValue);

        double myMindoubleValue = Double.MIN_VALUE;
        double myMaxdoubleValue = Double.MAX_VALUE;
        System.out.println("double minimum value : " + myMindoubleValue);
        System.out.println("double maximum value : " + myMaxdoubleValue);

        int myIntValue = 5/3;
        float myFloatValue = 5f/3f;
        double myDoubleValue= 5d/3d;
        //Generally. double is the accepted default value like int
        //It is good practice to be explicit with the values
        System.out.println("\n");
        System.out.println("Int: " + myIntValue);
        System.out.println("Float: " + myFloatValue);
        System.out.println("Double: " + myDoubleValue);

        //Error appeared when literal value is default double
        //float myFloatValue2 = 5.25;
        float myFloatValue2 = (float) 5.25; //Casting required
        double myDoubleValue2= 5.25;

        double poundValue = 1d;
        double poundToKgConverter = poundValue*0.45359237d;
        System.out.println("1pound = "+ poundToKgConverter + "kg");

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyRightChar = '\u00A9';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        System.out.println(myCopyRightChar);

        //byte,short,int,long,float,double,char,boolean

        //Ternary operator (Reduce the amount of lines necessary)

        boolean isCar = false;
        if(isCar){
            System.out.println("This is good");
        }

        boolean wasCar = isCar ? true : false;
        // isCar = true, if it is set wasCar = true otherwise, false
        if(!wasCar){
            System.out.println("This was my Car!");
        }

        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double summationOfValues = 100.00* (firstValue + secondValue);
        System.out.println("Sum of both values: "  +summationOfValues);
        double remainder = summationOfValues%40.00d;
        System.out.println("Remainder: " + remainder);
        boolean isTrue = (remainder==0) ? true:false;
       System.out.println("isTrue: " + isTrue);
       if(!isTrue)
           System.out.println("Got some remainder");
}
}


