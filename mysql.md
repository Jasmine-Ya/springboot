``springboot--mysql``

## 表 users
```
CREATE TABLE `users` (
	`id` INT (11) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR (255) DEFAULT NULL,
	`age` INT (11) DEFAULT NULL,
	PRIMARY KEY (`id`)
) ENGINE = INNODB DEFAULT CHARSET = utf8;
```

