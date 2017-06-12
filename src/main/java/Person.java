public class Person {
  public String name;
  private String address;
  private String city;
  private int zip;
  private int areaCode;
  private long phone;

  public Person(String inputName, String inputAddress, String inputCity, int inputZip, int inputAreaCode, int inputPhone) {
    this.name = inputName;
    this.address = inputAddress;
    this.city = inputCity;
    this.zip = inputZip;
    this.areaCode = inputAreaCode;
    this.phone = inputPhone;
  }
}
