package Environment;

import java.io.Serializable;
import java.util.ArrayList;

public class ForestCell implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private ArrayList<GeoFeature> featureList;
	private Weather weather;
	private ForestDensity density;
	
	public ForestCell(int x, int y, String feature,	String condition, double visibility, String windDirection, double windVelocity, String density) {
		featureList = new ArrayList<GeoFeature>();
		this.x = x;
		this.y = y;
		featureList.add(GeoFeature.valueOf(feature));
		weather = new Weather(condition, windVelocity, windDirection, visibility);
		this.density = ForestDensity.valueOf(density);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public ArrayList<GeoFeature> getFeatureList() {
		return featureList;
	}

	public void setFeatureList(ArrayList<GeoFeature> featureList) {
		this.featureList = featureList;
	}

	public Weather getWeather() {
		return weather;
	}

	public void setWeather(Weather weather) {
		this.weather = weather;
	}

	public ForestDensity getDensity() {
		return density;
	}

	public void setDensity(ForestDensity density) {
		this.density = density;
	}
	
	public enum GeoFeature{
		Lake, Mountain, River, Field;
	}

	public enum ForestDensity {
		High, Medium, Low;
	}	
}




