package com.example.apkanapa

import androidx.room.*

@Entity //obiekty
data class PlayerCart(
    @PrimaryKey val Name: String, //pierwsza kolumna takiego jakby id plikow do ktorych w nastepnych kolumnach przypisane beda wartosci
    @ColumnInfo(name = "WW") val WW: Int?, //kolumna zmiennej ww w ktorej beda te wartosci w formie inta
    @ColumnInfo(name = "US") val US: Int?,
    @ColumnInfo(name = "K") val K: Int?,
    @ColumnInfo(name = "Odp") val Odp: Int?,
    @ColumnInfo(name = "Zr") val Zr: Int?,
    @ColumnInfo(name = "Int") val Int: Int?,
    @ColumnInfo(name = "SW") val SW: Int?,
    @ColumnInfo(name = "Ogd") val Ogd: Int?
)

@Dao //sposob dzialania takie komenty zapytan
interface PlayerCartDao {
    @Query("SELECT * FROM playercart")
    fun getAll(): List<PlayerCart> //wczytuje wszystko z list playercart

    @Query("SELECT * FROM playercart WHERE name = :name limit 1")
    fun findByName(name: String): PlayerCart //znajduje dane wartosci z listy

    @Insert
    fun insert(cart: PlayerCart) //zapisuje liste wartosci

    @Delete
    fun delete(cart: PlayerCart) //usuwa liste wartosci
}

@Database(entities = [PlayerCart::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun playerCartDao(): PlayerCartDao
}