CREATE DATABASE IF NOT EXISTS Crm_turnero;
GO
USE Crm_turnero;
GO

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
CREATE TABLE Paciente(
	IDPaciente INT,
	Turno INT NOT NULL,
	Dni INT NOT NULL,
	CONSTRAINT PK_Paciente PRIMARY KEY(IDPaciente),
	CONSTRAINT FK_Paciente_turno Turno FOREIGN KEY REFERENCES Turno(IDTurno),
	CONSTRAINT FK_Paciente_usuario Dni FOREIGN KEY REFERENCES Usuario(Dni)
)

CREATE TABLE Turno(
	IDTurno INT,
	Fecha DATETIME NOT NULL,
	Disponible BOOLEAN,
	MedicoID INT NOT NULL,
	PacienteID INT NOT NULL,
	EsPacienteAca BOOLEAN,
	CONSTRAINT PK_Turno_id PRIMARY KEY(IDTurno),
	CONSTRAINT FK_Turno_medico MedicoID FOREIGN KEY REFERENCES Medicos(MedicoID),
	CONSTRAINT FK_Turno_Usuario PacienteID FOREIGN KEY REFERENCES Usuario(Dni)
);
CREATE TABLE Especialidades(
	IDEspecialidad INT,
	MedicoID INT NOT NULL,
	Especialidad VARCHAR(30) NOT NULL
);
CREATE TABLE Especialista(
	Nombre VARCHAR(30) NOT NULL,
	Apellido VARCHAR(30) NOT NULL,
	Especialidades INT,
	IDTurno INT,
	CONSTRAINT FK_Especialista_turno IDTurno FOREIGN KEY REFERENCES Turno(IDTurno),
	CONSTRAINT FK_Especialidades_especialidad FOREIGN KEY REFERENCES Especialidades(IDEspecialidad)
);


