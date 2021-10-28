package com.heaven.calculator.HistoryDao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.heaven.calculator.model.History

@Dao
interface HistoryDao {
    @Query("SELECT * FROM history")
    fun getAll(): List<History>

    @Insert
    fun insertHistory(history: History)

    @Query("DELETE FROM history")
    fun deleteAll()

//    @Delete
//    fun delete(history: History)

//    @Query("SELECT * FROM history WHERE result LIKE :result")
//    fun findByResult(result: String) : History
}