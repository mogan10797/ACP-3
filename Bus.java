public class Bus extends Car {

    private String peoplenum,doorNum,Company;

public  Bus(){
}
public Bus(String peoplenum1 ,String doorNum1 ,String Company1){
peoplenum=peoplenum1;
doorNum=doorNum1;
Company=Company1;
}
public void  setpeoplenum(String newpeoplenum){
   this.peoplenum=newpeoplenum;
}
public String getpeoplenum(){
    return this.peoplenum;
}
public void setdoorNum(String newdoorNum){
    this.doorNum=newdoorNum;
}
public String getdoorNum(){
    return this.doorNum;
}
public void setCompany(String newCompany){
this.Company=newCompany;
}
public String getCompany(){
    return this.Company;
}
public String showinfo(){
    return "Bus:  "+getpeoplenum()+" | "+getdoorNum()+" | "+getCompany();
}
}
