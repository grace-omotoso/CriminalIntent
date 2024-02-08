package com.example.criminalinent.database

import androidx.room.*
import com.example.criminalinent.Crime
import kotlinx.coroutines.flow.Flow
import java.util.*

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    // suspend fun getCrimes(): List<Crime>
    fun getCrimes(): Flow<List<Crime>>
    @Query("SELECT * FROM crime WHERE id=(:id)")
    suspend fun getCrime(id: UUID): Crime
    @Update
    suspend fun updateCrime(crime: Crime)
    @Insert
    suspend fun addCrime(crime: Crime)
    @Delete
    suspend fun deleteCrime(crime: Crime)
}
///