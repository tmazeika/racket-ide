package org.intellij.sdk.language.psi

import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.RacketLanguage

class RacketTokenType(debugName: String) :
    IElementType(debugName, RacketLanguage.INSTANCE) {

    override fun toString(): String = "RacketTokenType.${super.toString()}"
}
