public class Main {
    public static void main(String[] args){
        // General Animal
        Animal animal = new Animal("Cat", 30);
        animal.printInfo();

        // Create Cephlapod
        Cephlapod cephlapod = new Cephlapod("Squid", 10);
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
        dumbo.loseLimb();
    }
}
class Animal {
    // Class variables
    public int age;
    public String species;

    // Constructor
    public Animal(String species, int age){
        this.age = age;
        this.species = species;
    }

    // Print information about the animal 
    public void printInfo(){
        System.out.println("My Species is: "+this.species);
        System.out.println("My Age is: "+this.age);
    }
}

// Cephlapod class extends the base animal class
class Cephlapod extends Animal{
    // Class variables
    public String subSpecies;
    // Constructor
    public Cephlapod(String species, String subSpecies, int age){
        // Call the constructor of the base class
        super(species, age);
        // Set the additonal class variables
        this.subSpecies = subSpecies;
    }
    // Secondary constructor for without sub species
    public Cephlapod(String species, int age){
        super(species, age);
    }
    // Swim method
    public void swim(float distance){
        System.out.println("I am swiming for "+distance+" meters");
    }
    // This overrides the printInfo method from the base class
    @Override
    public void printInfo(){
        // If there is a sub species, print it, otherwise print the base class info
        if(subSpecies != null){
            System.out.println("My Species is: "+this.subSpecies+" "+this.species);
            System.out.println("My Age is: "+this.age);
        } else {
            super.printInfo();
        }
    }
}

// Squid class extends the Cephlapod class
class Squid extends Cephlapod{
    // Class variables
    public boolean withSchool = false;
    // Constructor
    public Squid(String subSpecies, int age){
        super("Squid", subSpecies, age);
    }
    // Join school method
    public void joinSchool(){
        // Check if the squid is already in a school of squids, if not, join the school
        if(!this.withSchool){
            this.withSchool = true;
            System.out.println(subSpecies+" "+species+" joined a school of other squids");
        } else {
            System.out.println("Is already in a school of squids");
        }
    }
    // Leave school method
    public void leaveSchool(){
        // Check if the squid is already in a school of squids, if not, leave the school
        if(this.withSchool){
            this.withSchool = false;
            System.out.println(subSpecies+""+species+" left a school of other squids");
        } else {
            System.out.println("Is not in a school of squids");
        }
    }
    // This overrides the printInfo method from the base class
    @Override
    public void printInfo(){
        // Print the base class info
        super.printInfo();
        // If the squid is in a school of squids, print that they are
        if(withSchool){
            System.out.println("I am in a school of other squids");
        } 
    }
    // This overrides the swim method from the cephlapod class
    @Override
    public void swim(float distance){
        // If the squid is in a school of squids, print that they are swimming and they are in a school of squids
        // Otherwise call the parent class swim method
        if(withSchool){
            System.out.println("I am swimming for "+distance+" meters and I am in a school of other squids");
        } else {
            super.swim(distance);
        }
    }
}

// Octopus class extends the Cephlapod class
class Octopus extends Cephlapod{
    // Constructor
    public Octopus(String subSpecies, int age){
        super("Octopus", subSpecies, age);
    }
    // Lose limb method
    public void loseLimb(){
        System.out.println("I lost a limb");
    }
}