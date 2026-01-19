class Constructer1{
    String name;
        int age;
        int Rollno;
        Constructer1(String n,int a,int R){
            name=n;
            age=a;
            Rollno=R;
        }
    }

    class Constructer {
        public static void main(String[] args) {
            Constructer1 s1 = new  Constructer1("Neeraja",22,1122);
            Constructer1 s2 = new  Constructer1("priya",21,2233);
            Constructer1 s3 = new  Constructer1("Saijagan",23,4444);

            // Setting values separately - tedious!
            ///s1.name = "Neeraja";
            ///s1.age = 22;

            ///s2.name = "Priya";
            ///s2.age = 21;

            ///s3.name = "Rahul";
           /// s3.age = 23;


            System.out.println(s1.name + " - " + s1.age + " - " + s1.Rollno);
            System.out.println(s2.name + " - " + s2.age+ " - " + s2.Rollno);
            System.out.println(s3.name + " - " + s3.age+ " - " + s3.Rollno);
        }
    }

