package info.devexchanges.simpledatabinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import info.devexchanges.simpledatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private Cat cat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActivityMainBinding mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        cat = new Cat("Tom", 2);
        mainBinding.setCat(cat);

        OnClickHandler handlers = new OnClickHandler();
        mainBinding.setHandlers(handlers);
    }

    public class OnClickHandler {
        public void onUpdateCat(View view) {
            cat.setName("Tom Tom");
            cat.setOwner("Hong Thai");
        }
    }
}
