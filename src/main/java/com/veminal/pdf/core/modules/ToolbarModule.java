package com.veminal.pdf.core.modules;

import com.google.inject.AbstractModule;
import com.veminal.pdf.actions.IEventList;
import com.veminal.pdf.actions.ToolbarActionsList;
import com.veminal.pdf.core.annotations.Toolbar;

/**
 * Configure dependencies to work with the list of toolbar.
 *
 * @author Veminal
 * @version 1.0
 */
public final class ToolbarModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(IEventList.class).annotatedWith(Toolbar.class).
                to(ToolbarActionsList.class);
    }
}
