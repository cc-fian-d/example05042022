package demo03;

import java.awt.Rectangle;

public enum Resolution {

	SMALL(new Rectangle(0, 0, 400, 400)), MIDDLE(new Rectangle(0, 0, 500, 500)),
	LARGE(new Rectangle(0, 0, 800, 800)),
	XLARGE(new Rectangle(0, 0, 1000, 1000));

	private final Rectangle rect;

	public Rectangle getRect() {
		return new Rectangle(rect);
	}

	Resolution(Rectangle rectangle) {
		this.rect = rectangle;
	}

}
