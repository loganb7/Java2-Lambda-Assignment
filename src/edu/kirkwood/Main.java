package edu.kirkwood;

public class Main {

    public static void main(String[] args) {
        Widget[] widgets = new Widget[20];

        // STEP 3: Create a Predicate called "zeroOrGreater" to test if a Widget's value is greater than or equal to 0.
        // This will take a single Widget as input, use the .getValue() method, and return a boolean.
        // This code should be written on a single line.


        // STEP 5: Create a UnaryOperator called "nameToLower" to convert the Widget name to all lowercase letters.
        // This will take a single Widget as input, use both the .getName() and .setName() methods, and return the updated Widget.


        // STEP 8: Create a Consumer called "print" to print each Widget as a string on a new line using the .toString() method.
        // This code should be written on a single line.


        for(int i = 0; i < 20; i++) {
            // STEP 1: Create a Supplier object called "widgetCreator" using a method reference.

            // STEP 2: Using the "widgetCreator", instantiate a new Widget object called "widget".

            // STEP 4: Write an if statement that uses the Predicate's abstract method as the condition.

                // STEP 6: If true, use the UnaryOperator's abstract method to change the widget's name to lowercase.

            // STEP 7: add the widget to the array

        } // End the loop here

        for(Widget widget: widgets) {
            // STEP 9: Use the Consumer's abstract method to print each widget.

        }
    }
}
