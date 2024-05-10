package org.tensorflow.lite.examples.detection.helper;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {
    public static String SHARED_PREF="my_preference";
    public static String PREF_LOGIN="PREF_LOGIN";
    public static String PREF_SAVE="PREF_SAVE";
    public static String PREF_LAT="PREF_LAT";
    public static String PREF_LONG="PREF_LONG";


    SharedPreferences.Editor editor;
    SharedPreferences preference;
    public SessionManager(Context context){
        preference = context.getSharedPreferences(SHARED_PREF, Context.MODE_PRIVATE);
        editor = preference.edit();
    }
    public boolean isLogIn(){
        return preference.getBoolean(PREF_LOGIN,false);
    }
    public void setLogIn(boolean flag){
        editor.putBoolean(PREF_LOGIN,flag);
        editor.commit();
    }

    public String get_ingredients(){
        return preference.getString(PREF_LAT,"");
    }
    public void set_ingredients(String ingredients){
        editor.putString(PREF_LAT,  ingredients);
        editor.commit();
    }

    public double getLong(){
        return preference.getLong(PREF_LONG,0);
    }
    public void setLong(double flag){
        editor.putLong(PREF_LONG,(long)flag);
        editor.commit();
    }
    public boolean isSave(){
        return preference.getBoolean(PREF_SAVE,false);
    }
    public void setSave(boolean flag){
        editor.putBoolean(PREF_SAVE,flag);
        editor.commit();
    }

}
