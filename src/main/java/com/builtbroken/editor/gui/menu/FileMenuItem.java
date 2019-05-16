package com.builtbroken.editor.gui.menu;

import com.builtbroken.editor.gui.FrameMain;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.KeyEvent;

/**
 * Created by Dark(DarkGuardsman, Robert) on 2019-05-15.
 */
public class FileMenuItem extends JMenu
{
    public final FrameMain host;

    public FileMenuItem(FrameMain host)
    {
        super("File");
        this.host = host;

        //Quick ref key
        setMnemonic(KeyEvent.VK_F);

        //Add items
        openItem();
        addSeparator();
        exitItem();

    }

    private void exitItem()
    {
        ImageIcon exitIcon = new ImageIcon("src/resources/exit.png");
        JMenuItem exitMenuItem = new JMenuItem("Exit", exitIcon);
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.setToolTipText("Exit application");
        exitMenuItem.addActionListener((event) -> System.exit(0));
        add(exitMenuItem);
    }

    private void openItem()
    {
        ImageIcon exitIcon = new ImageIcon("src/resources/open.png");
        JMenuItem exitMenuItem = new JMenuItem("Open", exitIcon);
        exitMenuItem.setMnemonic(KeyEvent.VK_O);
        exitMenuItem.setToolTipText("Open Project");
        exitMenuItem.addActionListener((event) -> host.openProject());
        add(exitMenuItem);
    }
}
