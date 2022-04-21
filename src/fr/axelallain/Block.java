package fr.axelallain;

import java.util.Arrays;

public class Block {
    private final String index;
    private final String timestamp;
    private final String data;
    private String previousHash;
    private String hash;
    private int nonce;

    public Block(String index, String timestamp, String data) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.hash = this.calculateHash();
        this.nonce = 0;
    }

    public String calculateHash() {
        String[] blockData = {index, timestamp, data, String.valueOf(previousHash), String.valueOf(nonce)};
        return org.apache.commons.codec.digest.DigestUtils.sha256Hex(Arrays.toString(blockData));
    }

    public void mineBlock(int difficulty) {
        String goal = "";
        for(int i = 0; i < difficulty; i++) {
            goal = goal + "0";
        }
        System.out.println("Start mining...");
        while(!this.hash.substring(0, difficulty).equals(goal)) {
            this.nonce++;
            this.hash = this.calculateHash();
            System.out.println(this.nonce);
        }

        System.out.println("Block mined : " + this.hash);
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }
}
