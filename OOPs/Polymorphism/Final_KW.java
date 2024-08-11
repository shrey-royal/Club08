class Intel {   //stop inheritance
    public String i5 = "Intel i5";  //stops value change

    // final void display() {   //stops method overriding
    //     System.out.println("Intel method");
    // }
}

class AMD extends Intel {    //we can't extends final class
    // @Override
    // void display() {
    //     System.out.println("Amd method");
    // }
}


public class Final_KW {
    public static void main(String[] args) {
        // Intel intel = new Intel();

        // System.out.println(intel.i5);
        // intel.i5 = "Intel i6";
        // System.out.println(intel.i5);
    }
}
/*
Final Keyword is used to restrict the user:
    > value change
    > method override
    > inheritance

Tasks:

final keyword:

Scenario 1: Math Constants
In a mathematical calculation library, define a class called "MathConstants" with final variables for commonly used mathematical constants like pi and e. These variables cannot be modified and hold their constant values throughout the program.

Scenario 2: Configuration Settings
In a configuration management system, define a class called "Configuration" with final variables for system settings like database URL, username, and password. These variables cannot be modified and represent fixed configuration values.

Scenario 3: Math Calculations
In a math calculation library, define a class called "MathUtils" with final methods for commonly used mathematical calculations like square root and logarithm. These methods cannot be overridden and provide consistent behavior throughout the program.



*/