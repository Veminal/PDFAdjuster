package com.veminal.pdf.actions.menu.edit;

import com.veminal.pdf.core.annotation.NotUsed;
import com.veminal.pdf.settings.read.ReadSettings;
import org.eclipse.jface.action.Action;
import com.veminal.pdf.actions.IEvent;

/**
 * Action for menu item "Retry".
 *
 * @author Veminal
 * @version 1.0
 */
public final class CutAction implements IEvent {
    /**
     * Action initializing.
     *
     * @param menuItemsName of ReadSettings
     * @return Action
     */
    @Override
    public Action initializing(final ReadSettings menuItemsName) {
        return new Action((String) menuItemsName.parse("cut")) {
        };
    }

    /**
     * Action initializing.
     *
     * @param objName of ReadSettings
     * @param path    of String
     * @return Action
     */
    @Override
    @NotUsed
    public Action initializing(final ReadSettings objName, final String path) {
        return null;
    }

}