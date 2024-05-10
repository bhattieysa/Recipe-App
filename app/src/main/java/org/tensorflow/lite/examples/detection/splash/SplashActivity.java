package org.tensorflow.lite.examples.detection.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.FirebaseApp;

import org.tensorflow.lite.examples.detection.DetectorActivity;
import org.tensorflow.lite.examples.detection.R;
import org.tensorflow.lite.examples.detection.helper.SessionManager;
import org.tensorflow.lite.examples.detection.loginsignup.LoginActivity;
import org.tensorflow.lite.examples.detection.sqlite.DBHelper;
import org.tensorflow.lite.examples.detection.sqlite.SQliteModel;

import java.util.ArrayList;


public class SplashActivity extends AppCompatActivity {
    SessionManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FirebaseApp.initializeApp(this);
        setContentView(R.layout.activity_splash);
        manager  = new SessionManager(getApplicationContext());
        if (!manager.isSave()){
            throwdata_to_Database();
        }
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (manager.isLogIn()){
                    startActivity(new Intent(getApplicationContext(), DetectorActivity.class));
                }else {
                    startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                }
                finish();
            }
        },3000);
    }
    public void throwdata_to_Database(){
        ArrayList<SQliteModel> sQliteModels = new ArrayList<>();

        SQliteModel model = new SQliteModel();
        model.setINGREDIENT("Cayenne pepper");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cloves");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander powder");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Garam masala");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Minced ginger");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Olive oil");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Red chilli");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Russet potato");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Salt");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Turmeric dried");
        model.setRECIPE("Aloo Gobi");
        sQliteModels.add(model);
////////////////////////////////////////////////////////////////////////////
        model = new SQliteModel();
        model.setINGREDIENT("Ajwain");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Baking powder");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("breads");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander_ cilantro");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Gram_ Flour");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Green chilli");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Lime juice");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Olive oil");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Salt");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Turmeric dried");
        model.setRECIPE("Bread Fritters");
        sQliteModels.add(model);
///////////////////////////////////////////////////////////////////////////////////
        model = new SQliteModel();
        model.setINGREDIENT("boneless chicken");
        model.setRECIPE("butter chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Butter");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("cardamom");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cinemon stick");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cloves");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander powder");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander_ cilantro");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cumin (zeera)");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Finely chopped onions");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Ginger garlic paste");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Lemon");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Olive oil");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Pepper corns");
        model.setRECIPE("Red chilli");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Salt");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Tomato");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Turmeric dried");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Yogurt");
        model.setRECIPE("boneless chicken");
        sQliteModels.add(model);
//////////////////////////////////////////////////////////////////////////////////
        model = new SQliteModel();
        model.setINGREDIENT("Basmati rice");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Butter");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cashew");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("chicken strips");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander_ cilantro");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Curry powder");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Garlic cloves");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Ginger powder");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Medium chopped onions");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Olive oil");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Plain flour");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Red chilli");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Salt");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Sliced carrots");
        model.setRECIPE("CHICKEN BIRYANI");
        sQliteModels.add(model);
///////////////////////////////////////////////////////////////////////////////////////////////

        model = new SQliteModel();
        model.setINGREDIENT("Broccoli florets");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Butter");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cashew");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cayenne pepper");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("cheese cubed");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander_ cilantro");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Curry powder");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Finely chopped onions");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Garam masala");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Garlic cloves");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Minced ginger");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Regular milk");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("safron");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Salt");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Tomato paste");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Turmeric dried");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Yogurt");
        model.setRECIPE("creamy cashew indian butter paneer");
        sQliteModels.add(model);
/////////////////////////////////////////////////////////////////////////////////////////
        model = new SQliteModel();
        model.setINGREDIENT("Butter");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander powder");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cumin (zeera)");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Finely chopped onions");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Garam masala");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Garlic cloves");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Ginger garlic paste");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Green chilli");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Red chilli");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Tomato");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Turmeric dried");
        model.setRECIPE("Indian Cottage Cheese");
        sQliteModels.add(model);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        model = new SQliteModel();
        model.setINGREDIENT("Cinemon stick");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cloves");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Corriander powder");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cumin (zeera)");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Finely chopped onions");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Garam masala");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Ginger garlic paste");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Gram_ Flour");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Olive oil");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Pepper corns");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Red chilli");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Salt");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Turmeric dried");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Yogurt");
        model.setRECIPE("Kadhi Pakora");
        sQliteModels.add(model);
////////////////////////////////////////////////////////////////////////////////////
        model = new SQliteModel();
        model.setINGREDIENT("Basmati rice");
        model.setRECIPE("SWEET RICE");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("cardamom");
        model.setRECIPE("SWEET RICE");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Cashew");
        model.setRECIPE("SWEET RICE");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Regular milk");
        model.setRECIPE("SWEET RICE");
        sQliteModels.add(model);

        model = new SQliteModel();
        model.setINGREDIENT("Sugar");
        model.setRECIPE("SWEET RICE");
        sQliteModels.add(model);
////////////////////////////////////////////////////////////////////////////
        DBHelper dbHelper = new DBHelper(getApplicationContext());
        for (int i=0;i<sQliteModels.size();i++){
            dbHelper.save_Recipe(sQliteModels.get(i));
        }
        manager.setSave(true);
        //Toast.makeText(this, "Done", Toast.LENGTH_SHORT).show();
    }
}