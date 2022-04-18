package fr.axelallain;

public class Main {

    public static void main(String[] args) {

	    Block genesisBlock = new Block("0", "", "", "");
	    System.out.println("Genesis block hash : " + genesisBlock.getHash());

	    Block newBlock = new Block("1", "18/04/22", "A sent 4 to B", genesisBlock.getHash());
		System.out.println("New block hash : " + newBlock.getHash());

    }
}