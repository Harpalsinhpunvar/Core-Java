package har.com;

class Animal{
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class dog extends Animal{
    public void animalSound(){
        System.out.println("Woo Woo Woo");
    }
}

class cat extends Animal{
    public void animalSound(){
        System.out.println("Meow Meow Meow");
    }
}

class lion extends  Animal{
    public void animalSound(){
        System.out.println("OOOOOOOO   OOOOOOO");
    }
}

public class Polymorphism{
    public static void main (String [] args){

        Animal animal = new Animal();
        animal.animalSound();
        Animal d = new dog();
        d.animalSound();
        Animal c = new cat();
        c.animalSound();
        Animal l = new lion();
        l.animalSound();
        
    }
}