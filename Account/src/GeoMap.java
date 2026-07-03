public class GeoMap {

    private GeoPoliticalZone zone;

    public GeoPoliticalZone getPoliticalZone(String state) {
        for (GeoPoliticalZone zone : GeoPoliticalZone.values()){
            for (String checkState : zone.getState()){
                if(checkState.equalsIgnoreCase(state)){
                    return zone;
                }
            }
        }
        return null;
    }
}
