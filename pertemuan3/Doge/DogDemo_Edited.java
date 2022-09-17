public class DogDemo_Edited {
    public static void main(String[] args) {
        Dog_Edited balto = new Dog_Edited();
        balto.setName("Balto");
        balto.age=8;
        balto.breed="Siberian Husky";
        balto.writeOutput();

        Dog_Edited scooby = new Dog_Edited();
        scooby.setName("Scooby");
        scooby.age=42;
        scooby.breed="Great Dane";
        scooby.writeOutput();

        System.out.println(scooby.getName()+" is a "+scooby.breed+".");
        System.out.print("He is "+scooby.age+"years old, or ");
        int humanYears=scooby.getAgeInHumanYears();
        System.out.println(humanYears+" in human years");
        System.out.println();

    }
}
