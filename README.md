# Tech
- Spring boot
- Dubbo
- Mybatis

# How to run
## Prerequisite
- ```sh
  mysqld
  mysql -uroot -p
  12345678
  ```
- run init.sql

## Run
- ```sh 
  mvn clean install
  cd inventory/ 
  mvn mybatis-generator:generate
  mvn sprint-boot:run
  cd ../sales-order/ 
  mvn mybatis-generator:generate
  mvn sprint-boot:run
  ```
- visit localhost:9001/getInventory and check log "getInventory"
- visit localhost:9001/SalesOrders
- visit localhost:9002/Inventorys