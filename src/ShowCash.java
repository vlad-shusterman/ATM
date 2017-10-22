public class ShowCash {
    public static void showcash(int id){
        user user1 = new user();
        System.out.println(user1.getfromdatabasecash(id));
    }
}
