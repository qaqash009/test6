package com.lesson;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        String s = "Idris";
//        String a = "Idris";
//        String a = s.concat(" Ehmedzade");
//        System.out.println(a);
//        String b = new String("Idris");
//        System.out.println(s == b);
//        System.out.println(s == a);
//        System.out.println(s.equals(b));
//        List<User> users = new ArrayList<>();
//        users.add(new User("idris", "Ehmedzade", "qarpiz"));
//        users.add(new User("Nihad", "Asgarli", "F30 "));
//        users.add(new User("Aysun", "Allahverdi", "50 "));
//        for (User user : users) {
//
//              if("F30 ".equals(user.getUsername())){
//                System.out.println(user);
//            }
//        }
//        Set<User> set = new HashSet<User>();
//
//        set.add(new User("Nihad", "Asgarli", "F10 "));
//        set.add(new User("Nihad", "Asgarli", "F30 "));
//        set.add(new User("Aysun", "Allahverdi", "50 "));
//
//
//        for (User s : set) {
//            System.out.println(s);
//        }

        Map<User, String> users = new HashMap<>();
        users.put(new User("Nihad", "Asgarli", "F10"), "alma");
        users.put(new User("Idris", "Ehmedzade", "F30"), "armud");
        users.put(new User("Aysun", "Allaheri", "F40"), "heyva");

//        System.out.println(users.get(new User("Nihad", "Asgarli", "F10")));
// IKISIDE EQUAL VE HASHCODE DAN ASILI BIWEYDI BU YENI NE DEMEKDI mAP KEY VALUE ILE IWLIYIR
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "alma");
        map.put(2, "armud");
        map.put(3, "heyva");

        System.out.println(map.get(1));
// 

    }
}