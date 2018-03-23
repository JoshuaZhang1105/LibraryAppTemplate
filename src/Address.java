/**
 * Address Class
 */
public class Address {


    /**
     * toString() : void
     * Overrides the default toString() method.
     * This will format the address in the form of
     *
     * street
     * city, province
     * postalCode
     *
     * @return
     *          String consisting of a formatted mailing address.
     */

class Address {
    String Street;
    String City;
    String Province;
    String PostalCode;
    public String toString() {
        return this.Street + ", " + this.City + ", " + this.Province + " " + this.PostalCode;
}
