package Two;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1,"Andriy",22,Stat.Cholovicha);
        User user2 = new User(2,"Diana",22,Stat.Jinocha);
        User user3 = new User(3,"Dmytiy",22,Stat.Cholovicha);
        User user4 = new User(4,"Taras",22,Stat.Cholovicha);
        User user5 = new User(5,"Eva",22,Stat.Jinocha);
        User user6 = new User(6,"Anton",22,Stat.Cholovicha);
        User user7 = new User(7,"Nina",22,Stat.Jinocha);
        User user8 = new User(8,"Olya",22,Stat.Jinocha);
        User user9 = new User(9,"Mykyta",22,Stat.Cholovicha);
        User user10 = new User(10,"Oleg",22,Stat.Cholovicha);


        ArrayList<User> arrayList= new ArrayList<>();
        arrayList.add(user1);
        arrayList.add(user2);
        arrayList.add(user3);
        arrayList.add(user4);
        arrayList.add(user5);
        arrayList.add(user6);
        arrayList.add(user7);
        arrayList.add(user8);
        arrayList.add(user9);
        arrayList.add(user10);

        for(User i : arrayList){
//            if(i.getId()%2==0) {
//                System.out.println(i);
//            }
            //
//            if(i.getName().length()>5){
//                System.out.println(i);
//            }
            //
            if(i.getStat()==Stat.Jinocha){
                System.out.println(i);
            }
        }

    }
}
