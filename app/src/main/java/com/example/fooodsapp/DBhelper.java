package com.example.fooodsapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class DBhelper extends SQLiteOpenHelper {




    public DBhelper(@Nullable Context context) {
        super(context,"Login.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("Create table  user(name text,phone text,usrname text primary key,psw text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists user");

    }
    public boolean insert(String name,String phone,String usrname,String psw){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("name",name);
        contentValues.put("phone",phone);
        contentValues.put("usrname",usrname);
        contentValues.put("psw",psw);

        long ins=db.insert("user", null,contentValues);
        if(ins==-1)return false;
        else return true;




    }

    public Boolean chckusr(String usrname){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor=db.rawQuery("Select * from user where usrname=?",new String[]{usrname});
        if (cursor.getCount()>0)return false;
        else return true;
    }
    public Boolean usrpsw(String usrname,String psw){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor=db.rawQuery("Select * from user where usrname=? and psw=?",new String[]{usrname,psw});
        if (cursor.getCount()>0)return true;
        else return false;
    }

}
