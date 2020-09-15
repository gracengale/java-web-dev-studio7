package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    public CD(String name, String discType, ArrayList<String> someContents) {
        super(name, discType, someContents);
    }

    @Override
    public String spinDisc() {
        this.setSpinning(true);
        return this.getDiscType() + " is spinning at a rate of 200 - 500 rpm.";
    }

    @Override
    public void stopSpin() {
        this.setSpinning(false);
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
