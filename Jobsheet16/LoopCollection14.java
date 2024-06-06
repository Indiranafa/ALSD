package Jobsheet16;

import java.util.Iterator;
import java.util.Stack;

public class LoopCollection14 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.push("Orange");
        fruits.push("Watermelon");
        fruits.push("Leci");
        fruits.push("Salak");
        fruits.set(fruits.size() - 1, "Strawberry");
        fruits.push("Mango");
        fruits.push("guava");
        fruits.push("avocado");

        // Sorting
        fruits.sort(String::compareTo);

        for (String fruit : fruits){
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // fruits.push("Melon");
        // fruits.push("Durian");
        System.out.println("");
        for(Iterator<String> it = fruits.iterator(); it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e -> {
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++){
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
