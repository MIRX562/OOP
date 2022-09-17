public class Dog {
    public String name;
    public String breed;
    public int age;

    public void writeOutput(){
        System.out.println("\nName\t: "+ name);
        System.out.println("Breed\t: "+ breed);
        System.out.println("Age in calendar years\t: "+ age);
        System.out.println("Age in human years\t: "+ getAgeInHumanYears());
        System.out.println();
    }
    
    public int getAgeInHumanYears(){
        int humanAge = 0;
        if (age<=2){
            humanAge=11;
        }else{
            humanAge=22+((age-2)*5);
        }
        return humanAge;
    }

}
