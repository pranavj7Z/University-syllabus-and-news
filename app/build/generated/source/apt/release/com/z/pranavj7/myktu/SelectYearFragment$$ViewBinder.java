// Generated code from Butter Knife. Do not modify!
package com.z.pranavj7.myktu;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class SelectYearFragment$$ViewBinder<T extends SelectYearFragment> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131493013, "field 'first'");
    target.first = finder.castView(view, 2131493013, "field 'first'");
    view = finder.findRequiredView(source, 2131493014, "field 'second'");
    target.second = finder.castView(view, 2131493014, "field 'second'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends SelectYearFragment> implements Unbinder {
    private T target;

    protected InnerUnbinder(T target) {
      this.target = target;
    }

    @Override
    public final void unbind() {
      if (target == null) throw new IllegalStateException("Bindings already cleared.");
      unbind(target);
      target = null;
    }

    protected void unbind(T target) {
      target.first = null;
      target.second = null;
    }
  }
}
