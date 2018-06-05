package library;

import javafx.scene.shape.Rectangle;

import java.util.LinkedList;
import java.util.List;

import static java.lang.Math.round;


public class Dc {
	public static final Dc zero = new Dc(0, 0);
	public static final Dc none = new Dc(-9999, -9999);
	public static final Dc left = new Dc(-1, 0);
	public static final Dc right = new Dc(1, 0);
	public static final Dc top = new Dc(0, -1);
	public static final Dc bottom = new Dc(0, 1);
	public static final Dc topLeft = new Dc(-1, -1);
	public static final Dc topRight = new Dc(1, -1);
	public static final Dc bottomLeft = new Dc(-1, 1);
	public static final Dc bottomRight = new Dc(1, 1);
	public String content;
	private float x, y;
	private int xInt, yInt;
	private double xDouble, yDouble;
	private short xShort, yShort;


	public Dc(float x, float y) {
		this.x = x;
		this.y = y;
		xInt = round(x);
		yInt = round(y);
		xDouble = x;
		yDouble = y;
		xShort = (short) x;
		yShort = (short) y;
	}


	public Dc(String inline) {
		String[] coordinates = inline.split(",");
		this.x = Float.parseFloat(coordinates[0]);
		this.y = Float.parseFloat(coordinates[1]);
		xInt = round(Float.parseFloat(coordinates[0]));
		yInt = round(Float.parseFloat(coordinates[1]));
		xDouble = Float.parseFloat(coordinates[0]);
		yDouble = Float.parseFloat(coordinates[1]);
		xShort = (short) Float.parseFloat(coordinates[0]);
		yShort = (short) Float.parseFloat(coordinates[1]);
	}


	public Dc(Rectangle rect) {
		this.x = (float) rect.getX();
		this.y = (float) rect.getY();
		xInt = (int) round(rect.getX());
		yInt = (int) round(rect.getY());
		xDouble = rect.getX();
		yDouble = rect.getY();
		xShort = (short) rect.getX();
		yShort = (short) rect.getY();
	}


	public Dc(float both) {
		this.x = both;
		this.y = both;
		xInt = round(both);
		yInt = round(both);
		xDouble = both;
		yDouble = both;
		xShort = (short) both;
		yShort = (short) both;
	}


	public Dc(int x, int y) {
		this.x = x;
		this.y = y;
		xInt = round(x);
		yInt = round(y);
		xDouble = x;
		yDouble = y;
		xShort = (short) round(x);
		yShort = (short) round(y);
	}


	public Dc(int both) {
		this.x = (float) both;
		this.y = (float) both;
		xInt = round(both);
		yInt = round(both);
		xDouble = both;
		yDouble = both;
		xShort = (short) round(both);
		yShort = (short) round(both);
	}


	public Dc(double x, double y) {
		this.x = (float) x;
		this.y = (float) y;
		xInt = (int) round(x);
		yInt = (int) round(y);
		xDouble = x;
		yDouble = y;
		xShort = (short) round(x);
		yShort = (short) round(y);
	}


	public Dc(double both) {
		this.x = (float) both;
		this.y = (float) both;
		xInt = (int) round(both);
		yInt = (int) round(both);
		xDouble = both;
		yDouble = both;
		xShort = (short) round(both);
		yShort = (short) round(both);
	}


	public Dc(short x, short y) {
		this.x = x;
		this.y = y;
		xInt = x;
		yInt = y;
		xDouble = x;
		yDouble = y;
		xShort = x;
		yShort = y;
	}


	public Dc(short both) {
		this.x = both;
		this.y = both;
		xInt = both;
		yInt = both;
		xDouble = both;
		yDouble = both;
		xShort = both;
		yShort = both;
	}


	public Dc(Dc pos) {
		this.x = pos.x;
		this.y = pos.y;
		xInt = round(pos.x);
		yInt = round(pos.y);
		xDouble = pos.x;
		yDouble = pos.y;
		xShort = (short) round(pos.x);
		yShort = (short) round(pos.y);
	}


