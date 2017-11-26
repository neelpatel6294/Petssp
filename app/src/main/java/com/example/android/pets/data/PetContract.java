package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by PATEL on 11/24/2017.
 */

public class PetContract {

    public PetContract() {
    }

    public static final class PetEntry implements BaseColumns {

        //Name of Table
        public final static String TABLE_NAME = "pets";

        //ID of pets
        public final static String _ID = BaseColumns._ID;

        //Name of pets
        public final static String COLUMN_PET_NAME = "name";
        //Breed of pets
        public final static String COLUMN_PET_BREED = "breed";
        //Gender of pets
        public final static String COLUMN_PET_GENDER = "gender";
        //Weight of pets
        public final static String COLUMN_PET_WEIGHT = "weight";


        //Possible Values for Gender
        public static final int GENDER_UNKNOWN = 0;
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;

    }
}
