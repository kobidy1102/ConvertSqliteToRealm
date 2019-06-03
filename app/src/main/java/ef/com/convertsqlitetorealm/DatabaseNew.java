package ef.com.convertsqlitetorealm;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.util.Log;

import com.readystatesoftware.sqliteasset.SQLiteAssetHelper;

import java.util.ArrayList;

public class DatabaseNew extends SQLiteAssetHelper {
    Context context;
    public DatabaseNew(Context context, String dbName) {
        super(context, dbName, null, 1);
        this.context=context;
    }



    public ArrayList<vietanh> getEnByVi() {

        ArrayList<vietanh> arr = new ArrayList<vietanh>();

        SQLiteDatabase db=getReadableDatabase();
        SQLiteQueryBuilder qb= new SQLiteQueryBuilder();
        String[] sqlSelect={"id","word","wordSearch","mean","shortMean"};
        String tableName="Dictionary";
        qb.setTables(tableName);
        Cursor cursor= qb.query(db,sqlSelect,"id > ?", new String[] {"0"},null,null,null);
        Log.e("abcc","initxong");
        try {
            for (int i = 0; i < cursor.getCount(); i++) {
                cursor.moveToPosition(i);
                int id = cursor.getInt(cursor.getColumnIndex("id"));
                String word = cursor.getString(cursor.getColumnIndex("word"));
                String wordSearch = cursor.getString(cursor.getColumnIndex("wordSearch"));
                String mean = cursor.getString(cursor.getColumnIndex("mean"));
                String shortMean = cursor.getString(cursor.getColumnIndex("shortMean"));


                vietanh tu = new vietanh(id, word,wordSearch,mean,shortMean);
                arr.add(tu);

            }

        } catch (Exception e) {
            Log.e("errror",e.getMessage());

        }

        Log.e("amm","search xong "+arr.size());

        return arr;

    }



    private String filterTextForSearch(String en){
        String enNew=en;
        enNew=enNew.replace("!","");
        enNew=enNew.replace(".","");
        enNew=enNew.replace(",","");
        enNew=enNew.replace(";","");
        enNew=enNew.replace("\"","");
        enNew=enNew.replace("?","");
        enNew=enNew.replace(")","");
        enNew=enNew.replace("(","");
        enNew=enNew.replace("/","");
        enNew=enNew.replace("*","");
        enNew=enNew.replace("&","");
        enNew=enNew.replace("_","");
        enNew=enNew.replace("{","");
        enNew=enNew.replace("}","");

        return enNew;
    }



}