public class PersonalProfile {

    public static void displayProfile(
            String pet,
            String name,
            String nickname,
            String birthday,
            String address,
            String favSong,
            String motivation,
            String support,
            String quote) {

        System.out.println("=================================================================");
        System.out.println("           NGAYON, KAYO NAMAN!");
        System.out.println("    Same board, same questions — now it's about you");
        System.out.println("=================================================================");

        // Pet Person
        if (pet.equalsIgnoreCase("Dog Person")) {
            System.out.println("🐶🐶🐶");
        } else {
            System.out.println("🐱🐱🐱");
        }

        System.out.println("Pet Person : " + pet);
        System.out.println();

        System.out.println("Q1. IDENTITY");
        System.out.println("Name       : " + name);
        System.out.println("Nickname   : " + nickname);
        System.out.println();

        System.out.println("Q2. HOME BASE");
        System.out.println("Birthday   : " + birthday);
        System.out.println("Address    : " + address);
        System.out.println();

        System.out.println("Q3. ON REPEAT");
        System.out.println("Favorite Song : " + favSong);
        System.out.println();

        System.out.println("Q4. MOTIVATION");
        System.out.println("Motivation : " + motivation);
        System.out.println();

        System.out.println("SUPPORT");
        System.out.println(support);
        System.out.println();

        System.out.println("-----------------------------------------------------------------");
        System.out.println("\"" + quote + "\"");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void main(String[] args) {

        // Hard-coded information
        String pet = "Cat Person";
        String name = "Pierce Ely G. Hibionada";
        String nickname = "Ely";
        String birthday = "September 17, 2007";
        String address = "Calaparan, Arevalo, Iloilo City";
        String favSong = "Biggest Part of Me by Ambrosia";
        String motivation = "To buy a car and live in luxury";
        String support = "Get through it with no drama";
        String quote = "Fear exists only within the mind that imagines it.";

        // Display Profile
        displayProfile(
                pet,
                name,
                nickname,
                birthday,
                address,
                favSong,
                motivation,
                support,
                quote
        );
    }
}