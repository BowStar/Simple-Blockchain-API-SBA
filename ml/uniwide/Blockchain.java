package ml.uniwide;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Simple Blockchain API (SBA)
 * @author Noël Ollick
 * @version 1.0
 */

public class Blockchain {
	boolean allowToChangePreviousHash = true;
	
	private List<Integer> blockchain = new ArrayList<>();
	private int previousHash;
	
	private Object[] dataset;
	
	//add Block and set the previous Hash
	public int addBlock(Object[] dataset) {
		this.dataset = dataset;
		Integer[] hash = {previousHash, Arrays.hashCode(this.dataset)};
		previousHash = Arrays.hashCode(hash);
		blockchain.add(previousHash);
		return previousHash;
	}
	
	//set the hash of the Genesis Block
	public void setGenesisHash(int genesisHash) {
		if(allowToChangePreviousHash) {
			previousHash = genesisHash;
			blockchain.add(previousHash);
			allowToChangePreviousHash = false;
		}
	}
	
	//get the data from the previousHash
	public int getPreviousHash() {
		return previousHash;
	}
	
	//get the blockchain
	public List getList() {
		return blockchain;
	}
}
