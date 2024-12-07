CREATE DATABASE IF NOT EXISTS Crm_turnero;

USE Crm_turnero;


CREATE TABLE Usuario(
	Dni INT NOT NULL,
	Nombre VARCHAR(30) NOT NULL,
	Apellido VARCHAR(30) NOT NULL,
	Email VARCHAR(50) NOT NULL UNIQUE,
	Password VARCHAR(100) NOT NULL,
	Rol VARCHAR(20),
	CONSTRAINT PK_Usuario_Dni PRIMARY KEY(Dni)
);
CREATE TABLE Medicos(
	MedicoID INT NOT NULL,
	Nombre VARCHAR(30) NOT NULL,
	Apellido VARCHAR(30) NOT NULL,
	CONSTRAINT PK_Medicos_id PRIMARY KEY(MedicoID)
);

CREATE TABLE Turno(
	IDTurno INT,
	Fecha DATETIME NOT NULL,
	Disponible BOOLEAN,
	MedicoID INT NOT NULL,
	PacienteID INT NOT NULL,
	EsPacienteAca BOOLEAN,
	CONSTRAINT PK_Turno_id PRIMARY KEY(IDTurno),
	CONSTRAINT FK_Turno_medico FOREIGN KEY (MedicoID) REFERENCES Medicos(MedicoID),
	CONSTRAINT FK_Turno_Usuario FOREIGN KEY (PacienteID) REFERENCES Usuario(Dni)
);

CREATE TABLE Paciente(
	IDPaciente INT,
	Turno INT NOT NULL,
	Dni INT NOT NULL,
	CONSTRAINT PK_Paciente PRIMARY KEY(IDPaciente),
	CONSTRAINT FK_Paciente_turno FOREIGN KEY (Turno) REFERENCES Turno(IDTurno),
	CONSTRAINT FK_Paciente_usuario FOREIGN KEY (Dni) REFERENCES Usuario(Dni)
);


CREATE TABLE Especialidades(
	IDEspecialidad INT,
	MedicoID INT NOT NULL,
	Especialidad VARCHAR(30) NOT NULL,
    CONSTRAINT FK_Especialidades PRIMARY KEY (IDEspecialidad)
);
CREATE TABLE Especialista(
	IDEspecialista INT PRIMARY KEY,
	Nombre VARCHAR(30) NOT NULL,
	Apellido VARCHAR(30) NOT NULL,
	Especialidades INT,
	IDTurno INT,
	CONSTRAINT FK_Especialista_turno FOREIGN KEY (IDTurno) REFERENCES Turno(IDTurno),
	CONSTRAINT FK_Especialidades_especialidad FOREIGN KEY (Especialidades) REFERENCES Especialidades(IDEspecialidad)
);


