package AlexLee.constructors;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Loky on 11/07/2020.
 */
public class Shop {

    private List<Shirt> shirtList;

    public Shop() {
        this.shirtList = new ArrayList<>(  );
    }

    public void addShirt(Shirt shirt) {
        this.shirtList.add( shirt );
    }

    public void removeShirt(Shirt shirt) {
        this.shirtList.remove( shirt );
    }

    public void tryShirt(Shirt shirt) {
        for(Shirt s : this.shirtList) {
            if (s.equals( shirt )) {
                s.putOn();
            }
        }
    }
}
