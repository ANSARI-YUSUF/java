//8) Write an application that counts the total number of characters in all of its command-line
//arguments.


 class comandline{

    public static void main(String[] args) {

        // String name=String.parseString(args[0]);
        int totalCharacters = 0;

        // System.out.println(args);

        // Iterate through each command-line argument
        for (String arg : args) {
            totalCharacters += arg.length(); // Add the length of each argument to the total
        }

        System.out.println("Total number of characters in command-line arguments: " + totalCharacters);
    }
}
