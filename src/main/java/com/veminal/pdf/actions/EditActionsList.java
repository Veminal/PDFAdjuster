package com.veminal.pdf.actions;

import com.veminal.pdf.actions.menu.edit.CopyAction;
import com.veminal.pdf.actions.menu.edit.CutAction;
import com.veminal.pdf.actions.menu.edit.DeleteAction;
import com.veminal.pdf.actions.menu.edit.FontAction;
import com.veminal.pdf.actions.menu.edit.PasteAction;
import com.veminal.pdf.actions.menu.edit.SelectAllAction;
import com.veminal.pdf.actions.menu.edit.SettingsAction;
import com.veminal.pdf.actions.menu.edit.UndoSelectionAction;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of actions for the "Edit" menu.
 *
 * @author Veminal
 * @version 1.0
 */
public final class EditActionsList implements IEventList {
    @Override
    public List<IEvent> getActionList() {
        List<IEvent> editMenuList = new ArrayList<>();
        IEvent cut = new CutAction();
        IEvent copy = new CopyAction();
        IEvent paste = new PasteAction();
        IEvent delete = new DeleteAction();
        IEvent font = new FontAction();
        IEvent selectAll = new SelectAllAction();
        IEvent unSelect = new UndoSelectionAction();
        IEvent settings = new SettingsAction();
        editMenuList.add(cut);
        editMenuList.add(copy);
        editMenuList.add(paste);
        editMenuList.add(delete);
        editMenuList.add(font);
        editMenuList.add(selectAll);
        editMenuList.add(unSelect);
        editMenuList.add(settings);
        return editMenuList;
    }
}
