import java.util.*;

class Player
{

	private String name;
	private int score;
	private int time;

	public Player(String name, int score,int time)
	{
		this.name = name;
		this.score=score;
		this.time = time;
	}


	public void set_Score(int s)
	{
		this.score=s;
	}
	public void set_Time(int t)
	{
		this.time=t;
	}
	public String get_PlayerName()
	{
		return name;
	}
	public int get_Score()
	{
		return score;
	}
	public int get_Time()
	{
		return time;
	}
}

class SortPlayers implements Comparator<Player>{

	public int compare(Player p1, Player p2) {
		// TODO Auto-generated method stub

		if(p1.get_Score()!=p2.get_Score())
			return p1.get_Score()>p2.get_Score()?-1:1;
		else if(p1.get_Time()!=p2.get_Time())
			return p1.get_Time()<p2.get_Time()?-1:1;
		else
			return p1.get_PlayerName().compareTo(p2.get_PlayerName());
	}


}
class Leaderboard {

	private static TreeSet<Player> players= new TreeSet<Player>(new SortPlayers());

	private static int searchPlayer(String name,int time)
	{
		for(Player p:players)
		{
			if(p.get_PlayerName().equals(name))
			{
				int t=p.get_Time()+time;
				int s=p.get_Score()+100;
				p.set_Score(s);
				p.set_Time(t);
				return 1;
			}

		}
		return -1;
	}


	public static void main(String args[] ) throws Exception {

		Scanner sc = new Scanner(System.in);
		int rank;

		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			String name=sc.next();
			int time=sc.nextInt();
			Player p= new Player(name,100,time);
			if(players.isEmpty())
			{

				players.add(p);
			}
			else
			{
				if(searchPlayer(name,time)!=1)
				{
					players.add(p);
				}
			}
		}

		rank=1;
		for(Player p:players)
		{
			System.out.println((rank++)+" "+p.get_PlayerName()+" "+p.get_Score()+" "+p.get_Time());
		}
	}
}
