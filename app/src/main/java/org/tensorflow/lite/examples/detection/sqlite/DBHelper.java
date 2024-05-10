package org.tensorflow.lite.examples.detection.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {


    public static final String TABLE_NAME = "recipe";


    public static final String _ID = "_id";
    public static final String INGREDIENT = "ingredient";
    public static final String RECIPE = "recipe";


    static final String DB_NAME = "MY_RECIPE.DB";


    static final int DB_VERSION = 1;


    private static final String CREATE_TABLE = "create table " + TABLE_NAME + "(" + _ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT, " + INGREDIENT + " TEXT NOT NULL, " + RECIPE + " TEXT);";

    public DBHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
    public void save_Recipe(SQliteModel  model){
        SQLiteDatabase database = getWritableDatabase();
        ContentValues contentValue = new ContentValues();
        contentValue.put(RECIPE, model.getRECIPE());
        contentValue.put(INGREDIENT, model.getINGREDIENT());
        long id =  database.insert(TABLE_NAME, null, contentValue);
        Log.d("SQLITE_DB_ID",id+"");
    }
    public List<SQliteModel> read(List<String> lis) {

        List<SQliteModel> recordsList = new ArrayList<SQliteModel>();

        String ingredient = "";
        for (int i=0;i<lis.size();i++){
            ingredient=ingredient+" '"+lis.get(i)+"' OR ";
        }
        ingredient = ingredient.substring(0,ingredient.length()-3);
        String sql = "SELECT * FROM "+TABLE_NAME+" WHERE "+INGREDIENT +"= "+ingredient.trim()+"";
        Log.d("MY_INGTREDIENT",sql);
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(sql, null);

        if (cursor.moveToFirst()) {
            do {

                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(_ID)));
                String res_ingredient = cursor.getString(cursor.getColumnIndex(INGREDIENT));
                String recipee = cursor.getString(cursor.getColumnIndex(RECIPE));

                SQliteModel objectStudent = new SQliteModel();
                objectStudent.set_ID(id);
                objectStudent.setINGREDIENT(res_ingredient);
                objectStudent.setRECIPE(recipee);
                recordsList.add(objectStudent);

            } while (cursor.moveToNext());
        }

        cursor.close();
        db.close();

        return recordsList;//get_Recipee(recordsList);
    }

//    public List<SQliteModel> get_Recipee(List<SQliteModel> lis){
//        List<SQliteModel> recordsList = new ArrayList<SQliteModel>();
//        String ingredient = "";
//        for (int i=0;i<lis.size();i++){
//            ingredient=ingredient+" '"+lis.get(i).getRECIPE()+"' AND ";
//        }
//        ingredient = ingredient.substring(0,ingredient.length()-4);
//        String sql = "SELECT * FROM "+TABLE_NAME+" WHERE "+RECIPE +"= "+ingredient.trim()+"";
//        Log.d("MY_INGTREDIENT",sql);
//        SQLiteDatabase db = this.getWritableDatabase();
//        Cursor cursor = db.rawQuery(sql, null);
//
//        if (cursor.moveToFirst()) {
//            do {
//
//                int id = Integer.parseInt(cursor.getString(cursor.getColumnIndex(_ID)));
//                String res_ingredient = cursor.getString(cursor.getColumnIndex(INGREDIENT));
//                String recipee = cursor.getString(cursor.getColumnIndex(RECIPE));
//
//                SQliteModel objectStudent = new SQliteModel();
//                objectStudent.set_ID(id);
//                objectStudent.setINGREDIENT(res_ingredient);
//                objectStudent.setRECIPE(recipee);
//                recordsList.add(objectStudent);
//
//            } while (cursor.moveToNext());
//        }
//
//        cursor.close();
//        db.close();
//
//        return recordsList;
//    }
}
