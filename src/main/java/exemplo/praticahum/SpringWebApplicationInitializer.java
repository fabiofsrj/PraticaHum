package exemplo.praticahum;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import exemplo.praticahum.business.SpringBusinessConfig;
import exemplo.praticahum.web.SpringWebConfig;

public class SpringWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	public static final String CHARACTER_ENCODING = "UTF-8";
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { SpringBusinessConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] { SpringWebConfig.class };
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
