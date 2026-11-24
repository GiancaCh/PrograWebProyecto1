CREATE TABLE IF NOT EXISTS user (
    user_id     BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_name   VARCHAR(60) NOT NULL,
    username    VARCHAR(15) NOT NULL,
    email       VARCHAR(100) NOT NULL,
    user_type   VARCHAR(10) NOT NULL,

    CONSTRAINT uq_user_username UNIQUE (username),
    CONSTRAINT uq_user_email UNIQUE (email),
    CONSTRAINT chk_user_user_type CHECK (user_type IN ('ADMIN','REGULAR'))
);

CREATE TABLE IF NOT EXISTS product (
    product_id      BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_name    VARCHAR(30) NOT NULL,
    stock_quantity  INT NOT NULL,
    unit_price      INT NOT NULL,

    CONSTRAINT uq_product_name UNIQUE (product_name)
);

CREATE TABLE IF NOT EXISTS store_order (
   order_id            BIGINT AUTO_INCREMENT PRIMARY KEY,
   user_id             BIGINT NOT NULL,
   product_id          BIGINT NOT NULL,
   order_date          DATE NOT NULL,
   product_quantity    INT NOT NULL,
   order_status        VARCHAR(20) NOT NULL,

    CONSTRAINT fk_so_user FOREIGN KEY (user_id)
    REFERENCES user (user_id) ON DELETE CASCADE,
    CONSTRAINT fk_so_product FOREIGN KEY (product_id)
    REFERENCES product(product_id) ON DELETE CASCADE,
    CONSTRAINT chk_so_order_status CHECK (order_status IN ('NUEVO', 'EN_PREPARACION', 'ENTREGADO'))
);