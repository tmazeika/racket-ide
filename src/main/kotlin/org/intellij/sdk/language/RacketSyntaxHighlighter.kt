package org.intellij.sdk.language

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IElementType
import org.intellij.sdk.language.psi.RacketTypes

class RacketSyntaxHighlighter : SyntaxHighlighterBase() {
    override fun getHighlightingLexer(): Lexer = RacketLexerAdapter()

    override fun getTokenHighlights(tokenType: IElementType?): Array<TextAttributesKey> =
        when (tokenType) {
            RacketTypes.SEPARATOR -> SEPARATOR_KEYS
            RacketTypes.KEY -> KEY_KEYS
            RacketTypes.VALUE -> VALUE_KEYS
            RacketTypes.COMMENT -> COMMENT_KEYS
            TokenType.BAD_CHARACTER -> BAD_CHAR_KEYS
            else -> EMPTY_KEYS
        }

    companion object {
        val SEPARATOR = createTextAttributesKey(
            "RACKET_SEPARATOR",
            DefaultLanguageHighlighterColors.OPERATION_SIGN
        )
        val KEY = createTextAttributesKey(
            "RACKET_KEY",
            DefaultLanguageHighlighterColors.KEYWORD
        )
        val VALUE = createTextAttributesKey(
            "RACKET_VALUE",
            DefaultLanguageHighlighterColors.STRING
        )
        val COMMENT = createTextAttributesKey(
            "RACKET_COMMENT",
            DefaultLanguageHighlighterColors.LINE_COMMENT
        )
        val BAD_CHARACTER = createTextAttributesKey(
            "RACKET_BAD_CHARACTER",
            HighlighterColors.BAD_CHARACTER
        )

        val BAD_CHAR_KEYS = arrayOf(BAD_CHARACTER)
        val SEPARATOR_KEYS = arrayOf(SEPARATOR)
        val KEY_KEYS = arrayOf(KEY)
        val VALUE_KEYS = arrayOf(VALUE)
        val COMMENT_KEYS = arrayOf(COMMENT)
        val EMPTY_KEYS = arrayOf<TextAttributesKey>()
    }
}
