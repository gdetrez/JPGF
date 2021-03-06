package org.grammaticalframework.Trees.Absyn; // Java Package generated by the BNF Converter.

public abstract class Tree implements java.io.Serializable {
  public abstract <R,A> R accept(Tree.Visitor<R,A> v, A arg);
  public interface Visitor <R,A> {
    public R visit(org.grammaticalframework.Trees.Absyn.Lambda p, A arg);
    public R visit(org.grammaticalframework.Trees.Absyn.Variable p, A arg);
    public R visit(org.grammaticalframework.Trees.Absyn.Application p, A arg);
    public R visit(org.grammaticalframework.Trees.Absyn.Literal p, A arg);
    public R visit(org.grammaticalframework.Trees.Absyn.MetaVariable p, A arg);
    public R visit(org.grammaticalframework.Trees.Absyn.Function p, A arg);

  }

}
