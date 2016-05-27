package org.chrismrgn.models;

import org.dd4t.databind.annotations.ViewModel;
import org.dd4t.databind.annotations.ViewModelProperty;
import org.dd4t.databind.viewmodel.base.TridionViewModelBase;

import java.util.List;

@ViewModel (
		viewModelNames = {"hero-carousel"},
		rootElementNames = {"Carousel"},
		setComponentObject = true)
public class Carousel extends TridionViewModelBase {

	//@ViewModelProperty (entityFieldName = "Title")
	//private String title;
	
	//public String getTitle () {
    //    return title;
    //}

    //public void setTitle (final String title) {
    //    this.title = title;
    //}
	
	@ViewModelProperty (entityFieldName = "Slides")
	private List<CarouselSlide> slides;
	
	public List<CarouselSlide> getSlides () {
		return slides;
	}

	public void setSlides (final List<CarouselSlide> slides) {
		this.slides = slides;
	}
}
