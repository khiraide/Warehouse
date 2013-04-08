package models;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import play.db.ebean.Model;

@Entity
public class Address extends Model {
  private static final long serialVersionUID = -45922353421309203L;
  @Id
  public Long id;
  public String street;
  public String city;
  public String zipcode;
  @OneToOne(cascade=CascadeType.ALL)
  public Warehouse warehouse;
  
  public Address(Warehouse warehouse, String street, String city, String zipcode) {
    this.warehouse = warehouse;
    this.street = street;
    this.city = city;
    this.zipcode = zipcode;
  }
  
  public static Finder<Long, Address> find() {
    return new Finder<Long, Address>(Long.class, Address.class);
  }

}
