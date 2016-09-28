import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.roots.ui.componentsList.components.ScrollablePanel;
import com.intellij.openapi.ui.SimpleToolWindowPanel;
import com.intellij.openapi.ui.Splitter;

import javax.swing.JComponent;
import javax.swing.ScrollPaneLayout;

/**
 * 本体
 */
public class CSSColorPalette extends SimpleToolWindowPanel {
  ColorPalette colorPalette = new ColorPalette();
  SelectorList selectorList = new SelectorList();

  CSSColorPalette() {
    super(false, true);

    setToolbar();
    setContent();
  }

  private void setToolbar() {
    final DefaultActionGroup actionGroup = new DefaultActionGroup();
    actionGroup.add(new DirectoryAddAction());
    final ActionToolbar actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.TODO_VIEW_TOOLBAR, actionGroup, false);
    setToolbar(actionToolbar.getComponent());
  }

  private void setContent() {
    Splitter splitter = new Splitter(false);
    splitter.setFirstComponent((JComponent) new ScrollablePanel(new ScrollPaneLayout()).add(colorPalette));
    splitter.setSecondComponent((JComponent) new ScrollablePanel(new ScrollPaneLayout()).add(selectorList));
    setContent(splitter);
  }
}
