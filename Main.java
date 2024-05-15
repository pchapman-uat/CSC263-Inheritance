public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        // Create general Animal
        Animal animal = new Animal("Cat", 30);
        animal.printInfo();

        // Create Cephlapod
        Cephlapod cephlapod = new Cephlapod("Squid", 10);
        cephlapod.printInfo();
        cephlapod.swim(20);

    }
}
class Animal {
    public int age;
    public String species;

    public Animal(String species, int age){
        this.age = age;
        this.species = species;
    }

    public void printInfo(){
        System.out.println("My Species is: "+this.species);
        System.out.println("My Age is: "+this.age);
    }
}

class Cephlapod extends Animal{
    public Cephlapod(String species, int age){
        super(species, age);
    }
    public void swim(float distance){
        System.out.println("I am swiming for "+distance+" meters");
    }
}