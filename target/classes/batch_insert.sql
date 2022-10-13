CREATE TABLE `user`
(
    `id`       int(11) unsigned NOT NULL AUTO_INCREMENT,
    `username` varchar(255) DEFAULT NULL,
    `address`  varchar(255) DEFAULT NULL,
    `password` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;


CREATE TABLE `user_big`
(
    `id`       int(11) unsigned NOT NULL AUTO_INCREMENT,
    `username` varchar(255) DEFAULT NULL,
    `address`  varchar(255) DEFAULT NULL,
    `password` varchar(255) DEFAULT NULL,
    `name1`    varchar(255) DEFAULT NULL,
    `name2`    varchar(255) DEFAULT NULL,
    `name3`    varchar(255) DEFAULT NULL,
    `name4`    varchar(255) DEFAULT NULL,
    `name5`    varchar(255) DEFAULT NULL,
    `name6`    varchar(255) DEFAULT NULL,
    `name7`    varchar(255) DEFAULT NULL,
    `name8`    varchar(255) DEFAULT NULL,
    `name9`    varchar(255) DEFAULT NULL,
    `name10`   varchar(255) DEFAULT NULL,
    `name11`   varchar(255) DEFAULT NULL,
    `name12`   varchar(255) DEFAULT NULL,
    `name13`   varchar(255) DEFAULT NULL,
    `name14`   varchar(255) DEFAULT NULL,
    `name15`   varchar(255) DEFAULT NULL,
    `name16`   varchar(255) DEFAULT NULL,
    `name17`   varchar(255) DEFAULT NULL,
    `name18`   varchar(255) DEFAULT NULL,
    `name19`   varchar(255) DEFAULT NULL,
    `name20`   varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;