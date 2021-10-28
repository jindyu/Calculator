package com.heaven.calculator

import androidx.room.Database
import androidx.room.RoomDatabase
import com.heaven.calculator.HistoryDao.HistoryDao
import com.heaven.calculator.model.History

@Database(entities = [History::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun historyDao(): HistoryDao
}