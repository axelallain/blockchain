package fr.axelallain;

import java.util.ArrayList;
import java.util.List;

public class Blockchain {

    private final List<Block> blockchain = new ArrayList<Block>();
    private final int difficulty;

    public Blockchain() {
        this.blockchain.add(this.createGenesisBlock());
        this.difficulty = 4;
    }

    private Block createGenesisBlock() {
        return new Block("0", "21/04/22", "Genesis block");
    }

    private Block getLatestBlock() {
        return this.blockchain.get(blockchain.size() - 1);
    }

    public void addBlock(Block newBlock) {
        newBlock.setPreviousHash(this.getLatestBlock().getHash());
        newBlock.mineBlock(this.difficulty);
        this.blockchain.add(newBlock);
    }

    public List<Block> getBlockchain() {
        return blockchain;
    }
}
