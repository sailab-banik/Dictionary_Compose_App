package com.sailab.dictionaryapp.feature_dictionary.data.local

import androidx.room.*
import com.sailab.dictionaryapp.feature_dictionary.data.local.entity.WordInfoEntity

@Dao
interface WordInfoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWordInfo(info: List<WordInfoEntity>)

    @Query("DELETE FROM wordinfoentity WHERE word IN(:word)")
    suspend fun deleteWordInfo(word: List<String>)

    @Query("SELECT * FROM wordinfoentity WHERE word LIKE '%' || :word || '%'")
    suspend fun getWordInfo(word: String): List<WordInfoEntity>
}