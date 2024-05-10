package org.tensorflow.lite.examples.detection.recipee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import org.tensorflow.lite.examples.detection.R;

public class RecipeActivity extends AppCompatActivity {
    TextView recipe_name_text,recipe_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        recipe_name_text = findViewById(R.id.recipe_name_text);
        recipe_text = findViewById(R.id.recipe_text);
        String title = getIntent().getStringExtra("title");
        String recipe = getIntent().getStringExtra("recipe");
        recipe_name_text.setText(title);
        recipe_text.setText(recipe);
    }
}