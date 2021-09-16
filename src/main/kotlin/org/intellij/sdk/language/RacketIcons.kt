package org.intellij.sdk.language

import com.intellij.openapi.util.IconLoader
import javax.swing.Icon

class RacketIcons private constructor() {

    companion object {
        val FILE: Icon =
            IconLoader.getIcon("/icons/racket.svg", RacketIcons::class.java)
    }
}
