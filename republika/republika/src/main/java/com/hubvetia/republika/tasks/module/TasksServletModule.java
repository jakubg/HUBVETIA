package com.hubvetia.republika.tasks.module;


import com.google.inject.servlet.ServletModule;
import com.googlecode.objectify.ObjectifyFilter;



/** Public so it can be used by unit tests */
public class TasksServletModule extends ServletModule

{
	/* (non-Javadoc)
	 * @see com.google.inject.servlet.ServletModule#configureServlets()
	 */
	@Override
	protected void configureServlets() {
        filter("/*").through(ObjectifyFilter.class);
	}
}