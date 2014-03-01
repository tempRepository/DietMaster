package pl.jerzy.dietmaster2;

public class FoodTypeQuantity {
float dairyQuantity;
float fruitQuantity;
float grainQuantity;
float meatQuantity;
float oilQuantity;
float sweetQuantity;
float vegetableQuantity;
float waterQuantity;

public FoodTypeQuantity()
{
	dairyQuantity=2;
	fruitQuantity=3;
	grainQuantity=1;
	meatQuantity=2;
	oilQuantity=3;
	sweetQuantity=2;
	vegetableQuantity=1;
	waterQuantity=1;
}

public float getAllTypesQuantity()
{
	return dairyQuantity+fruitQuantity+grainQuantity+meatQuantity+oilQuantity+sweetQuantity+vegetableQuantity+waterQuantity;
}

public float getDairyQuantity() {
	return dairyQuantity;
}
public void setDairyQuantity(float dairyQuantity) {
	this.dairyQuantity = dairyQuantity;
}
public float getFruitQuantity() {
	return fruitQuantity;
}
public void setFruitQuantity(float fruitQuantity) {
	this.fruitQuantity = fruitQuantity;
}
public float getGrainQuantity() {
	return grainQuantity;
}
public void setGrainQuantity(float grainQuantity) {
	this.grainQuantity = grainQuantity;
}
public float getMeatQuantity() {
	return meatQuantity;
}
public void setMeatQuantity(float meatQuantity) {
	this.meatQuantity = meatQuantity;
}
public float getOilQuantity() {
	return oilQuantity;
}
public void setOilQuantity(float oilQuantity) {
	this.oilQuantity = oilQuantity;
}
public float getSweetQuantity() {
	return sweetQuantity;
}
public void setSweetQuantity(float sweetQuantity) {
	this.sweetQuantity = sweetQuantity;
}
public float getVegetableQuantity() {
	return vegetableQuantity;
}
public void setVegetableQuantity(float vegetableQuantity) {
	this.vegetableQuantity = vegetableQuantity;
}
public float getWaterQuantity() {
	return waterQuantity;
}
public void setWaterQuantity(float waterQuantity) {
	this.waterQuantity = waterQuantity;
}





}
