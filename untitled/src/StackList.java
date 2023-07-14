import java.util.Stack;

public class StackList {
    public static void main(String[] args) {
        Stack<String> animal = new Stack<>();
        animal.push("Lion");
        animal.push("Dog");
        animal.push("Horse");
        animal.push("Cat");
        animal.push("Elephant");
        animal.push("Cow");

        System.out.println(animal);
        System.out.println(animal.peek());
        animal.pop();
        System.out.println(animal.peek());
        System.out.println(animal);
    }
}
