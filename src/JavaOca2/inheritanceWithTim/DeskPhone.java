package JavaOca2.inheritanceWithTim;

/**
 * Created by Loky on 13/07/2020.
 */
public class DeskPhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;

    public DeskPhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action taken, this phone has no power buttons");

    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now rining" + phoneNumber + "on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging) {
            System.out.println( "Answering this phone" );
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber){
            if(phoneNumber == myNumber){
                isRinging = true;
                System.out.println("Ring Ring");
            }else{
                isRinging = false;
            }
            return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
