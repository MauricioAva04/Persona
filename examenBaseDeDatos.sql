--1
	INSERT INTO cajeros(nom_aples)
	VALUES ('CAJERO 1'),('CAJERO 2'),('CAJERO 3');
	
	INSERT INTO maquinas_registradoras(piso)
	VALUES (1),(2),(3),(4),(1),(2);
	
	INSERT INTO productos(nombre, precio)
	VALUES ('Producto 1', 10.0),('Producto 2', 30.0),('Producto 3', 5.0);
	
	
	INSERT INTO venta(cajero, maquina, producto)
	VALUES ((SELECT cajero FROM cajeros order by random() limit 1),
			(SELECT maquina FROM maquinas_registradoras order by random() limit 1),
		   (SELECT producto FROM productos order by random() limit 1));


--2
	SELECT producto, count(producto) as ventas
	FROM venta
	group by producto
	order by ventas DESC;


--3
	SELECT c.nom_aples, p.nombre, p.precio, m.piso
	FROM venta v 
	INNER JOIN cajeros c on v.cajero = c.cajero
	INNER JOIN productos p on v.producto = p.producto
	INNER JOIN maquinas_registradoras m on v.maquina = m.maquina
	order by c.nom_aples;	


--4
	SELECT m.piso, sum(p.precio)
	FROM maquinas_registradoras m
	JOIN venta v on v.maquina = m.maquina
	JOIN productos p on v.producto = p.producto
	group by m.piso


--5
	SELECT c.cajero, c.nom_aples, sum(p.precio)
	FROM productos p join
	(cajeros c join venta v on v.cajero = c.cajero)
	on v.producto = p.producto
	group by c.cajero,  c.nom_aples
	
    
--6 
SELECT c.cajero, c.nom_aples FROM cajeros c
where c.cajero in 
(select v.cajero from venta v where v.maquina in
 (SELECT m.piso
	FROM maquinas_registradoras m
	JOIN venta v on v.maquina = m.maquina
	JOIN productos p on v.producto = p.producto
	group by m.piso
	having sum(p.precio) < 5000));