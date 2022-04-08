
    import javer_exercises.Monster;

    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Set;

    public class collections_lecture {

        public static void main(String[] args) {
            ArrayList<Monster> monsterList = new ArrayList<>();

            Monster orc = new Monster("Orc", 13, 15, 9);
            monsterList.add(orc);
            System.out.println(monsterList.size()); /// current size is 1 (similar to .length)

            Monster ogre = new Monster("Ogre", 11, 59, 13);
            monsterList.add(ogre);

            Monster blueDragon = new Monster("Blue Dragon", 19, 225, 23);
            monsterList.add(blueDragon);

            System.out.println(monsterList.size());  /// size now is 3
//
//            monsterList.remove(blueDragon); /// removing object
//            System.out.println(monsterList.size());  //// size now is 2
//
//            monsterList.remove(1); //// removing object
//            System.out.println(monsterList.size());  ///// size now is 1



//            for (int i = 0; i < monsterList.size(); i++) {
//                String name = monsterList.get(i).getName();
//                int damage = monsterList.get(i).getDamage();
//                System.out.println(name + "  "+ damage);
//            }

            for (Monster monster : monsterList) {
                String name = monster.getName();
                int damage = monster.getDamage();
                System.out.println(name + "  " + damage);
            }



            ArrayList<Integer> myNumbers = new ArrayList<>();
            myNumbers.add(42);
            myNumbers.add(53);

            System.out.println(myNumbers.get(1));




            ArrayList<Person> people = new ArrayList<>();

            Person personOne = new Person("Oscar");
            Person personTwo = new Person("James");
            Person personThree = new Person("Javier");

            people.add(personOne);
            people.add(personTwo);
            people.add(personThree);

            for (int i = 0; i < people.size(); i++) {
                System.out.println(people.get(i).getName());
            }


            HashMap<String, Integer> careerWins = new HashMap<>();
            careerWins.put("Gregg Popovich", 1341);
            careerWins.put("Don Nelson", 1335);
            careerWins.put("Lenny Wilkens", 1332);

            System.out.println(careerWins.get("Gregg Popovich"));
            System.out.println(careerWins);

            careerWins.replace("Gregg Popovich", 1342);
            System.out.println(careerWins);
            System.out.println(careerWins.get("Lenny Wilkens"));

            for (Map.Entry<String, Integer> careerWinsEntry : careerWins.entrySet()){
                System.out.println(careerWinsEntry.getKey() + " : " + careerWinsEntry.getValue());
            }


            Set<String> coachNames = careerWins.keySet();
            for (String coachName : coachNames) {
                System.out.println(coachName);
            }











        }

}
