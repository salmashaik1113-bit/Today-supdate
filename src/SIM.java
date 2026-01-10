 class SIM1 {
    String Firstname;
    String Secondname;
    int Aadharnumber;
    String DOB;
}
public class SIM{
    public static void main(String[] args){
        SIM1 s1=new SIM1();
                s1.Firstname="sss";
                s1.Secondname="rrr";
                s1.Aadharnumber=12345;
                s1.DOB="1-02-1999";
                SIM1 s2=new SIM1();
        s2.Firstname="aaa";
        s2.Secondname="eee";
        s2.Aadharnumber=22222;
        s2.DOB="2-02-1999";
        System.out.println(s1.Firstname);
        System.out.println(s1.Secondname);
        System.out.println(s1.Aadharnumber);
        System.out.println(s1.DOB);
        System.out.println(s2.Firstname);
        System.out.println(s2.Secondname);
        System.out.println(s2.Aadharnumber);
        System.out.println(s2.DOB);

    }
}
