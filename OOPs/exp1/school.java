
class School{
    private String name;
    private int rollno;

    public School(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    public void disp(){
        System.out.println("Roll No: "+rollno +" | Name: "+name);
    }
}

