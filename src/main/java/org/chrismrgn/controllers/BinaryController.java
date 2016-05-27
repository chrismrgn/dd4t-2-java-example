package org.chrismrgn.controllers;

import org.dd4t.core.exceptions.ItemNotFoundException;
import org.dd4t.mvc.controllers.AbstractBinaryController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * dd4t-2
 *
 * @author R. Kempees
 */
@RequestMapping (value = {"**/*.gif", "**/*.jpg", "**/*.jpeg", "**/*.png", "**/*.pdf", "**/*.vcf", "**/*.swf", "**/*.zip", "**/*.xls", "**/*.xlsx"})
public class BinaryController extends AbstractBinaryController {
	@Override
	@RequestMapping(method = {RequestMethod.GET, RequestMethod.HEAD})
	public void getBinary (final HttpServletRequest request, final HttpServletResponse response) throws ItemNotFoundException {
		super.getBinary(request, response);
	}

	@Override protected String getBinaryPath (final HttpServletRequest request) {
		return super.getBinaryPath(request);
	}

	@Override public void setBinaryRootFolder (final String binaryRootFolder) {
		super.setBinaryRootFolder(binaryRootFolder);
	}

	@Override public boolean isUseBinaryStorage () {
		return super.isUseBinaryStorage();
	}

	@Override public void setUseBinaryStorage (final boolean useBinaryStorage) {
		super.setUseBinaryStorage(useBinaryStorage);
	}

	/**
	 * @return the removeContextPath
	 */
	@Override public boolean isRemoveContextPath () {
		return super.isRemoveContextPath();
	}

	/**
	 * @param removeContextPath the removeContextPath to set
	 */
	@Override public void setRemoveContextPath (final boolean removeContextPath) {
		super.setRemoveContextPath(removeContextPath);
	}
}
