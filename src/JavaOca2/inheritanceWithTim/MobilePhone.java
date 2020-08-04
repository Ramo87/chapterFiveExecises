package JavaOca2.inheritanceWithTim;

/**
 * Created by Loky on 13/07/2020.
 */
public class MobilePhone implements ITelephone {

    private int myNumber;
    private boolean isRinging;
    private boolean isOn = true;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("Mobile phone power up!");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
        System.out.println("Now rining" + phoneNumber + "on deskphone");
    }else{
            System.out.println("Phone is switched off!");
        }
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
            System.out.println("Melody play Ring");
        }else{
            isRinging = false;
            System.out.println("Mobile phone not on or nr different!");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }




}
