package dmme.kuvid.domain.GameObjects.ReactionBlocker;

import dmme.kuvid.domain.GameObjects.*;
import dmme.kuvid.lib.types.ObjectType;

public abstract class ReactionBlocker extends GameObject{
	
	public ObjectType type = ObjectType.REACTION_BLOCKER;

	public ReactionBlocker(Position position, Position direction, boolean active, ObjectType type) {
		super(position, direction, active, type);
		// TODO Auto-generated constructor stub
	}
}