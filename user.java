//import { Address } from './address';
//import { Photo } from './photo';
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class User {
    private Date birthdate;
    private int size;
    private List<Photo> photos;
    private Address address; 


	public Date getBirthdate() {
		return this.birthdate;
	}
	public void setBirthdate(Date date) {
		this.birthdate = date;
	}

	public int getSize() {
		return this.size;
	}
	public void setSize(int number){
		this.size = number;
	}

	public List<Photo> getPhotos() {
		return this.photos;
	}
	public void setPhotos(List<Photo> photos) {
		this.photos = photos;
	}

	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}


}