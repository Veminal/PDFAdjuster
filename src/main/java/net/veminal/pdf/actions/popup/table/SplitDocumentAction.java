package net.veminal.pdf.actions.popup.table;

import net.veminal.pdf.actions.IEvent;
import net.veminal.pdf.configuration.read.ReadConfig;
import net.veminal.pdf.core.annotations.NotUsed;
import org.eclipse.jface.action.Action;

/**
 * Split PDF document action.
 *
 * @author Veminal
 * @version 1.0
 */
public final class SplitDocumentAction implements IEvent {
    @Override
    public Action initializing(final ReadConfig menuItemsName) {
        return new Action((String) menuItemsName.parse("split")) {
        };
    }

    @Override
    @NotUsed
    public Action initializing(final ReadConfig objName, final String path) {
        return null;
    }
}
