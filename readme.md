# Bank Example
Used in SWD classes at KEA.    
Shows the way from the problem description over _Use Case Diagram_, _Use Cases_, _System Sequence Diagram_, _Noun List_, _Domain Model_, _Class Diagram_ to the actual _Java Code_. 

## Description
A customer opens a bank account in a bank.   
After opening the account the customer can withdraw, deposit and check his balance at any time he wants.    
The bank charges a fee of 10kr. for every withdraw a customer makes.    
The Customer can not withdraw more money than is on the account including the fee.    
The bank also has an interest rate of 8.5%, which is used for calculating a certain amount of interest on the amount deposited by the customer.    

## Use Case Diagram
Define the actor(s) and the possible _Use Cases_ from the Description above
![Use Case Diagram](https://github.com/dat16j/bank_example/blob/master/img/UseCaseDiagram.png)

## Use Cases
#### UC#1: Withdraw Money   
Actor: Customer   
Customer requests to withdraw money from his account and specifies the amount.    
The bank puts on a fee of 10 kr. when a withdrawal is made, so the customer gets the requested amount, and the fee is subducted on the remaining balance of the account. 

Alternative flow:   
The requested amount + fee is larger than the balance on the account   
Customer gets an error message that there is not enough money on the account.   
The balance on the account is displayed   

#### UC#2: Deposit Money
Actor: Customer    
The Customer requests to deposit money. The bank calculates the interest based on the interest rate and the amount just deposited, the interest and the amount is summed. The sum is then added to the account balance.

#### UC#3: Check Balance
Actor: Customer    
Customer requests to see the balance of his account.     
The account number and name of the customer together with the balance is displayed.    