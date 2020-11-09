package com.asuraiv.javapractice.generic;

import java.awt.*;

class HoldItem<T> {

	T item;

	public HoldItem(T item) {
		this.item = item;
	}

	T getItem() {
		return this.item;
	}
}

class Colored2<T extends HasColor> extends HoldItem<T> {

	public Colored2(T item) {
		super(item);
	}

	Color color() {
		return this.item.getColor();
	}
}

class ColoredDimension2<T extends Dimension & HasColor> extends Colored2<T> {

	public ColoredDimension2(T item) {
		super(item);
	}

	int getX() {
		return this.item.x;
	}
	int getY() {
		return this.item.y;
	}
	int getZ() {
		return this.item.z;
	}
}

class Solid2<T extends Dimension & HasColor & Weight> extends ColoredDimension2<T>{

	public Solid2(T item) {
		super(item);
	}

	int weight() {
		return this.item.weight();
	}
}

public class InheritBounds {

	public static void main(String[] args) {

	}
}
