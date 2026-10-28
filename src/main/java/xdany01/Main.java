package xdany01;

import com.formdev.flatlaf.FlatDarculaLaf;
import xdany01.presentation.MainFrame;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        FlatDarculaLaf.setup();
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}