	public Dc() {
		this.x = 0f;
		this.y = 0f;
		xInt = 0;
		yInt = 0;
		xDouble = 0d;
		yDouble = 0d;
		xShort = 0;
		yShort = 0;
	}


	public static Dc[] addX(Dc[] position, float value) {
		Dc[] array = position.clone();
		for (int i = 0; i < array.length; i++)
			array[i].x += value;
		return array;
	}


	public static Dc[] addY(Dc[] position, float value) {
		Dc[] array = position.clone();
		for (int i = 0; i < array.length; i++)
			array[i].y += value;
		return array;
	}


	public static List<Dc> addX(List<Dc> position, float value) {
		List<Dc> list = new LinkedList<>();
		for (Dc pos : position)
			list.add(pos);
		for (int i = 0; i < list.size(); i++)
			list.get(i).x += value;
		return list;
	}


	public static List<Dc> addY(List<Dc> position, float value) {
		List<Dc> list = new LinkedList<>();
		for (Dc pos : position)
			list.add(pos);
		for (int i = 0; i < list.size(); i++)
			list.get(i).y += value;
		return list;
	}


	public static List<Dc> add(List<Dc> position, float x, float y) {
		List<Dc> list = new LinkedList<>();
		for (Dc pos : position)
			list.add(pos);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).y += y;
			list.get(i).x += x;
		}
		return list;
	}


	public static Dc add(Dc position, float x, float y) {
		Dc pos = new Dc(position);
		pos.setX(pos.x() + x);
		pos.setY(pos.y() + y);
		return pos;
	}


	public static Dc[] add(Dc[] position, float x, float y) {
		Dc[] array = position.clone();
		for (int i = 0; i < array.length; i++) {
			array[i].x += x;
			array[i].y += y;
		}
		return array;
	}


	public static Dc[] mul(Dc[] position, float x, float y) {
		Dc[] array = position.clone();
		for (int i = 0; i < array.length; i++) {
			array[i].x *= x;
			array[i].y *= y;
		}
		return array;
	}


	public static List<Dc> mul(List<Dc> position, float x, float y) {
		List<Dc> list = new LinkedList<>();
		for (Dc pos : position)
			list.add(pos);

		for (int i = 0; i < list.size(); i++) {
			list.get(i).y *= y;
			list.get(i).x *= x;
		}
		return list;
	}


	public static Dc[][] range(Dc fromPos, Dc toPos) {
		Dc from = min(fromPos, toPos);
		Dc to = max(fromPos, toPos);
		int xDist = (int) (Math.abs(from.x - to.x)) + 1;
		int yDist = (int) (Math.abs(from.y - to.y)) + 1;
		Dc range[][] = new Dc[xDist][yDist];
		for (int x = 0; x < xDist; x++)
			for (int y = 0; y < yDist; y++) {
				int posX = (int) Math.min(from.x, to.x);
				int posY = (int) Math.min(from.y, to.y);
				range[x][y] = new Dc(posX + x, posY + y);
			}

		return range;
	}


	public static Dc min(Dc fromPos, Dc toPos) {
		Dc minimum = new Dc();
		minimum.setX((fromPos.x <= toPos.x) ? fromPos.x : toPos.x);
		minimum.setY((fromPos.y <= toPos.y) ? fromPos.y : toPos.y);
		return minimum;
	}


	public static Dc max(Dc fromPos, Dc toPos) {
		Dc maximum = new Dc();
		maximum.setX((fromPos.x >= toPos.x) ? fromPos.x : toPos.x);
		maximum.setY((fromPos.y >= toPos.y) ? fromPos.y : toPos.y);
		return maximum;
	}


	public static boolean contains(Dc[] positions, Dc searchedPos) {
		for (int i = 0; i < positions.length; i++)
			if (equals(positions[i], searchedPos))
				return true;
		return false;
	}


	public static Dc[] containsIn(Dc[] posA, Dc[] posB) {
		List<Dc> positions = new LinkedList<>();
		for (int i = 0; i < posA.length; i++)
			if (contains(posA, posB[i]))
				positions.add(posB[i]);
		return convertToArray(positions);
	}


	public static List<Dc> containsIn(List<Dc> posA, List<Dc> posB) {
		List<Dc> positions = new LinkedList<>();
		for (int i = 0; i < posA.size(); i++)
			if (contains(posA, posB.get(i)))
				positions.add(posB.get(i));
		return positions;
	}


	public static List<Dc> containsIn(Dc[] posA, List<Dc> posB) {
		List<Dc> positions = new LinkedList<>();
		for (int i = 0; i < posA.length; i++)
			if (contains(posA, posB.get(i)))
				positions.add(posB.get(i));
		return positions;
	}


	public static Dc[] containsOut(Dc[] posA, Dc[] posB) {
		List<Dc> positions = new LinkedList<>();
		for (int i = 0; i < posA.length; i++)
			if (!contains(posA, posB[i]))
				positions.add(posB[i]);
		return convertToArray(positions);
	}


	public static List<Dc> containsOut(List<Dc> posA, List<Dc> posB) {
		List<Dc> positions = new LinkedList<>();
		for (int i = 0; i < posA.size(); i++)
			if (!contains(posA, posB.get(i)))
				positions.add(posB.get(i));
		return positions;
	}


	public static List<Dc> containsOut(Dc[] posA, List<Dc> posB) {
		List<Dc> positions = new LinkedList<>();
		for (int i = 0; i < posA.length; i++)
			if (!contains(posA, posB.get(i)))
				positions.add(posB.get(i));
		return positions;
	}


	public static Dc[] convertToArray(List<Dc> list) {
		Dc[] array = new Dc[list.size()];
		for (int i = 0; i < list.size(); i++)
			array[i] = list.get(i);
		return array;
	}


	public static boolean contains(List<Dc> positions, Dc searchedPos) {
		for (int i = 0; i < positions.size(); i++)
			if (equals(positions.get(i), searchedPos))
				return true;
		return false;
	}


	public static boolean equals(Dc from, Dc to) {
		return from.x == to.x && from.y == to.y;
	}


	public Dc addX(float value) {
		return new Dc(x() + value, y());
	}


	public Dc addY(float value) {
		return new Dc(y(), y() + value);
	}


	public Dc add(float value) {
		return new Dc(x() + value, y() + value);
	}


	public Dc add(float x, float y) {
		return new Dc(x() + x, y() + y);
	}


	public Dc sub(float x, float y) {
		return new Dc(x() - x, y() - y);
	}


	public Dc subY(float value) {
		return new Dc(y() - value);
	}


	public Dc subX(float value) {
		return new Dc(x() - value);
	}


	public Dc mul(float value) {
		return new Dc(x() * value, y() * value);
	}


	public Dc mul(float x, float y) {
		return new Dc(x() * x, y() * y);
	}


	public Dc mulX(float value) {
		return new Dc(x() * value);
	}


	public Dc mulY(float value) {
		return new Dc(y() * value);
	}


	public Dc div(float value) {
		return new Dc(x() / value, y() / value);
	}


	public Dc div(float x, float y) {
		return new Dc(x() / x, y() / y);
	}


	public Dc divX(float value) {
		return new Dc(x() / value);
	}


	public Dc divY(float value) {
		return new Dc(y() / value);
	}


	public Dc sub(float value) {
		return new Dc(x() - value, y() - value);
	}


	public Dc add(Dc pos) {
		return new Dc(x() + pos.x(), y() + pos.y());
	}


	public Dc sub(Dc pos) {
		return new Dc(x() - pos.x(), y() - pos.y());
	}


	public Dc mul(Dc pos) {
		return new Dc(x() * pos.x(), y() * pos.y());
	}


	public Dc div(Dc pos) {
		return new Dc(x() / pos.x(), y() / pos.y());
	}


	public Dc getRounded() {
		return new Dc(round(x), round(y));
	}


	public Dc flat() {
		return new Dc((int) x(), (int) y());
	}


	public Dc abs() {
		return new Dc(Math.abs(x()), Math.abs(y()));
	}


	public Dc pow(float value) {
		return new Dc((float) Math.pow(x(), value), (float) Math.pow(y(), value));
	}


	public Dc powX(float value) {
		return new Dc((float) Math.pow(x(), value), y());
	}


	public Dc powY(float value) {
		return new Dc(y(), (float) Math.pow(x(), value));
	}


	public Dc sqrt() {
		return new Dc((float) Math.sqrt(x()), (float) Math.sqrt(x()));
	}


	public Dc sqrtX() {
		return new Dc((float) Math.sqrt(x()), y());
	}


	public Dc sqrtY() {
		return new Dc(x(), (float) Math.sqrt(y()));
	}


	public boolean isZero() {
		return equals(zero);
	}


	public Dc setZero() {
		return set(zero);
	}


	public Dc sub(Dc... positions) {
		Dc result = new Dc();
		if (positions.length == 0)
			return this;

		for (int i = 0; i < positions.length; i++)
			result.sub(positions[i].x(), positions[i].y());
		return result;
	}


	public Dc add(Dc... positions) {
		Dc result = new Dc();
		if (positions.length == 0)
			return this;

		for (int i = 0; i < positions.length; i++)
			result.add(positions[i].x(), positions[i].y());
		return result;
	}


	public Dc mul(Dc... positions) {
		Dc result = new Dc();
		if (positions.length == 0)
			return this;

		for (int i = 0; i < positions.length; i++)
			result.mul(positions[i].x(), positions[i].y());
		return result;
	}


	public Dc div(Dc... positions) {
		Dc result = new Dc();
		if (positions.length == 0)
			return this;

		for (int i = 0; i < positions.length; i++)
			result.div(positions[i].x(), positions[i].y());
		return result;
	}


	public Dc center(float squareSize) {
		return new Dc(x + squareSize / 2, y + squareSize / 2);
	}


	public Dc center(float w, float h) {
		return new Dc(x + w / 2, y + h / 2);
	}


	public boolean equals(Dc to) {
		return Math.abs(x() - to.x()) < 0.001f && Math.abs(y() - to.y()) < 0.001f;
	}


	public Dc set(float x, float y) {
		this.y = y;
		yInt = round(y);
		yDouble = y;
		yShort = (short) round(y);

		this.x = x;
		xInt = round(x);
		xDouble = x;
		xShort = (short) round(x);
		return this;
	}


	public Dc set(int x, int y) {
		this.y = y;
		yInt = round(y);
		yDouble = y;
		yShort = (short) round(y);

		this.x = x;
		xInt = round(x);
		xDouble = x;
		xShort = (short) round(x);
		return this;
	}


	public Dc set(Dc pos) {
		this.y = pos.y;
		yInt = round(pos.y);
		yDouble = pos.y;
		yShort = (short) round(pos.y);

		this.x = pos.x;
		xInt = round(pos.x);
		xDouble = pos.x;
		xShort = (short) round(pos.x);
		return this;
	}


	public float x() {
		return x;
	}


	public Dc setX(float x) {
		this.x = x;
		xInt = round(x);
		xDouble = x;
		xShort = (short) x;
		return this;
	}


	public float y() {
		return y;
	}


	public Dc setY(float y) {
		this.y = y;
		yInt = round(y);
		yDouble = y;
		yShort = (short) y;
		return this;
	}


	public int intX() {
		return xInt;
	}


	public int intY() {
		return yInt;
	}


	public double doubleX() {
		return xDouble;
	}


	public double doubleY() {
		return yDouble;
	}


	public short shortX() {
		return xShort;
	}


	public short shortY() {
		return yShort;
	}
}
