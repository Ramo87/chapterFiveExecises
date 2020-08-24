package chapter4.reviewQuestions.Ex22NuInteleg;

/**
 * On line 16 of OrderDriver, we refer to Order for the first time. At this point the statics
 in Order get initialized. In this case, the statics are the static declaration of result
 and the static initializer. result is u at this point. On line 17, result is the same
 because the static initialization is only run once. On line 18, we create a new Order,
 which triggers the instance initializers in the order they appear in the file. Now result
 is ucr. Line 19 creates another Order, triggering another set of initializers. Now result
 is ucrcr. Notice how the static is on a different line than the initialization code in
 lines 4–5 of Order. The exam may try to trick you by formatting the code like this to
 confuse you.
 */

public class OrderDriver {
    public static void main(String[] args) {
        System.out.println(Order.result + " ");
        System.out.println(Order.result + " ");
        new Order();
        new Order();
        System.out.println(Order.result + " ");
    }
}