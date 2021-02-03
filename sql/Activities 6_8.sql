REM   Script: Session 03
REM   Activity 6_8

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

 INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

Select sum(purchase_amount) from orders group by order_no;

Select sum(purchase_amount) from orders;

Select avg(purchase_amount) from orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

    INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

Select sum(purchase_amount) from orders;

Select avg(purchase_amount) from orders;

Select max(purchase_amount) from orders;

Select min(purchase_amount) from orders;

Select distinct count(salesman_id)from orders;

Select count(distinct salesman_id)from orders;

Select max(purchase_amount) from orders group by customer_id;

Select max(purchase_amount),customer_id from orders group by customer_id;

select max(purchase_amount),salesman_id from orders where date is '2012-08-17'group by salesman_id;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

    INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

Select sum(purchase_amount) from orders;

Select avg(purchase_amount) from orders;

Select max(purchase_amount) from orders;

Select min(purchase_amount) from orders;

Select count(distinct salesman_id)from orders;

Select max(purchase_amount),customer_id from orders group by customer_id;

select max(purchase_amount),salesman_id from orders where date in ('2012-08-17')group by salesman_id;

select max(purchase_amount),salesman_id from orders where date in ('2012-08-17')group by salesman_id;

select max(purchase_amount),salesman_id from orders where order_date in ('2012-08-17')group by salesman_id;

select max(purchase_amount),salesman_id from orders where order_date =To_Date ('2012/08/17','YYYY/MM/DD')group by salesman_id;

Select max(purchase_amount),order_date,customer_id from orders where purchase_amount in [2030,3450,5760,6000] group by customer_id;

Select max(purchase_amount),order_date,customer_id from orders where purchase_amount = [2030,3450,5760,6000] group by customer_id;

Select max(purchase_amount),order_date,customer_id from orders  group by customer_id ,order_date having max(purchase_amount) IN(2030, 3450, 5760, 6000);

create table customers ( 
    customer_id int primary key, customer_name varchar(32), 
    city varchar(20), grade int, salesman_id int);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
(3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert into customers values  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001);

insert into customers value  
(3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001);

insert All  
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001), (3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002), (3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006), (3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values (3003, 'Jozy Altidor', 'Moscow', 200, 5007), (3001, 'Brad Guzan', 'London', 300, 5005);

insert All  
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001),  
into customers values (3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),  
into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

insert All  
into customers values (3002, 'Nick Rimando', 'New York', 100, 5001),  
into customers values (3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),  
into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

insert All  
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001),  
into customers values(3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),  
into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

insert All  
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001),  
into customers values(3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),  
into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

insert All  
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001),  
into customers values(3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),  
into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

select 1 from dual;

Insert All  
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001),  
into customers values(3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),  
into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

Insert All  
into customers values(3002, 'Nick Rimando', 'New York', 100, 5001),  
into customers values(3007, 'Brad Davis', 'New York', 200, 5001), 
into customers values(3005, 'Graham Zusi', 'California', 200, 5002),  
into customers values(3008, 'Julian Green', 'London', 300, 5002), 
into customers values(3004, 'Fabian Johnson', 'Paris', 300, 5006),  
into customers values(3009, 'Geoff Cameron', 'Berlin', 100, 5003), 
into customers values(3003, 'Jozy Altidor', 'Moscow', 200, 5007),  
into customers values(3001, 'Brad Guzan', 'London', 300, 5005);

select 1 from dual;

select*from customers;

