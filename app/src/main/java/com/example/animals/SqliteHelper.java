package com.example.animals;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SqliteHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "groupp6.db";
    public static final int VERSION = 1;



    public SqliteHelper(@Nullable Context context) {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query =
                "CREATE TABLE animals (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "name TEXT," +
                        "age INTEGER," +
                        "url TEXT," +
                        "Species_id INTEGER," +
                        "FOREIGN KEY (Species_id) REFERENCES Species(id)" +
                        ")";

        String query2 =
                "CREATE TABLE Species (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "name TEXT" +
                        ")";

        db.execSQL(query);
        db.execSQL(query2);
    }



    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
