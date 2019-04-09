CREATE DATABASE IF NOT EXISTS servletdb CHARACTER SET `utf8mb4` COLLATE `utf8mb4_general_ci`;

GRANT ALL PRIVILEGES ON servletdb.* TO servletdb@localhost IDENTIFIED BY '123456';

FLUSH PRIVILEGES;

CREATE TABLE `tusers` (
  `id` int(11) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `sex` varchar(50) NOT NULL,
  `province` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- 转储表的索引
--

--
-- 表的索引 `tusers`
--
ALTER TABLE `tusers`
  ADD PRIMARY KEY (`id`);

--
-- 在导出的表使用AUTO_INCREMENT
--

--
-- 使用表AUTO_INCREMENT `tusers`
--
ALTER TABLE `tusers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
  
COMMIT;