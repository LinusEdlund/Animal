package com.example.animals;

import static com.example.animals.Degg.deggList;
import static com.example.animals.Egg.eggList;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class SqliteHelper extends SQLiteOpenHelper {
    public static final String DB_NAME = "groupp6.db";
    public static final int VERSION = 1;
    public static final String TABLE_NAME = "animals";



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
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS animals");
        db.execSQL("DROP TABLE IF EXISTS Species");
        onCreate(db);
    }




}
