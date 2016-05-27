package org.chrismrgn.controllers;

import org.dd4t.contentmodel.Page;
import org.dd4t.mvc.controllers.AbstractPageController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.Console;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;
//import org.apache.http.HttpHeaders;
import org.dd4t.contentmodel.Page;
import org.dd4t.core.exceptions.FactoryException;
import org.dd4t.core.exceptions.ItemNotFoundException;
import org.dd4t.core.factories.impl.PageFactoryImpl;
import org.dd4t.core.util.Constants;
import org.dd4t.core.util.HttpUtils;
import org.dd4t.mvc.utils.RenderUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import javax.annotation.Resource;
import javax.servlet.DispatcherType;


public class PageController extends AbstractPageController {
private static final Logger LOG = LoggerFactory.getLogger(PageController.class);
	/**
	 * All page requests with the configured extensions are handled by this method.
	 *
	 * @param model
	 * @param request
	 * @param response
	 */
	@RequestMapping(value = {"/**/*.html", "/**/*.txt", "/**/*.xml"}, method = {RequestMethod.GET})
	@Override public String showPage (final Model model, final HttpServletRequest request, final HttpServletResponse response) throws IOException {
		return super.showPage(model, request, response);
	}
	
    private String adjustLocalErrorUrl (final HttpServletRequest request, final String url) {

        String adjustedUrl = url;
        if (request.getDispatcherType() == DispatcherType.ERROR) {
            adjustedUrl = publicationResolver.getLocalPageUrl(url);
        }
        return adjustedUrl;
    }

	@Override public String getPageViewName (final Page page) {
		return super.getPageViewName(page);
	}

	/**
	 * @return the pageViewPrefix
	 */
	@Override public String getPageViewPath () {
		return super.getPageViewPath();
	}

	/**
	 * @param pageViewPath
	 */
	@Override public void setPageViewPath (final String pageViewPath) {
		super.setPageViewPath(pageViewPath);
	}

	//@Override public boolean isRemoveContextPath () {
	//	return super.isRemoveContextPath();
	//}

	@Override public void setRemoveContextPath (final boolean removeContextPath) {
		super.setRemoveContextPath(removeContextPath);
	}
}
