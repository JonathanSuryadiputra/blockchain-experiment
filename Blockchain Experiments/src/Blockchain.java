import java.util.Arrays;

public class Blockchain {

	public static void main(String[] args) {
		/*
		 Block - Previous Block Hash + Transactions
		 When they are chained together => Blockchain
		 */
		
		Transaction transaction1 = new Transaction("Jon", "Cary", 150L);
		Transaction transaction2 = new Transaction("May", "Parker", 150L);
		Transaction transaction3 = new Transaction("Lance", "Victor", 150L);
		
		Block genesis = new Block(0, Arrays.asList(transaction1, transaction2));
		System.out.println(genesis.hashCode());
		Block secondBlock = new Block(genesis.hashCode(), Arrays.asList(transaction3));
		System.out.println(secondBlock.hashCode());
		
	}

}
