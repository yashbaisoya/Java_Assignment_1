import java.util.Scanner;

class Team {
    protected String name;
    protected int matchesPlayed;
    protected int wins;
    protected int draws;

    public Team(String name, int matchesPlayed, int wins, int draws) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.wins = wins;
        this.draws = draws;
    }

    public int calculatePoints() {
        return 0;
    }
}

class CricketTeam extends Team {
    public CricketTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 2) + (draws * 1);
    }
}

class FootballTeam extends Team {
    public FootballTeam(String name, int matchesPlayed, int wins, int draws) {
        super(name, matchesPlayed, wins, draws);
    }

    @Override
    public int calculatePoints() {
        return (wins * 3) + (draws * 1);
    }
}

public class SportsMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) break;
            String[] p = line.split(",");
            String type = p[0].trim();
            String name = p[1].trim();
            int m = Integer.parseInt(p[2].trim());
            int w = Integer.parseInt(p[3].trim());
            int d = Integer.parseInt(p[4].trim());

            if (type.equalsIgnoreCase("Cricket")) {
                CricketTeam ct = new CricketTeam(name, m, w, d);
                System.out.println("Team: " + ct.name + " (Cricket) Points: " + ct.calculatePoints());
            } else if (type.equalsIgnoreCase("Football")) {
                FootballTeam ft = new FootballTeam(name, m, w, d);
                System.out.println("Team: " + ft.name + " (Football) Points: " + ft.calculatePoints());
            }
        }
    }
}