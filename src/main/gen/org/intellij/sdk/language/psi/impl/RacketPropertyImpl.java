// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.sdk.language.psi.RacketTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.intellij.sdk.language.psi.*;

public class RacketPropertyImpl extends ASTWrapperPsiElement implements RacketProperty {

  public RacketPropertyImpl(@NotNull ASTNode node) {
    super(node);
  }

  public void accept(@NotNull RacketVisitor visitor) {
    visitor.visitProperty(this);
  }

  @Override
  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof RacketVisitor) accept((RacketVisitor)visitor);
    else super.accept(visitor);
  }

}
