# Postgres Commands

### Run the server
```
brew services start postgresql@15 #to start the services
brew services stop postgresql@15 #to stop the services
```
### Connecting to PostgreSQL
```
psql -h <host> -p <port> -U <user> -d <database_name>
``` 
> host: The hostname or IP address of your PostgreSQL server (e.g., localhost).

> port: The port number PostgreSQL is listening on (default is 5432).

>user: Your PostgreSQL username.

>database_name: The name of the database you want to connect to.
If you omit -h, -p, or -d, psql will use default values. 
After successful authentication, you'll be greeted with the psql prompt.

## Basic Commands
### Lists all databases on the server.
```
'\l' 
This is your first command to see what databases are available.
``` 
### Connects to a specific database.
```
\c my_database
```
### Lists all tables in the current database.
```
\dt
```
### Lists all database roles (users). 
```
\du
```
### Quits the psql client.
```
\q
```
### CREATE TABLE: Defines the structure of a new table.
```
CREATE TABLE products (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2),
    category_id INTEGER REFERENCES categories(id)
);
```
>This creates a products table with an auto-incrementing id,  
a required name, a price, and a foreign key category_id referencing  
a categories table.

### INSERT INTO: Adds new rows (records) to a table.
```
INSERT INTO products (name, price, category_id) VALUES ('Laptop', 1200.00, 1);
INSERT INTO products (name, price) VALUES ('Mouse', 25.00); -- category_id will be NULL

```
### SELECT: Retrieves data from one or more tables.

```
SELECT * FROM products; -- Selects all columns and rows
SELECT name, price FROM products WHERE price > 100; -- Selects specific columns and filters rows
SELECT p.name, c.name FROM products p JOIN categories c ON p.category_id = c.id; -- Joins tables
```
###  UPDATE: Modifies existing data in a table.
```
UPDATE products SET price = 1300 WHERE name = 'Laptop';
UPDATE products SET category_id = 2 WHERE name = 'Mouse';
```
