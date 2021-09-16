// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface RacketTypes {

  IElementType PROPERTY = new RacketElementType("PROPERTY");

  IElementType COMMENT = new RacketTokenType("COMMENT");
  IElementType CRLF = new RacketTokenType("CRLF");
  IElementType KEY = new RacketTokenType("KEY");
  IElementType SEPARATOR = new RacketTokenType("SEPARATOR");
  IElementType VALUE = new RacketTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new RacketPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
