public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");
        Animal animal = new Animal("Squid", 30);
        animal.printInfo();
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