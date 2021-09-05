package world.weibiansanjue.intellij.plugin.world.weibiansanjue;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

public class test extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent e) {
        System.out.println("hello world");
    }
}
