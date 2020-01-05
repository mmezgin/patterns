package _MVC;

public class animalController {
	
	private animalView view;
	private animalModel model;
	 
	public animalController(animalModel model,animalView view) {
		this.model=model;
		this.view=view;
	}
	public void setAnimalName(String name) {
		model.setName(name);
	}
	public String getName() {
		return model.getName();
	}
	public void setID(int id) {
		model.setID(id);
	}
	public int getID() {
		return model.getID();
	}
	public void updateView() {
		view.displayAnimalInfo(model.getID(), model.getName());
	}

}
