package com.example.insureme;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public DatabaseHelper(@Nullable Context context) {
        super(context, Database.DB_NAME, null, Database.DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Database.CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+Database.TABLE_NAME);
        onCreate(db);
    }

    public long insertInfo(String type,String mktval,String fuel,String brand,String total){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(Database.INSURANCE_TYPE,type);
        values.put(Database.MKTVAL,mktval);
        values.put(Database.FUEL,fuel);
        values.put(Database.BRAND,brand);
        values.put(Database.TOTAL,total);

        long id = db.insert(Database.TABLE_NAME,null,values);
        db.close();
        return id;
    }

    public void listInfo(TextView textView){
        Cursor cursor = this.getReadableDatabase().rawQuery("SELECT * FROM "+Database.TABLE_NAME,null);
        textView.setText("");
        while (cursor.moveToNext()){
            textView.append(cursor.getString(1)+" "+cursor.getString(2)+" "+cursor.getString(3)+" "+cursor.getString(4)+" "+cursor.getString(5));
        }
    }
}
