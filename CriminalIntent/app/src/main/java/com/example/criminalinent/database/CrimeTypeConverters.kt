package com.example.criminalinent.database

import androidx.room.TypeConverter
import java.util.*

class CrimeTypeConverters {
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }
    @TypeConverter
    fun toDate(millisecondsSinceEpoch: Long): Date {
        return Date(millisecondsSinceEpoch)
    }
}