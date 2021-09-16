package org.intellij.sdk.language.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import org.intellij.sdk.language.RacketFileType
import org.intellij.sdk.language.RacketLanguage

class RacketFile(viewProvider: FileViewProvider) :
    PsiFileBase(viewProvider, RacketLanguage.INSTANCE) {

    override fun getFileType(): FileType = RacketFileType.INSTANCE

    override fun toString(): String = "Racket File"
}
