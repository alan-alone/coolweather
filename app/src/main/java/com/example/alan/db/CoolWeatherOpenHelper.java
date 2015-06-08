package com.example.alan.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by alan on 2015/6/7.
 */
public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    private static final String CREATR_PROVINCE = "creat table Province(id integer primary key autoincrement,province_name text,province_code text)";
    private static final String CREATE_CITY = "creat table City(id integer primary key autoincrement,city_name text,city_code text,province_code text)";
    private static final String CREATE_COUNTY = "creat table County(id integer primary key autoinvrement,county_name text,county_code text,city_id integer)";

    public CoolWeatherOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATR_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
