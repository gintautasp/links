package ernadaslinks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RusisKategoriju {

	
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer id;
    
	public String pav;    
    
    public RusisKategoriju() {

	}    

    public RusisKategoriju(Integer id, String pav) {
		super();
		this.id = id;
		this.pav = pav;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @return the pav
	 */
	public String getPav() {
		return pav;
	}

	/**
	 * @param pav the pav to set
	 */
	public void setPav(String pav) {
		this.pav = pav;
	}
    
    
}
