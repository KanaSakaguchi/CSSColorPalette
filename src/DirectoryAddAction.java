import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class DirectoryAddAction extends AnAction {

  DirectoryAddAction() {
    super("Setting css directory", "Setting target css directory", AllIcons.General.Settings);
  }

  @Override
  public void actionPerformed(AnActionEvent anActionEvent) {
  }
}