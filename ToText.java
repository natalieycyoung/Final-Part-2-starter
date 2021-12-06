import tester.*;

class Point {
	int x, y;
	Point(int x, int y) { this.x = x; this.y = y; }
	boolean belowLeftOf(Point p) { return this.x < p.x && this.y < p.y; }
	boolean aboveRightOf(Point p) { return this.x > p.x && this.y > p.y; }
	
	double distance(Point p) {
		int dx = p.x - this.x;
		int dy = p.y - this.y;
		return Math.sqrt(dx * dx + dy * dy);
	}
}



interface Region {
	boolean contains(Point p);
	String toText();
}

class RectRegion implements Region {
	Point lowerLeft, upperRight;
	
	RectRegion(Point lowerL, Point upperR) {
	this.lowerLeft = lowerL;
	this.upperRight = upperR;
}

public boolean contains(Point p) { return this.lowerLeft.belowLeftOf(p) && this.upperRight.aboveRightOf(p); }

public String toText()
{
	return "Rectangle";
}
}

class CircleRegion implements Region {
	Point center;
	int radius;
	CircleRegion(Point center, int radius) { this.center = center; this.radius = radius; }
	public boolean contains(Point p) { return this.center.distance(p) < this.radius; }
	
	public String toText()
	{
		return "Circle";
	}
}

class UnionRegion implements Region {
	Region r1, r2;
	UnionRegion(Region r1, Region r2) { this.r1 = r1; this.r2 = r2; }
	public boolean contains(Point p) { return this.r1.contains(p) || this.r2.contains(p); }
	
	public String toText()
	{
		String text = "Union(" + r1.toText() + ", " + r2.toText() + ")";
		
		return text;
	}
}


class IntersectRegion implements Region {
	Region r1, r2;
	IntersectRegion(Region r1, Region r2) {
		this.r1 = r1;
		this.r2 = r2;
	}

	public boolean contains(Point p) {
		return this.r1.contains(p) && this.r2.contains(p);
	}

	public String toText()
	{
		String text = "Intersect(" + r1.toText() + ", " + r2.toText() + ")";

		return text;
	}
}
