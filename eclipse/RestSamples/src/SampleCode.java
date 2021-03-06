import com.esri.arcgisws.*;

public class SampleCode {

	public static void main(String[] args) {
		String url = "https://services2.geodataonline.no/arcgis/rest/services/Geomap_UTM33_EUREF89/GeomapAdmin/MapServer";
		int layerID = 10;
		String username = "username";
		String password = "password";
		com.esri.arcgisws.MapServerBindingStub stub = new com.esri.arcgisws.MapServerBindingStub(url, username, password);
		String mapName = stub.getDefaultMapName();
		SpatialFilter queryFilter = new SpatialFilter();
		PointN geometry = new PointN();
		geometry.setX(0);
		geometry.setY(0);
		queryFilter.setFilterGeometry(geometry);
		stub.queryFeatureData(mapName, layerID, queryFilter);
	}

}
