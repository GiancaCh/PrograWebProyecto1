--Usuarios
INSERT IGNORE INTO user (user_name, username, email, user_type)
VALUES ("Jefferson Gómez Fonseca", "Jeff_gf", "jeffersongf@gmail.com", "ADMIN");

INSERT IGNORE INTO user (user_name, username, email, user_type)
VALUES ("Giancarlo Chacón Chavarría", "Gian_cc", "giancc@gmail.com", "ADMIN");


--Productos
INSERT IGNORE INTO product (product_name, stock_quantity, unit_price) VALUES
   ('Manzana roja', 50, 300),
   ('Banano', 80, 100),
   ('Refresco de cola (600 ml)', 40, 950),
   ('Jugo naranja caja (250 ml)', 35, 450),
   ('Botella de agua (600 ml)', 60, 700),
   ('Café frío en lata / botella', 25, 1100),
   ('Papas tostadas (paq. indiv.)', 45, 650),
   ('Galletas dulces rellenas (paq)', 40, 400),
   ('Barra de chocolate', 50, 600),
   ('Sopa instantánea en vaso', 30, 850),
   ('Pan cuadrado / bollito de pan', 20, 1200),
   ('Leche en caja (1 litro)', 25, 1050),
   ('Huevo', 100, 150),
   ('Atún en lata', 35, 1150),
   ('Helado de paleta', 30, 550);