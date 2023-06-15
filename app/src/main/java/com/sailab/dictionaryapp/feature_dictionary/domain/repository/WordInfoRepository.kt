package com.sailab.dictionaryapp.feature_dictionary.domain.repository

import com.sailab.dictionaryapp.core.util.Resource
import com.sailab.dictionaryapp.feature_dictionary.domain.model.WordInfo
import kotlinx.coroutines.flow.Flow

interface WordInfoRepository {
    fun getWordInfo(word: String): Flow<Resource<List<WordInfo>>>
}