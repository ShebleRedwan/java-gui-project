
public class Show2 {
    public int d_id;
    public String name;
    public String designation;
    public String phone;
    public String address1;
    public String password;

    public Show2(int d_id, String name, String designation, String phone,String address1, String password) {
        this.d_id = d_id;
        this.name = name;
        this.designation = designation;
        this.phone = phone;
        this.address1=address1;
        this.password=password;
    }
    public int getdid(){
        return d_id;
    }
    public String getname(){
        return name;
        
    }
    public String getpassword()
    {
        return password;
    }
    public String getdesignation(){
        return designation;
    }
    public String getphone(){
        return phone;
    }
    public String getaddress1(){
        return address1;
    }
    
}
