package org.tensorflow.lite.examples.detection.sqlite;

public class SQliteModel {
    public int _ID ;
    public String  INGREDIENT;
    public String RECIPE ;

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public String getINGREDIENT() {
        return INGREDIENT;
    }

    public void setINGREDIENT(String INGREDIENT) {
        this.INGREDIENT = INGREDIENT;
    }

    public String getRECIPE() {
        return RECIPE;
    }

    public void setRECIPE(String RECIPE) {
        this.RECIPE = RECIPE;
    }
}
