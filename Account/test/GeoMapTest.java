import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class GeoMapTest {
    @Test
    public void testThatIGetMyGeoPoliticalZone(){
        GeoMap map = new GeoMap();
        assertSame(GeoPoliticalZone.NORTH_CENTRAL, map.getPoliticalZone("Benue"));
    }
}
