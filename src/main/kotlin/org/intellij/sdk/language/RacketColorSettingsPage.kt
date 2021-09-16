package org.intellij.sdk.language

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage
import javax.swing.Icon

class RacketColorSettingsPage : ColorSettingsPage {

    override fun getIcon(): Icon = RacketIcons.FILE

    override fun getHighlighter(): SyntaxHighlighter = RacketSyntaxHighlighter()

    override fun getDemoText(): String =
        "# You are reading the \".properties\" entry.\n" +
                "! The exclamation mark can also mark text as comments.\n" +
                "website = https://en.wikipedia.org/\n" +
                "language = English\n" +
                "# The backslash below tells the application to continue reading\n" +
                "# the value onto the next line.\n" +
                "message = Welcome to \\\n" +
                "          Wikipedia!\n" +
                "# Add spaces to the key\n" +
                "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
                "# Unicode\n" +
                "tab : \\u0009"

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? =
        null

    override fun getAttributeDescriptors(): Array<AttributesDescriptor> =
        DESCRIPTORS

    override fun getColorDescriptors(): Array<ColorDescriptor> =
        ColorDescriptor.EMPTY_ARRAY

    override fun getDisplayName(): String = "Racket"

    companion object {
        private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Key", RacketSyntaxHighlighter.KEY),
            AttributesDescriptor(
                "Separator",
                RacketSyntaxHighlighter.SEPARATOR
            ),
            AttributesDescriptor("Value", RacketSyntaxHighlighter.VALUE),
            AttributesDescriptor(
                "Bad value",
                RacketSyntaxHighlighter.BAD_CHARACTER
            ),
        )
    }
}
