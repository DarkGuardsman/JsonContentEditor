package com.builtbroken.editor.gui;

import com.builtbroken.editor.gui.menu.FileMenuItem;

import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.io.File;

/**
 * Created by Dark(DarkGuardsman, Robert) on 2019-05-07.
 */
public final class FrameMain extends JFrame
{

    public FrameMain()
    {
        //Set frame properties
        setTitle("Json Content Editor v1.1.0");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Size and location
        setSize(1000, 800);
        setMinimumSize(new Dimension(800, 800));
        setLocationRelativeTo(null);

        //Menu
        createMenuBar();

        //View
        add(buildCenter());

        pack();
    }

    private void createMenuBar()
    {

        JMenuBar menubar = new JMenuBar();
        menubar.add(new FileMenuItem(this));
        setJMenuBar(menubar);
    }

    private JPanel buildCenter()
    {
        JPanel panel = new JPanel();
        panel.setLayout(new CardLayout());


        return panel;
    }

    public void openProject()
    {
        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        int returnValue = jfc.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = jfc.getSelectedFile();
            System.out.println(selectedFile.getAbsolutePath());
        }
    }
}
