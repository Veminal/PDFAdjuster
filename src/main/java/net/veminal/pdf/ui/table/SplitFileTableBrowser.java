package net.veminal.pdf.ui.table;

import net.veminal.pdf.utils.FilesUtil;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;

import java.util.List;

/**
 * Split file browser.
 *
 * @author Veminal
 * @version 1.0
 */
public final class SplitFileTableBrowser extends AbstractTable {
    @Override
    protected Table configTable(final Composite parent) {
        Table fileTable = new Table(parent, SWT.CHECK | SWT.BORDER
                | SWT.V_SCROLL | SWT.H_SCROLL | SWT.DELIMITER_SELECTION);
        fileTable.setLayoutData(new GridData(SWT.FILL, SWT.FILL,
                true, true));
        return fileTable;
    }

    @Override
    protected List outFilesList(final String target) {
        return FilesUtil.getDefaultFileList(target);
    }
}
