package com.sailab.dictionaryapp.feature_dictionary.presentation

import com.sailab.dictionaryapp.feature_dictionary.domain.model.WordInfo

data class WordInfoState(
    val wordInfoItems: List<WordInfo> = emptyList(),
    val isLoading: Boolean = false
)