package Website;

public class Animal {
        void eat(){
            System.out.println("animal is eating...");
        }
    }

    class Dog extends Animal{
        void eat(){
            System.out.println("dog is eating...");
        }
    }

    class BabyDog1 extends Dog{
        public static void main(String args[]){
            Animal a = new BabyDog1();
            // even though actual object is "Animal", but babyDog's base class is "Dog"
            a.eat();  // Output: "dog is eating..."
        }
    }

