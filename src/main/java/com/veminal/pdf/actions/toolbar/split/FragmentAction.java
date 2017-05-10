package com.veminal.pdf.actions.toolbar.split;

import com.veminal.pdf.actions.IEvent;
import com.veminal.pdf.annotation.NotUsed;
import com.veminal.pdf.settings.read.ReadSettings;
import org.eclipse.jface.action.Action;
import org.eclipse.jface.resource.ImageDescriptor;

/**
 * Action for button "Fragment action".
 *
 * @author Veminal
 * @version 1.0
 */
public final class FragmentAction implements IEvent {
    /**
     * Action initializing.
     *
     * @param menuItemsName of ReadSettings
     * @return Action
     */
    @Override
    @NotUsed
    public Action initializing(final ReadSettings menuItemsName) {
        return null;
    }

    /**
     * Action initializing.
     *
     * @param objName of ReadSettings
     * @param path    of String
     * @return Action
     */
    @Override
    public Action initializing(final ReadSettings objName, final String path) {
        return new Action((String) objName.parse("select.fragment"),
                ImageDescriptor.createFromFile(null, path)) {
        };
    }
}
