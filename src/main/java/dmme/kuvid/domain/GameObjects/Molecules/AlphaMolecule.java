package dmme.kuvid.domain.GameObjects.Molecules;

import dmme.kuvid.domain.GameObjects.*;
import dmme.kuvid.lib.types.MoleculeType;
import dmme.kuvid.lib.types.ObjectType;

public class AlphaMolecule extends Molecule{

	public AlphaMolecule(Position position, Position direction, boolean active, ObjectType type) {
		super(position, direction, active, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Collusion() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setMoleculeType() {
		// TODO Auto-generated method stub
		this.subtype=MoleculeType.ALPHA;
	}
	
	
	
	public void move() {
		this.setPattern(new ZigZagPatternStrategy());
		this.strategy.move(this, count);	
		this.count++;
		if(spinning) {
			this.spin = this.count/2;
			this.spin = this.spin % 4;	
		}
	}

	@Override
	public void setPosition(Position position) {
		// TODO Auto-generated method stub
		publishPropertyEvent("position",this.position,position);
		this.position = position;
	}
	

}
