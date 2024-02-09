package module_9;

public class MyListTest {

    public static void main(String[] args) {
//        MyArrayList<String> fruit = new MyArrayList<>();
//        fruit.add("Apple");
//        fruit.add("Orange");
//        System.out.println(fruit.get(0));
//        System.out.println("Size: " + fruit.size());
//        fruit.remove(0);
//        System.out.println(fruit.get(0));
//        System.out.println("Size: " + fruit.size());
//        fruit.clear();
//        System.out.println("Size: " + fruit.size());

//        MyLinkedList<String> fruit = new MyLinkedList<>();
//        fruit.add("Apple");
//        fruit.add("Orange");
//        System.out.println(fruit.get(0));
//        System.out.println("Size: " + fruit.size());
//        fruit.remove(0);
//        System.out.println(fruit.get(0));
//        System.out.println("Size: " + fruit.size());
//        fruit.clear();
//        System.out.println("Size: " + fruit.size());

//        MyQueue<String> fruit = new MyQueue<>();
//        fruit.add("Apple");
//        fruit.add("Orange");
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.peek());
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.poll());
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.peek());
//        System.out.println("Size: " + fruit.size());
//        fruit.clear();
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.peek());
//        System.out.println(fruit.poll());
//

//        MyStack<String> fruit = new MyStack<>();
//        fruit.push("Apple");
//        fruit.push("Orange");
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.peek());
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.pop());
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.peek());
//        System.out.println("Size: " + fruit.size());
//        fruit.remove(0);
//        System.out.println("Size: " + fruit.size());
//        fruit.clear();
//        System.out.println("Size: " + fruit.size());
//        System.out.println(fruit.peek());
//        try {
//            System.out.println(fruit.pop());
//        } catch (NoSuchElementException e){
//            e.printStackTrace();
//        }

        MyHashMap<String, String> person = new MyHashMap<>();
        person.put("Oleg", "335-87-87");
        person.put("Pavlo","375-57-17");
        person.put("Sasha", "571-54-51");
        System.out.println("Size: " + person.size());
        person.remove("Pavlo");
        System.out.println("Size: " + person.size());
        System.out.println(person.get("Sasha"));
        person.clear();
        System.out.println("Size: " + person.size());
    }
}
