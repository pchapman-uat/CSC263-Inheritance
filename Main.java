public class Main {
    public static void main(String[] args){
        System.out.println("Hello World");

        // Create general Animal
        Animal animal = new Animal("Cat", 30);
        animal.printInfo();

        // Create Cephlapod
        Cephlapod cephlapod = new Cephlapod("Squid", null, 10);
        cephlapod.printInfo();
        cephlapod.swim(20);


        // Create Humbolt Squid
        Squid humbolt = new Squid("Humboldt", 40);
        humbolt.printInfo();
        humbolt.joinSchool();
        humbolt.swim(10);

        // Create Dumbo Octopus
        Octopus dumbo = new Octopus("Dumbo", 10);
        dumbo.printInfo();
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
    public String subSpecies;
    public Cephlapod(String species, String subSpecies, int age){
        super(species, age);
        this.subSpecies = subSpecies;
    }
    public void swim(float distance){
        System.out.println("I am swiming for "+distance+" meters");
    }
    @Override
    public void printInfo(){
        if(subSpecies != null){
            System.out.println("My Species is: "+this.subSpecies+" "+this.species);
            System.out.println("My Age is: "+this.age);
        } else {
            super.printInfo();
        }
    }
}
// TODO: Add methods for squid class
class Squid extends Cephlapod{
    public boolean withSchool = false;
    public Squid(String subSpecies, int age){
        super("Squid", subSpecies, age);
    }
    public void joinSchool(){
        if(!this.withSchool){
            this.withSchool = true;
            System.out.println(subSpecies+" "+species+" joined a school of other squids");
        } else {
            System.out.println("Is already in a school of squids");
        }
    }
    public void leaveSchool(){
        if(this.withSchool){
            this.withSchool = false;
            System.out.println(subSpecies+""+species+" left a school of other squids");
        } else {
            System.out.println("Is not in a school of squids");
        }
    }
    @Override
    public void printInfo(){
        super.printInfo();
        if(withSchool){
            System.out.println("I am in a school of other squids");
        } 
    }
    @Override
    public void swim(float distance){
        if(withSchool){
            System.out.println("I am swimming for "+distance+" meters and I am in a school of other squids");
        } else {
            super.swim(distance);
        }
    }
}
// TODO: Add methods for Octopus class
class Octopus extends Cephlapod{
    public Octopus(String subSpecies, int age){
        super("Octopus", subSpecies, age);
    }
}