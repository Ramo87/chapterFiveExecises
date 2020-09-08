package chapter6.commonExceptionTypes.runtimeExceptions;

/**
 *
 */
public class IllegalArgumentsException {

    private int numberEggs;


    public void setNumberEgg2(int numberEggs){
      if(numberEggs>=0) {
        this.numberEggs = numberEggs;
         }          /** is a problem with this code, because we can not have numberEggs = -1 or -2, etc.
                                    this is why, hier we can throw an exception */
    }



    public void setNumberEgg(int numberEggs) {
        if (numberEggs < 0) {
            throw new IllegalArgumentException( " numberEggs can not be < 0");

        }
        this.numberEggs = numberEggs;
    }

    public static final void main(String[] args) {
        IllegalArgumentsException iae = new IllegalArgumentsException();
        iae.setNumberEgg( -3 );
    }
}

