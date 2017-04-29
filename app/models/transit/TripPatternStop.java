package models.transit;


import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OrderColumn;
import javax.persistence.Query;

import org.codehaus.jackson.annotate.JsonBackReference;
import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.hibernate.annotations.Type;

import play.Logger;
import play.db.jpa.Model;

@JsonIgnoreProperties({"entityId", "persistent"})
@Entity
public class TripPatternStop extends Model {

	@JsonBackReference
	@ManyToOne
    public TripPattern pattern;

	@ManyToOne
    public Stop stop;

	public Integer stopSequence;

	public Double defaultDistance;

	public Integer defaultTravelTime;
	public Integer defaultDwellTime;

	public Integer board;
	public Integer alight;
	

	public TripPatternStop()
	{

	}

	public TripPatternStop(TripPattern pattern, Stop stop,  Integer stopSequence, Integer defaultTravelTime)
	{
		this.pattern = pattern;
		this.stop = stop;
		this.stopSequence = stopSequence;
		this.defaultTravelTime = defaultTravelTime;

		this.defaultDistance = 0.0;
	}
}


