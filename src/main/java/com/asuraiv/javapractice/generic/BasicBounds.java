package com.asuraiv.javapractice.generic;

import java.awt.*;

/*
	바운드 :
	파라메터화 타입에 제약을 둘 수 있게 해 준다.
	바운드 타입 내에 있는 메서드를 호출할 수 있다.

 */

interface HasColor {
	Color getColor();
}

class Colored<T extends HasColor> {

	T item;

	public Colored(T item) {
		this.item = item;
	}

	T getItem() {
		return this.item;
	}

	Color color() {
		return item.getColor();
	}
}

class Dimension {
	public int x, y, z;
}

// 여러 바운드들
class ColoredDimension<T extends Dimension & HasColor> { // class가 먼저 오고 그 다음 인터페이스가 가능
	T item;
	public ColoredDimension(T item) {
		this.item = item;
	}
	T getItem() {
		return this.item;
	}
	Color color() {
		return this.item.getColor();
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

interface Weight {
	int weight();
}

// 상속과 함께 사용할때는 하나의 구현 클래스만 가능하며,
// 인터페이스는 여러개가 가능하다
class Solid<T extends Dimension & HasColor & Weight> {
	T item;
	public Solid(T item) {
		this.item = item;
	}
	T getItem() {
		return this.item;
	}
	Color color() {
		return this.item.getColor();
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
	int weight() {
		return this.item.weight();
	}
}

// Bounded를 Solid클래스의 파라메터화 타입으로 적용되려면,
// Solid 클래스의 바운드 제약으로 추가한 모든 클래스를 확장하고,
// 모든 인터페이스를 상속해야한다.
class Bounded extends Dimension implements HasColor, Weight {

	@Override
	public Color getColor() {
		return null;
	}

	@Override
	public int weight() {
		return 0;
	}
}

public class BasicBounds {

	public static void main(String[] args) {

		Solid<Bounded> solid = new Solid<>(new Bounded());
		solid.color();
		solid.getX();
		solid.weight();
	}
}
