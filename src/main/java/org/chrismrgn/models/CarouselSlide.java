package org.chrismrgn.models;

import org.dd4t.databind.annotations.ViewModel;
import org.dd4t.databind.annotations.ViewModelProperty;
import org.dd4t.databind.viewmodel.base.TridionViewModelBase;
import org.dd4t.contentmodel.Multimedia;

@ViewModel (rootElementNames = {"CarouselSlide"})
public class CarouselSlide extends TridionViewModelBase {

	@ViewModelProperty (entityFieldName = "Title")
    private String title;
    @ViewModelProperty (entityFieldName = "Intro")
    private String introduction;
    @ViewModelProperty (entityFieldName = "Image")
	private Multimedia image;
    @ViewModelProperty (entityFieldName = "Link")
	private String link;
    
    public String getTitle () {
        return title;
    }

    public void setTitle (final String title) {
        this.title = title;
    }

    public String getIntroduction () {
        return introduction;
    }

    public void setIntroduction (final String introduction) {
        this.introduction = introduction;
    }

    public String getLink () {
		return link;
	}

	public void setLink (final String link) {
		this.link = link;
	}

	public Multimedia getImage () {
		return image;
	}

	public void setImage (final Multimedia image) {
		this.image = image;
	}
}
