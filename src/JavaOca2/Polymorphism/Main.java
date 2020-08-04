package JavaOca2.Polymorphism;

class Jaws extends Movie {

    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats a lot of people";
    }
}

class IndependanceDay extends Movie{
    public IndependanceDay(){
        super("Independace Day");

    }
    @Override
    public String plot(){
        return "Aliens attempt to take over our planet";
    }
}
    class MazeRunner extends Movie{
    public MazeRunner(){
        super("Maze Runner");
    }

    @Override
        public String plot(){
        return "Kids try and escape a maze";
    }
}

    class StarWars extends Movie{
        public StarWars() {
        super("Star Wars");
    }

    @Override
        public String plot(){
        return "Imperial forces try to take over the Universe!";
    }
}

    class Forgettable extends Movie{

        public Forgettable(){
        super("Forgettable");


        /** For Movie nr 5:
         * We have for this method no return type, but still, when we run the code, we receive a message: No plot hier!
         This happens because JAVA is looking up and sees that see that we extended from Movie Class. And in the movie class Java finds
         the method public String plot(randul 16), with the return message: No plot hier. And because in our forgettable class,
         we have not overridden the method plot, Java calls this method.
         This happens because we inherit the class movie, along with all its instance methods.
         The Overridden methods appear when we actually modify the methods that we inherit.
         **/
    }
    }


public class Main {

    public static Movie randomMovie(){
        int randomNumber =(int) (Math.random() *5) + 1; // method random generate for us a number between 0 and 1. So, we are converting the number to an integer.
        // and we will multiply it by 5(in our case). By doing that, that is going to return a number in the range 0-4, the we will ad 1 ==> 5. This is how we
        // generate a random number. Because we have 5 Movies.

        System.out.println("Random number generator was: " + randomNumber);

        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependanceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgettable(); /**   **/
        }
        return null;
    }


}