package com.veminal.pdf.actions.format;

import com.veminal.pdf.actions.IEvent;
import org.eclipse.jface.action.Action;

/**
 * Action for menu item "Assembly PDF".
 *
 * @author Veminal
 * @version 1.0
 */
public final class AssemblyPDFAction implements IEvent {
    /**
     * Action initializing.
     *
     * @return Action
     */
    @Override
    public Action initializing() {
        return new Action() {
            @Override
            public String getText() {
                return "Assembly PDF";
            }
        };
    }
}
