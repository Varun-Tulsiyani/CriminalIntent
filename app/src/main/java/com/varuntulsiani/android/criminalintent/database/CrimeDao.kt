package com.varuntulsiani.android.criminalintent.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Update
import com.varuntulsiani.android.criminalintent.Crime
import kotlinx.coroutines.flow.Flow
import java.util.UUID

@Dao
interface CrimeDao {
    @Query("SELECT * FROM crime")
    fun getCrimes(): Flow<List<Crime>>

    @Query("SELECT * FROM crime WHERE id = (:id)")
    suspend fun getCrime(id: UUID) : Crime

    @Update
    suspend fun updateCrime(crime: Crime)
}