/*CREATE TABLE libro (
    codLib INT AUTO_INCREMENT PRIMARY KEY,
    ISBN CHAR(13) NOT NULL UNIQUE,
    titulo VARCHAR(255) NOT NULL UNIQUE,
    autor VARCHAR(255) DEFAULT 'anonimo',
    paginas SMALLINT NOT NULL CHECK(paginas > 0),
    argumento TEXT
);*/
/*
INSERT INTO libro 
VALUES (1,'sinetknto13sf','Elantris','Brandon Sanderson',785,NULL);

INSERT INTO libro 
VALUES (2,'snaskento13sf','Don Quijote de la Mancha','Miguel de Cervantes',326,NULL);*/

SELECT * FROM libro;
/*
INSERT INTO libro (ISBN,titulo,autor,paginas,argumento)
VALUES ('snasebnto13sf','Don de la Mancha','Miguel de Cervantes',326,NULL);*/
/*
INSERT INTO libro (ISBN,titulo,autor,paginas,argumento)
VALUES 
	('snaerento13sf','Don ','Miguel de Cervantes',326,NULL),
    ('snaskentt13sf','titulo','Miguel',316,NULL);*/
    