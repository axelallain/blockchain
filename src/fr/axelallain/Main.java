package fr.axelallain;

public class Main {

    public static void main(String[] args) {

    	Blockchain blockchain = new Blockchain();

		System.out.println("Genesis block hash : " + blockchain.getBlockchain().get(0).getHash());

    	blockchain.addBlock(new Block("1", "18/04/22", "A sent 4 to B"));
		blockchain.addBlock(new Block("2", "18/04/22", "A sent 4 to B"));
    }
}