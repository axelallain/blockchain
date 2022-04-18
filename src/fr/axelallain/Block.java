package fr.axelallain;

import java.util.Arrays;

public class Block {
    private final String index;
    private final String timestamp;
    private final String data;
    private final String previousHash;
    private final String hash;

    public Block(String index, String timestamp, String data, String previousHash) {
        this.index = index;
        this.timestamp = timestamp;
        this.data = data;
        this.previousHash = previousHash;
        this.hash = this.calculateHash();
    }

    public String calculateHash() {
        String[] blockData = {index, timestamp, data, String.valueOf(previousHash)};
        return org.apache.commons.codec.digest.DigestUtils.sha256Hex(Arrays.toString(blockData));
    }

    public String getHash() {
        return hash;
    }
}
