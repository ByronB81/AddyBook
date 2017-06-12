public class Person {
  public String name;
  private String address;
  private String city;
  private int zip;
  private int areaCode;
  private int phone;

  public Person(String inputName, String inputAddress, String inputCity, int inputZip, int inputAreaCode, int inputPhone) {
    this.name = inputName;
    this.address = inputAddress;
    this.city = inputCity;
    this.zip = inputZip;
    this.areaCode = inputAreaCode;
    this.phone = inputPhone;
  }

  public String getName(){
    return this.name;
  }

  public String getAddress() {
    return this.address;
  }

  public String getCity() {
    return this.city;
  }

  public int getZipCode() {
    return this.zip;
  }

  public int getAreaCode() {
    return this.areaCode;
  }

  public int getPhone() {
    return this.phone;
  }
}
