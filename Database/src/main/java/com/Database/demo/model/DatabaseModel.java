package com.Database.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class DatabaseModel {
@Id

private int Sno;
private String Model;
private String Os;
private String RAM;
private String Storage;
private String cellular;
private String Camera;
private String Colour;
private int price;

public int getSno() {
	return Sno;
}
public void setSno(int sno) {
	Sno = sno;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getOs() {
	return Os;
}
public void setOs(String os) {
	Os = os;
}
public String getRAM() {
	return RAM;
}
public void setRAM(String rAM) {
	RAM = rAM;
}
public String getStorage() {
	return Storage;
}
public void setStorage(String storage) {
	Storage = storage;
}
public String getCellular() {
	return cellular;
}
public void setCellular(String cellular) {
	this.cellular = cellular;
}
public String getCamera() {
	return Camera;
}
public void setCamera(String camera) {
	Camera = camera;
}
public String getColour() {
	return Colour;
}
public void setColour(String colour) {
	Colour = colour;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}

}
