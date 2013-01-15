package com.hubvetia.republika.tasks.module;



import com.google.inject.AbstractModule;
import com.google.inject.servlet.ServletModule;

class TasksModule extends AbstractModule {

/* (non-Javadoc)
	 * @see com.google.inject.AbstractModule#configure()
	 */
	@Override
	protected void configure() {
		requestStaticInjection(OfyFactory.class);

		// Lets us use @Transact
		bindInterceptor(Matchers.any(), Matchers.annotatedWith(Transact.class), new TransactInterceptor());

		// External things that don't have Guice annotations
//		bind(AppstatsFilter.class).in(Singleton.class);
//		bind(AppstatsServlet.class).in(Singleton.class);
		bind(ObjectifyFilter.class).in(Singleton.class);

		bind(Places.class);
		bind(SignIn.class);
	}
}
