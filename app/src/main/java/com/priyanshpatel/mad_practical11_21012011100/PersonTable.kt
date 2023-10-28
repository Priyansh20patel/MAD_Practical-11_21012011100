package com.priyanshpatel.mad_practical11_21012011100

class PersonTable {
    companion object{
        val TABLE_NAME = "person"
        val COLUMN_ID = "id"
        val COLUMN_NAME = "Person_name"
        val COLUMN_EMAIL_ID = "person_email"
        val COLUMN_PHONE = "person_phone"
        val COLUMN_ADDRESS = "person_address"
        val COLUMN_GPS_LAT = "person_lat"
        val COLUMN_GPS_LONG = "person_long"


  val CREATE_TABLE =("CREATE TABLE" + TABLE_NAME + "("
          + COLUMN_ID + "TEXT PRIMARY KEY,"
          + COLUMN_NAME + "TEXT,"
          + COLUMN_EMAIL_ID + "TEXT,"
          + COLUMN_PHONE + "TEXT,"
          + COLUMN_ADDRESS + "TEXT,"
          + COLUMN_GPS_LAT + "REAL,"
          + COLUMN_GPS_LONG+ "REAL,"
          +")")

    }
}