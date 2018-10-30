package edu.school.domino;

public class DominoTile {

	int left;
	int right;

	public void setLeft(int value) {
		if (value < 0) {
			value *= -1;
		}
		this.left = value;
	}

	public void setRight(int value) {
		if (value < 0) {
			value *= -1;
		}
		this.right = value;
	}

	public int getLeft() {
		return left;
	}

	public int getRight() {
		return right;
	}

	public DominoTile() {
		setLeft(0);
		setRight(0);
	}

	public DominoTile(int left, int right) {
		setLeft(left);
		setRight(right);
	}

	public DominoTile(DominoTile d) {
		setLeft(d.left);
		setRight(d.right);
	}

	public void swap(int left, int right) {
		int help = left;
		left = right;
		right = help;
	}
	public String firstLineOf(int i){
		if(i==1||i==0) {
			return "      ";
		}
		if(i==2||i==3) {
			return "*    ";
		}
		if(i==4||i==5) {
			return "*   * ";
		}
		if(i==6) {
			return "* * * ";
		}
		return null;
	}
	public String secondLineOf(int i){
		if(i==1||i==3||i==5) {
			return "  *   ";
		}
		if(i==2||i==4||i==6||i==0) {
			return "      ";
		}
		
		return null;
	}
	public String thirdLineOf(int i){
		if(i==1||i==0) {
			return "      ";
		}
		if(i==2||i==3) {
			return "    * ";
		}
		if(i==4||i==5) {
			return "*   * ";
		}
		if(i==6) {
			return "* * * ";
		}
		return null;
	}
	public String toString() {
		String description ="______________\n";
		description+="|";
		description+=firstLineOf(left);
		description+="|";
		description+=firstLineOf(right);
		description+="|";
		description+="\n";
		description+="|";
		description+=secondLineOf(left);
		description+="|";
		description+=secondLineOf(right);
		description+="|";
		description+="\n";
		description+="|";
		description+=thirdLineOf(left);
		description+="|";
		description+=thirdLineOf(right);
		description+="|";
		description+="\n";

		description+="______________";
		return description;
	}

}
