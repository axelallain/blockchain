package fr.axelallain;

public class Main {

    public static void main(String[] args) {
	    Block newBlock = new Block("0", "timestamp", "data", "1234");
	    System.out.println(newBlock.getHash());
    }
}