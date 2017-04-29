package models.transit;



import java.math.BigInteger;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.ManyToOne;
import javax.persistence.Query;

import com.vividsolutions.jts.geom.Coordinate;
import com.vividsolutions.jts.geom.GeometryFactory;
import com.vividsolutions.jts.geom.LineString;
import com.vividsolutions.jts.geom.PrecisionModel;

import org.apache.commons.lang.StringUtils;
import org.hibernate.annotations.Type;

import play.db.jpa.Model;

@Entity
public class TripShape extends Model {
	
    public String gtfsShapeId;
    public String description;
    
    public Double describedDistance;
    
    @ManyToOne
    public Agency agency;
    
    @Type(type = "org.hibernatespatial.GeometryUserType") 
    public LineString shape;
    
    @Type(type = "org.hibernatespatial.GeometryUserType") 
    public LineString simpleShape;
    
    
    public static BigInteger nativeInsert(EntityManager em, String shapeId, String shape, Double distance)
    {
    	Query idQuery = em.createNativeQuery("SELECT NEXTVAL('hibernate_sequence');");
    	BigInteger nextId = (BigInteger)idQuery.getSingleResult();
    	
        em.createNativeQuery("INSERT INTO tripshape (id, gtfsshapeid, shape, describeddistance)" +
        	"  VALUES(?, ?, ST_Simplify(ST_GeomFromText( ?, 4326), 0.0001), ?);")
          .setParameter(1,  nextId)
          .setParameter(2,  shapeId)	            
          .setParameter(3,  shape)
          .setParameter(4,  distance)
          .executeUpdate();
        
        return nextId;
    }
   
}
