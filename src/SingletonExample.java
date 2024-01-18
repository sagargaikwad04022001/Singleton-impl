public class SingletonExample {
    public static void main(String[] args) {

//        User user=User.getObject();
//        System.out.println(user);
//
//        User user1=User.getObject();
//        System.out.println(user1);

        User user=User.getObj();
        System.out.println(user);

        User user1=User.getObj();
        System.out.println(user1);

    }
}
