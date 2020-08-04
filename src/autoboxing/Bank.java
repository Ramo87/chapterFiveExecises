package autoboxing;

import java.util.ArrayList;

/**
 * Created by Loky on 24/07/2020.
 */
public class Bank {

    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>(  );
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void setBranches(ArrayList<Branch> branches) {
        this.branches = branches;
    }
}
