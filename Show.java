
public class Show  {
    public int p_id;
    public String name;
    public int age;
    public String gender;
    public String address1;
    public String phone;
    public int ward;
    public int bed;
    public String date;
    public String dname;
    public int d_id;
    public String nextdate;
    public Show (int p_id,String name,int age,String gender,String address1,String phone,int ward,int bed,String date,String dname,int d_id,String nextdate){
        this.p_id=p_id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.address1=address1;
        this.phone=phone;
        this.ward=ward;
        this.bed=bed;
        this.date=date;
        this.dname=dname;
        this.d_id=d_id;
        this.nextdate=nextdate;
        
    }
       public int getid(){
    
    return p_id;
}
    public String getname()
    {
        return name;
    }             
       public int getage(){
    return age;
}
       public String getgender(){
           return gender;
       }
           public String getaddress1(){
    return address1;
}
               public String getphone(){
    return phone;
}
               public int getward(){
                   return ward;
               }
               public int getbed(){
                   return bed;
               }
                   public String getdate(){
    return date;
}
                   
                   public String getdname(){
                       return dname;
                   }
                   public int getdid(){
                       return d_id;
 }
                   public String getnextdate(){
                       return nextdate;
                   }
    
}

