public class ChampionsLeague {
    public static void main(String[] args) {
        String[] teams = {
                "Roma",
                "Barcelona",
                "Juventus",
                "Bayern Munich",
                "Sevilla",
                "Real Madrid",
                "Manchester City",
                "Liverpool"
        };

        for (int i = 0; i < teams.length; i++) {


            for (int j = i+1; j < teams.length; j++) {

                System.out.println(teams[i] + "--" +teams[j]);

            }


        }
    }


}
