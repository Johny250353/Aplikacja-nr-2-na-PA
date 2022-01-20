package com.example.apkanapa

import androidx.room.*

@Entity
data class PlayerCart(
    @PrimaryKey val Name: String,
    @ColumnInfo(name = "WW") val WW: Int?,
    @ColumnInfo(name = "US") val US: Int?,
    @ColumnInfo(name = "K") val K: Int?,
    @ColumnInfo(name = "Odp") val Odp: Int?,
    @ColumnInfo(name = "Zr") val Zr: Int?,
    @ColumnInfo(name = "Int") val Int: Int?,
    @ColumnInfo(name = "SW") val SW: Int?,
    @ColumnInfo(name = "Ogd") val Ogd: Int?
)

@Dao
interface PlayerCartDao {
    @Query("SELECT * FROM playercart")
    fun getAll(): List<PlayerCart>

    @Query("SELECT * FROM playercart WHERE name = :name limit 1")
    fun findByName(name: String): PlayerCart

    @Insert
    fun insert(cart: PlayerCart)

    @Delete
    fun delete(cart: PlayerCart)
}

@Database(entities = [PlayerCart::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun playerCartDao(): PlayerCartDao
}