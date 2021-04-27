import java.util.List;

public class Block {
	private int prevHash;
	private List<Transaction> transactions;
	
	public Block(int prevHash, List<Transaction> transactions) {
		super();
		this.prevHash = prevHash;
		this.transactions = transactions;
	}
	
	public int getPrevHash() {
		return prevHash;
	}
	public void setPrevHash(int prevHash) {
		this.prevHash = prevHash;
	}
	public List<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + prevHash;
		result = prime * result + ((transactions == null) ? 0 : transactions.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Block other = (Block) obj;
		if (prevHash != other.prevHash)
			return false;
		if (transactions == null) {
			if (other.transactions != null)
				return false;
		} else if (!transactions.equals(other.transactions))
			return false;
		return true;
	}
}
