package ml.uniwide;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlockchainExample {
	
	public static void main (String [] args) {
		Blockchain block = new Blockchain();
		Object[] genesisHash = {1000};
		block.setGenesisHash(Arrays.hashCode(genesisHash));
		System.out.println(block.getPreviousHash());
		
		Object[] hash1 = {5100, "Hello World!"};
		System.out.println(block.addBlock(hash1));
		
		Object[] hash2 = {3201, "42"};
		System.out.println(block.addBlock(hash2));
		
		System.out.println(block.getList());
	}
}
