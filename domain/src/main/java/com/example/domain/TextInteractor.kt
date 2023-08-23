package com.example.domain

import com.example.data.Repository
import com.example.data.RepositoryImpl
import javax.inject.Inject

class TextInteractor @Inject constructor(private val repo: Repository): TextUseCase {
    override fun getText(): String {
        return repo.getText()
    }
}