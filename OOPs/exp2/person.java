class person{
    protected String name;
    protected int id;
    public person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void disp(){
        System.out.println("My Name is "+name +"and my ID is "+id);
    }
}

class student extends person{
    private int id;
    public student(String name,int id){
        super(name,id);
        this.id=id;
    }

    @Override
    public void disp(){
        System.out.println("Student Name: "+name +"| Student ID: "+id);
    }
}

class staff extends person{
    private int id;
    public staff(String name,int id){
        super(name,id);
        this.id=id;
    }

    @Override
    public void disp(){
        System.out.println("Staff Name: "+name +"| Staff ID: "+id);
    }
}