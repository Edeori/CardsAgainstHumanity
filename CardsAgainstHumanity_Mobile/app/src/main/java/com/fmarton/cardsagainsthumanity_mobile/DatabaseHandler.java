package com.fmarton.cardsagainsthumanity_mobile;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.List;

/**
 * Created by fmarton on 1/25/2018.
 */

public class DatabaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "cardManager";
    private static final String TABLE_CARDS = "cardsTable";

    private static final String KEY_ID = "id";
    private static final String KEY_TEXT = "text";

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_CARDS_TABLE = "Create TABLE " + TABLE_CARDS +"(" +KEY_ID +
                " INTEGER PRIMARY KEY," + KEY_TEXT + " TEXT," + ")";
        sqLiteDatabase.execSQL(CREATE_CARDS_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_CONTACTS);
        onCreate(sqLiteDatabase);
    }

    public void addCard(Card card) {
        SQLiteDatabase db = this.getWritableDatabase();


    }

    public Card getCard(int id) {}

    public List<Card> getAllCards() {}

    public int getCardsCount() {}
}
