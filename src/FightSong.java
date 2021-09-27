public class FightSong {

    /*
    This method is static, which means you don't need to make a new instance of FightSong in order to use it.
    It is also void, which means it does not return any information. It should be marked private so that it can
    only be used in this class. Since I need to access it for testing purposes, it must be public.
     */
    public void goTeam() {
        System.out.println("Go, team, go!");
        System.out.println("You can do it.");
    }
    public void bestWest () {
        goTeam();
        System.out.println("You're the best,");
        System.out.println("In the West.");
        goTeam();
    }
    public void line () {
        System.out.println();
    }

        // Add any print statements you think should go in this method

    // Create any additional methods you need in this space in order to fulfill the requirements of the program

    public static void main(String[] args) {
        FightSong s = new FightSong();
        s.goTeam();
        s.line();
        s.bestWest();
        s.line();
        s.bestWest();
        s.line();
        s.goTeam();


        // No print statements should be in here, only method calls.

    }
}
