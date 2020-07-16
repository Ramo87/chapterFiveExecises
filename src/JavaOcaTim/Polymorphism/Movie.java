package JavaOcaTim.Polymorphism;

/**
 * Created by Loky on 14/07/2020.
 */
public class Movie {


        public String getName() {
            return name;
        }

        private String name;

        public Movie(String name) {

            this.name = name;
        }

        public String plot(){                  //plot = intrigue, plan, scheme;
            return "No plot here!";
        }
  }

