package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private ArrayList<String> contents;
    private String discType;
    private boolean isDataStored = false;
    private boolean isSpinning = false;

    public BaseDisc (String name, String discType, ArrayList<String> someContents) {
        this.name = name;
        this.discType = discType;
        this.contents = someContents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscType() {
        return discType;
    }

    public boolean getIsSpinning() {
        return isSpinning;
    }

    public void setSpinning(boolean isSpinning) {
        this.isSpinning = isSpinning;
    }

    public boolean getIsDataStored() {
        if (this.contents.size() > 0) {
            this.isDataStored = true;
        }
        return this.isDataStored;
    }

    public void addData(String data) {
        contents.add(data);
    }


}
