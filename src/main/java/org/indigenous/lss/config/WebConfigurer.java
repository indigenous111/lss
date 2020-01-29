package org.indigenous.lss.config;

import java.io.File;
import java.nio.file.Paths;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.indigenous.lss.interceptors.CORSInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements ServletContextInitializer,
		WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>, WebMvcConfigurer {

	private final Environment env;

	private static final String STATIC_ASSETS_FOLDER_PARAM = "view";

	private final String staticAssetsFolderPath;

	@Autowired
	public WebConfigurer(Environment env,
			@Value("${" + STATIC_ASSETS_FOLDER_PARAM + ":}") String staticAssetsFolderPath) {
		this.env = env;
		this.staticAssetsFolderPath = staticAssetsFolderPath;
	}

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// No Implementation
	}

	@Override
	public void customize(ConfigurableServletWebServerFactory factory) {
		customizeDocumentRoot(factory);
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CORSInterceptor());
	}
	
	@Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedMethods("HEAD", "GET", "PUT", "POST", "DELETE", "PATCH");
    }

	private void customizeDocumentRoot(ConfigurableServletWebServerFactory container) {
		if (!StringUtils.isEmpty(staticAssetsFolderPath)) {
			File docRoot;
			if (staticAssetsFolderPath.startsWith(File.separator)) {
				docRoot = new File(staticAssetsFolderPath);
			} else {
				final String workPath = Paths.get(".").toUri().normalize().getPath();
				docRoot = new File(workPath + staticAssetsFolderPath);
			}
			if (docRoot.exists() && docRoot.isDirectory()) {
				container.setDocumentRoot(docRoot);
			}
		}
	}

}
