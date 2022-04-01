class Person {

    private String name;

/////////////  Getter  ////////////////////////////////////////////////////////////
    public String getName(){
//TODO: return the person's name
        return name;
    }
/////////////  Setter ///////////////////////////////////////////////////////////////
    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
//////////// Instance Method ////////////////////////////////////////////////////////
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello " + name);
    }
//////////// Constructor  ///////////////////////////////////////////////////////////
    public Person (String name) {
        this.name = name;
    }

    public static void main(String[] args) {
////////////  Created a new instance using constructor, followed by instance method //
        Person oscar = new Person("Oscar");
        oscar.sayHello();
    }

}

