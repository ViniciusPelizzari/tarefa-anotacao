@Tabela(value = "address-people", year = 2024)
public class Address {

    private int postalCode;

    private String publicPlace;

    //restante dos campos


    public Address(int postalCode, String publicPlace) {
        this.postalCode = postalCode;
        this.publicPlace = publicPlace;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }

    public String getPublicPlace() {
        return publicPlace;
    }

    public void setPublicPlace(String publicPlace) {
        this.publicPlace = publicPlace;
    }

    @Override
    public String toString() {
        return "Address{" +
                "postalCode=" + postalCode +
                ", publicPlace='" + publicPlace + '\'' +
                '}';
    }
}
