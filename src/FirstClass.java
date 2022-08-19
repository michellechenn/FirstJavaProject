public class FirstClass {
    public static void main(String[] args)
    {
        System.out.println("Hello, world!");
        System.out.println("How are you today?\nI hope you're nifty.");

        // making new variable called numDwarves that can hold integers
        // numDwarves becomes 7.

            int numDwarves; //instantiation
            numDwarves = 7; //initialization

            int numStooges = 3; //instantiation and initialization both

            System.out.println("There are "+numDwarves+" dwarves in my cottage.");
            System.out.println("At first, there were "+numStooges+" stooges.");

            numStooges = numStooges + 1;
                //numStooges += 1;
                //numStooges++;
            System.out.println("Now, with Shemp, there are "+numStooges+" stooges.");

            int a = 0;
            while (a<10)
            {
                System.out.print(a + " --> ");
                a = a + 2;
                System.out.println(a);
            }

    }
}
