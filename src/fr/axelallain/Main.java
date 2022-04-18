package fr.axelallain;

public class Main {

    public static void main(String[] args) {

    	Block[] blockchain = { new Block("0", "", "", "") };

	    System.out.println("Genesis block hash : " + blockchain[0].getHash());

	    Block newBlock = new Block("1", "18/04/22", "A sent 4 to B", blockchain[0].getHash());
	    System.out.println("New block hash : " + newBlock.getHash());
    }
}