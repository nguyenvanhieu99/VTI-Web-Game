use webe;
CREATE TABLE `user`(
	`userid` INT NOT NULL AUTO_INCREMENT,
    `username` VARCHAR(50) NOT NULL,
    `ENCRYTED_PASSWORD` VARCHAR(50) NOT NULL,
	`name` VARCHAR(50) NOT NULL,
    `phone` VARCHAR(50) NOT NULL,
    `address` INT NOT NULL,
    `roleid` INT NOT NULL ,
    PRIMARY KEY (`userid`)
    );
    
create table `role`(
	`roleid` int not null auto_increment,
    `rolename` varchar(50) not null,
    PRIMARY KEY (`roleid`)
);

create table `products`(
	`productid` int not null auto_increment,
    `code` VARCHAR(50) NOT NULL,
    `productname` VARCHAR(50) NOT NULL,
    `price` double precision not null,
    `categoryid` int not null ,
    `authorid` int not null,
    `description` varchar(50) not null,
     PRIMARY KEY (`productid`)
);

create table `author`(
	`authorid` int not null auto_increment,
    `authorname` varchar(50) not null,
    PRIMARY KEY (`authorid`)
);
create table `category`(
	`categoryid` int not null auto_increment,
    `categoryname` varchar(50) not null,
    PRIMARY KEY (`categoryid`)
);

create table `orders`(
	`orderid` int not null auto_increment,
    `state` int not null,
    `ORDER_DATE` datetime not null,
    `userid` int not null,
    PRIMARY KEY (`orderid`)
);
create table `orders_details`(
	`orderdetailId` int not null auto_increment,
    `orderid` int not null,
    `quantity` int DEFAULT NULL,
    `Cost` double DEFAULT NULL,
	`productid` int NOT NULL,
    PRIMARY KEY (`orderdetailId`)
);
ALTER TABLE `user` ADD CONSTRAINT `FK_user` FOREIGN KEY (roleid) REFERENCES `role`(roleid) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `products` ADD CONSTRAINT `FK_product1` FOREIGN KEY (categoryid) REFERENCES `category`(categoryid) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `products` ADD CONSTRAINT `FK_product2` FOREIGN KEY (authorid) REFERENCES `author`(authorid) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `orders` ADD CONSTRAINT `FK_orders` FOREIGN KEY (userid) REFERENCES `user`(userid) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `orders_details` ADD CONSTRAINT `FK_orders_details1` FOREIGN KEY (orderid) REFERENCES `orders`(orderid) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `orders_details` ADD CONSTRAINT `FK_orders_details2` FOREIGN KEY (productid) REFERENCES `products`(productid) ON DELETE CASCADE ON UPDATE CASCADE;


