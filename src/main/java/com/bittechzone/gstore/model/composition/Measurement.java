package com.bittechzone.gstore.model.composition;

import javax.persistence.Embeddable;

@Embeddable
public class Measurement {

    private Integer weight; // KG

    private Integer volume; // LT

    private Integer height; // CM

    private Integer width; // CM

    public Integer getWeight() {
	return weight;
    }

    public void setWeight(Integer weight) {
	this.weight = weight;
    }

    public Integer getVolume() {
	return volume;
    }

    public void setVolume(Integer volume) {
	this.volume = volume;
    }

    public Integer getHeight() {
	return height;
    }

    public void setHeight(Integer height) {
	this.height = height;
    }

    public Integer getWidth() {
	return width;
    }

    public void setWidth(Integer width) {
	this.width = width;
    }

}
