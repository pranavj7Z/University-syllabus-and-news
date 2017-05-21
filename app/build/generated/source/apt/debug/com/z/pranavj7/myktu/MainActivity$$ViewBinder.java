// Generated code from Butter Knife. Do not modify!
package com.z.pranavj7.myktu;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class MainActivity$$ViewBinder<T extends MainActivity> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131492989, "field 'mDrawer'");
    target.mDrawer = finder.castView(view, 2131492989, "field 'mDrawer'");
    view = finder.findRequiredView(source, 2131492994, "field 'mNavigationView'");
    target.mNavigationView = finder.castView(view, 2131492994, "field 'mNavigationView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends MainActivity> implements Unbinder {
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
      target.mDrawer = null;
      target.mNavigationView = null;
    }
  }
}
