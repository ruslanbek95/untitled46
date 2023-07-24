public class Main {
    public static void main(String[] args) {
        Cow cow = new Cow("100", 12, "female", "alamal");
        Cow cow1 = new Cow("100", 12, "female", "alamal");
        Cow cow2 = new Cow("100", 12, "female", "alamal");
        Cow cow3 = new Cow("100", 12, "female", "alamal");
        Cow cow4 = new Cow("100", 12, "female", "alamal");
        Cow cows[] = {cow, cow1, cow2, cow3, cow4};
        Cow cow5[]= {cow};

        Sheep sheep1 = new Sheep("100", 5, "male", "Taigan");
        Sheep sheep2 = new Sheep("100", 5, "male", "Taigan");
        Sheep sheep3 = new Sheep("100", 5, "male", "Taigan");
        Sheep [] sheeps= {sheep1, sheep2, sheep3};
        Sheep [] sheep5={sheep1};


        Horse horse = new Horse("100", 4, "male", "Tigr");
        Horse horse1 = new Horse("100", 4, "male", "Tigr");
        Horse horses[] = {horse, horse1};
        Horse horse5[]= {horse};

        Farm farm = new Farm("Nookat", cows, horses,sheeps,"Osh");
        Farm farm1 = new Farm( "Osh", cow5,horse5,sheep5,"Btken");

        System.out.println(farm);
        System.out.println("________________"
        );
        System.out.println(farm1);
    }
}