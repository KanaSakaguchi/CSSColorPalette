import com.intellij.openapi.actionSystem.ActionManager;
import com.intellij.openapi.actionSystem.ActionPlaces;
import com.intellij.openapi.actionSystem.ActionToolbar;
import com.intellij.openapi.actionSystem.DefaultActionGroup;
import com.intellij.openapi.ui.SimpleToolWindowPanel;

/**
 * 本体
 */
public class CSSColorPalette extends SimpleToolWindowPanel {
  CSSColorPalette() {
    super(false, true);

    setToolbar();
  }

  private void setToolbar() {
    final DefaultActionGroup actionGroup = new DefaultActionGroup();
    actionGroup.add(new DirectoryAddAction());
    final ActionToolbar actionToolbar = ActionManager.getInstance().createActionToolbar(ActionPlaces.TODO_VIEW_TOOLBAR, actionGroup, false);
    setToolbar(actionToolbar.getComponent());
  }
}
