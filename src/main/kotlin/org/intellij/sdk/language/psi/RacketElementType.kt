package org.intellij.sdk.language.psi

import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.RacketLanguage

class RacketElementType(debugName: String) :
    IElementType(debugName, RacketLanguage.INSTANCE)
