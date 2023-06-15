package com.sailab.dictionaryapp.feature_dictionary.domain.use_cases

import com.sailab.dictionaryapp.core.util.Resource
import com.sailab.dictionaryapp.feature_dictionary.domain.model.WordInfo
import com.sailab.dictionaryapp.feature_dictionary.domain.repository.WordInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GetWordInfo(
    private val repository: WordInfoRepository
) {
    operator fun invoke(word: String): Flow<Resource<List<WordInfo>>> {
        if(word.isBlank()) {
            return flow {  }
        }
        return repository.getWordInfo(word)
    }
}