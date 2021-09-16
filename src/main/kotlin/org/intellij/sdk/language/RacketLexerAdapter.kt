package org.intellij.sdk.language

import com.intellij.lexer.FlexAdapter

class RacketLexerAdapter : FlexAdapter(RacketLexer(null))
