# Simple Blockchain API (SBA)
This is a simple blockchain API for Java. It's very basic and easy to use.

## How to use it
*1. create a genesis Block*
After defining the Blockchain.java class (Blockchain block = new Blockchain();), you can create your first Block: the genesis Block.
You can do that with the method .setGenesisHash(*Hash of the genesis Block*);

*2. create a new Block*
To create a new block, you can use the newBlock(*Object[] array*) method.

*3. getting the blockchain list*
To get the list of your Blockchain, you can use .getList().
