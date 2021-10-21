package br.com.ifmt.controller;

import javax.swing.ImageIcon;
import javax.swing.table.*;

/**
 * @author Vitor Santos
 */
public class JTableRenderer extends DefaultTableCellRenderer {
    @Override
    public void setValue(Object value) {
        if (value instanceof ImageIcon) {
            if (value != null) {
                ImageIcon imageIcon = (ImageIcon) value;
                setIcon(imageIcon);
            } else {
                setText("");
                setIcon(null);
            }
        } else {
            super.setValue(value);
        }
    }
}
