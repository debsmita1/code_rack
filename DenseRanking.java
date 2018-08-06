/*
 * The game uses Dense Ranking, so its leaderboard works like this:

 The player with the highest score is ranked number on the leaderboard.
 Players who have equal scores receive the same ranking number, and the next player(s) receive the immediately following ranking number.
 */

import java.io.*;
import java.util.*;

class Rank_Card{
	int rank;
	int score;

	public Rank_Card(int score,int rank)
	{
		this.rank=rank;
		this.score=score;
	}

	public int get_Score()
	{
		return  score;
	}

	public int get_Rank()
	{
		return rank;
	}
}
public class DenseRanking {
	private static ArrayList<Rank_Card> scoresSet= new ArrayList<Rank_Card>();
	// Complete the climbingLeaderboard function below.
	static int[] climbingLeaderboard(int[] scores, int[] alice) {

		int [] result= new int [alice.length];
		int temp=scores[0];
		int r=1;
		Rank_Card rc= new Rank_Card(temp,r);
		scoresSet.add(rc);
		for(int i=1;i<scores.length;i++)
		{
			if(scores[i]<temp)
			{
				temp=scores[i];
				r++;
				rc= new Rank_Card(temp,r);
				scoresSet.add(rc);
			}

		}


		int index=scoresSet.size()-1;
		for(int i=0;i<alice.length;i++)
		{
			while(index>=0)
			{
				if(alice[i]==scoresSet.get(index).get_Score())
				{
					result[i]=scoresSet.get(index).get_Rank();
					break;
				}
				else if(alice[i]<scoresSet.get(index).get_Score())
				{
					result[i]=scoresSet.get(index).get_Rank()+1;
					break;
				}
				else
					index--;

			}
			if(index<0)
				result[i]=scoresSet.get(0).get_Rank();
		}
		return result;

	}


	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int n=sc.nextInt();
		int scores[]=new int[n];
		for(int i=0;i<n;i++)
			scores[i]=sc.nextInt();
		int m=sc.nextInt();
		int alice[]= new int[m];
		for(int i=0;i<m;i++)
			alice[i]=sc.nextInt();
		int result[]=climbingLeaderboard(scores, alice);
		for(int i=0;i<result.length;i++)
		{
			System.out.println(result[i]);
		}
	}
}

