package Chapter03;

public class ExpUseBox
{
    public static void main(String... args) {
        Animal animalToPack = new Animal("Cat");
        Box<Animal> box = new Box<Animal>(); 
        box.setContents(animalToPack);
    
        Animal myAnimal = box.getContents();
        System.out.println(myAnimal.getName());
    }
}
