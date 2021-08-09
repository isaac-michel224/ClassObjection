public class Main {

    public static void main(String[] args) {
        Pet Zach = new Pet("Zach", 5, "Boston", "Reptile");

        System.out.println(Zach.getName());
        System.out.println(Zach.getAge());
        System.out.println(Zach.getLocation());
        System.out.println(Zach.getType());


        Sneakers Jordan = new Sneakers("Jordan",4,"Retro");
        System.out.println(Jordan.getSneakers());
        if(Jordan.isRetro()) System.out.println(Jordan.getBrand() + " is a classic shoe.");
        else System.out.println(Jordan.getBrand() + " is a re-release");

        //Brand Lebron = new Brand("Lebron",6);
        //System.out.println(Jordan.getBrand());

    }

}
