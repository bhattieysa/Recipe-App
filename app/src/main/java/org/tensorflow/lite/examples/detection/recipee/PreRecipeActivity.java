package org.tensorflow.lite.examples.detection.recipee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.tensorflow.lite.examples.detection.DetectorActivity;
import org.tensorflow.lite.examples.detection.R;
import org.tensorflow.lite.examples.detection.recipee.adapter.RecipeListAdapter;
import org.tensorflow.lite.examples.detection.sqlite.DBHelper;
import org.tensorflow.lite.examples.detection.sqlite.SQliteModel;

import java.util.ArrayList;
import java.util.List;

public class PreRecipeActivity extends AppCompatActivity {
    public static List<String> list;
    public  List<SQliteModel> recipe_list;
    ListView listview;
    RecipeListAdapter listAdapter;
    TextView no_recipe_text;
    DBHelper dbHelper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre_recipe);
        dbHelper = new DBHelper(this);
        recipe_list = new ArrayList<>();
        recipe_list  = dbHelper.read(list);
        no_recipe_text = findViewById(R.id.no_recipe_text);
        listview = findViewById(R.id.listview);
        listAdapter  = new RecipeListAdapter(this,recipe_list);
        listview.setAdapter(listAdapter);
        if (recipe_list.size()==0){
            no_recipe_text.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        DetectorActivity.ingredient_list  = new ArrayList<>();
        startActivity(new Intent(getApplicationContext(), DetectorActivity.class));
    }

}