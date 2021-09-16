package org.intellij.sdk.language

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

class RacketFileType private constructor() :
    LanguageFileType(RacketLanguage.INSTANCE) {

    override fun getName(): String = "Racket File"

    override fun getDescription(): String = "Racket language file"

    override fun getDefaultExtension(): String = "rkt"

    override fun getIcon(): Icon = RacketIcons.FILE

    companion object {
        val INSTANCE = RacketFileType()
    }
}
