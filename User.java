import java.util.ArrayList;
import java.util.Date;

public class User {
    private Date birthdate;
    private int size;
    private ArrayList<Photo> photos;
    private Address address;

    public User(Date birthdate, int size, ArrayList<Photo> photos, Address address){
        this.birthdate = birthdate;
        this.size = size;
        this.photos = photos;
        this.address = address;
    }

 
    public Date getBirthdate() {
        return this.birthdate;}
    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
    

    public int getSize() {
        return this.size;}
    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<Photo> getPhotos() {
        return this.photos;}
    public void setPhoto(ArrayList<Photo> photos) {
        this.photos = photos;
    }

    public Address getAddress() {
        return this.address;}
    public void setAddress(Address address) {
        this.address = address;
    }

}