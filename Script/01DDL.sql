-- © 2K26 ❱──💀──❰ pat_mic ? code is life : life is code

DROP TABLE IF EXISTS Hormiga;
DROP TABLE IF EXISTS HormigaTipo;
DROP TABLE IF EXISTS Sexo;

CREATE TABLE HormigaTipo (
     IdHormigaTipo  INTEGER PRIMARY KEY AUTOINCREMENT     
    ,Nombre         VARCHAR(15) NOT NULL UNIQUE

    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE Sexo (
     IdSexo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,Nombre         VARCHAR(15) NOT NULL UNIQUE

    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE Hormiga (
     IdHormiga      INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdHormigaTipo  INTEGER NOT NULL REFERENCES HormigaTipo (IdHormigaTipo)
    ,IdSexo         INTEGER NOT NULL REFERENCES Sexo        (IdSexo)
    ,Vive           VARCHAR(1)  NOT NULL DEFAULT 'V'
    
    ,Estado         VARCHAR(1)  NOT NULL DEFAULT 'A'
    ,FechaCreacion  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica  DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
);

CREATE TABLE Catalogo (
     IdCatalogo         INTEGER PRIMARY KEY AUTOINCREMENT
    ,IdCatalogoPadre    INTEGER 
    ,Nombre             VARCHAR(20) NOT NULL  UNIQUE
    ,Detalle            VARCHAR(20)  
    
    ,Estado             VARCHAR(1) NOT NULL DEFAULT ('A')
    ,FechaCreacion      DATETIME NOT NULL  DEFAULT (datetime('now','localtime'))
    ,FechaModifica      DATETIME 
);