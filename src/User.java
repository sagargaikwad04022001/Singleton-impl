public class User {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    int count=0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private static User user3;
    private static int count1;
    private User() {
        count1++;
        System.out.println("Object created:"+count1+" times");
    }
//    public static User getObject()
//    {
//        return user;
//    }
    public static User getObj()
    {
        if(user3==null)
        {
            user3= new User();
            return user3;
        }
        return user3;
    }
}
