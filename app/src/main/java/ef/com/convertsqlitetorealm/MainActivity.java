package ef.com.convertsqlitetorealm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DatabaseNew databaseNew= new DatabaseNew(this, "vietanh.db");
        ArrayList<vietanh> arr= databaseNew.getEnByVi();


        Realm.init(this);
        Realm realm = Realm.getDefaultInstance();
        realm.beginTransaction();
        realm.insertOrUpdate(arr);
        realm.commitTransaction();

    }
}
