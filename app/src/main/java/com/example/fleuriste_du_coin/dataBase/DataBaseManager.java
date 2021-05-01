package com.example.fleuriste_du_coin.dataBase;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.example.fleuriste_du_coin.object.Boutique;

import java.util.ArrayList;
import java.util.List;


public class DataBaseManager extends SQLiteOpenHelper {


    private static final String DATABASE_NAME = "Mabdd_boutique.db";
    private static final int DATABASE_VERSION = 1;

    public DataBaseManager( Context context){
        super(context,DATABASE_NAME, null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String strSql = "create table T_Boutique ("
                + "    idBoutique integer primary key autoincrement,"
                + "    name text not null,"
                + "    article text not null,"
                + "    city text not null"
                + ")";
        db.execSQL( strSql );
        Log.i( "DATABASE", "onCreate invoked" );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String strSql = "drop table T_Boutique";
        db.execSQL( strSql );
        this.onCreate( db );
        Log.i( "DATABASE", "onUpgrade invoked" );

    }

    public void insertBoutique( String name , String city , String article ){

        name = name.replace( "'", "''" );

        String strSql = "insert into T_Boutique ( name, city , article) values ('"
                + name + "', " + city + ", " + article + " )";
        this.getWritableDatabase().execSQL( strSql );
        Log.i( "DATABASE", "insertBoutique invoked" );
    }

    public List<Boutique> read() {
        List<Boutique> boutiques = new ArrayList<>();

        Cursor cursor = this.getReadableDatabase().rawQuery("select*from T_boutique", null);
        cursor.moveToFirst();
        while( ! cursor.isAfterLast() ) {
            Boutique boutique = new Boutique( cursor.getInt( 0 ), cursor.getString( 1 ),
                    cursor.getString( 2 ), cursor.getString( 3 ));
            boutiques.add( boutique );
            cursor.moveToNext();
        }
        cursor.close();

        return boutiques;
    }
}


