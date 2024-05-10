package org.tensorflow.lite.examples.detection.recipee.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.tensorflow.lite.examples.detection.R;
import org.tensorflow.lite.examples.detection.recipee.RecipeActivity;
import org.tensorflow.lite.examples.detection.sqlite.SQliteModel;

import java.util.List;

public class RecipeListAdapter extends BaseAdapter {
    Activity activity;
    List<SQliteModel> recipe_list;
    LayoutInflater inflater;
    public RecipeListAdapter(Activity activity, List<SQliteModel> stringList){
        this.activity = activity;
        this.recipe_list = stringList;
        inflater =  activity.getLayoutInflater();
    }
    @Override
    public int getCount() {
        return recipe_list.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View view1 = inflater.inflate(R.layout.adapter_layout,null);
        TextView recipe_name = view1.findViewById(R.id.recipe_name);
        recipe_name.setText(recipe_list.get(i).getRECIPE());
        recipe_name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str="";
                switch (recipe_list.get(i).getRECIPE()){
                    case "Aloo Gobi":
                        str = activity.getResources().getString(R.string.aloo_gobi);
                        break;
                    case "Bread Fritters":
                         str = activity.getResources().getString(R.string.Bread_Fritters);
                        break;
                    case "boneless chicken":
                         str = activity.getResources().getString(R.string.boneless_chicken);
                        break;
                    case "CHICKEN BIRYANI":
                         str = activity.getResources().getString(R.string.chicken_biryani);
                        break;
                    case "creamy cashew indian butter paneer":
                         str = activity.getResources().getString(R.string.creamy_cashew_indian_butter_paneer);
                        break;
                    case "Kadhi Pakora":
                         str = activity.getResources().getString(R.string.Kadhi_Pakora);
                        break;
                    case "Indian Cottage Cheese":
                         str = activity.getResources().getString(R.string.Indian_Cottage_Cheese);
                        break;
                    case "SWEET RICE":
                         str = activity.getResources().getString(R.string.sweet_rice);
                        break;
                    default:
                        break;
                }
                Intent intent = new Intent(activity, RecipeActivity.class);
                intent.putExtra("recipe",str);
                intent.putExtra("title",recipe_list.get(i).getRECIPE());
                activity.startActivity(intent);
            }
        });
        return view1;
    }
}
