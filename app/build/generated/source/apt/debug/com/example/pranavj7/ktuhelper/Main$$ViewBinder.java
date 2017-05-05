// Generated code from Butter Knife. Do not modify!
package com.example.pranavj7.ktuhelper;

import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Finder;
import butterknife.internal.ViewBinder;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Override;

public class Main$$ViewBinder<T extends Main> implements ViewBinder<T> {
  @Override
  public Unbinder bind(final Finder finder, final T target, Object source) {
    InnerUnbinder unbinder = createUnbinder(target);
    View view;
    view = finder.findRequiredView(source, 2131492977, "field 'mDrawer'");
    target.mDrawer = finder.castView(view, 2131492977, "field 'mDrawer'");
    view = finder.findRequiredView(source, 2131492981, "field 'mNavigationView'");
    target.mNavigationView = finder.castView(view, 2131492981, "field 'mNavigationView'");
    return unbinder;
  }

  protected InnerUnbinder<T> createUnbinder(T target) {
    return new InnerUnbinder(target);
  }

  protected static class InnerUnbinder<T extends Main> implements Unbinder {
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
