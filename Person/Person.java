public class Person {
    // write your code here
    private String firstName,lastName;
    private int age;
    public String getFirstName()
    {
        return firstName;
    }
    public String getLastName()
    {
        return lastName;
    }
    public int getAge()
    {
        return age;
    }
    public void setFirstName(String name)
    {
        this.firstName=name;
    }
    public void setLastName(String name)
    {
        this.lastName=name;
    }
    public void setAge(int age)
    {
        if(age<0 || age>100)
            this.age=0;
        else
            this.age=age;
    }
    public boolean isTeen()
    {
        return (age>12 && age<20);
    }
    public String getFUllName()
    {
        return (firstName+lastName);
    }
}