package jp04;

public enum BloodType_e {
	A, B, O, AB;
	
	public boolean canGiveTo(BloodType_e recipient) {
		if (this == recipient) return true;
		if (this == O) return true;
		if (recipient == AB) return true;
		return false;
	}

}
