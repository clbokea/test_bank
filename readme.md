# Bank Example
An example of Object Oriented Analysis, Design and Programming.   
Shows the way from the _problem description_ over [_Use Case Diagram_](#use-case-diagram), [_Use Cases_](#use-cases), 
[_System Sequence Diagram_](#system-sequence-diagram), [_Noun List_](#noun-list), [_Domain Model_](#domain-model), 
[_Verb List_](#verb-list), [_Class Diagram_](#class-diagram) to the actual _Java Code_.    

This is a step by step Technique for getting from a well written _Use Case_ to the actual _Code_ without 
"guessing", "thinking" or just creating a class out of the blue. If a Use Case is well written it will decide 
exactly what classes, attribuetes and methods will apear in the final code.   

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
Write the above use cases in brief, casual or fully dressed versions.   

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

## System Sequence Diagram 
A graphical version of a Use Case is called a System Sequence Diagram and will look like this.




## Noun List
From the Use Cases you should identify all the _Nouns_. These nouns are the objects and 
attributes of the object in a Domain Model.

Customer, Money, 
Account, Amount, 
Bank, Fee, Balance, 
Error message, 
interest, interest rate, Account Number, 
Customer Name, 


## Domain Model

![Domain Model](https://github.com/dat16j/bank_example/blob/master/img/DomainModel.png)


## Verb List
These words are, like the Noun List, found in the Use Cases. They are the methods in the Classes   
Verbs = Actions = Methods   

Withdraw   
get fee   
Deposit   
Calculate interest   
Add to balance   
Check Balance   

## Class Methods

<table>
<tr>
<td><img src="https://github.com/dat16j/bank_example/blob/master/img/MethodAccont.png"></td>
<td><h3>withdraw()</h3> 
<h3>deposit()</h3>
<h3>checkBalance()</h3> 
</td>
<td><img src="https://github.com/dat16j/bank_example/blob/master/img/MethodCustomer.png"></td>
</tr>
</table>

## Class Diagram
![Class Diagram](https://github.com/dat16j/bank_example/blob/master/img/ClassDiagram.png)



## Class Relations

### Assosiation

### Aggregation

### Composition
