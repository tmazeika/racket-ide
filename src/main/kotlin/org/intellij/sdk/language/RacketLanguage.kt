package org.intellij.sdk.language

import com.intellij.lang.Language

class RacketLanguage private constructor() : Language("Racket") {

    companion object {
        val INSTANCE = RacketLanguage()
    }
}
