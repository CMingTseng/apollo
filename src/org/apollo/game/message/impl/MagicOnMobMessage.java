package org.apollo.game.message.impl;

import org.apollo.game.message.Message;
import org.apollo.game.model.entity.Entity;

/**
 * A {@link Message} sent by the client when a Player uses a magic spell on a Mob.
 *
 * @author Stuart
 */
public abstract class MagicOnMobMessage extends Message {

	/**
	 * The type of the Mob.
	 */
	private final Entity.EntityType type;

	/**
	 * The index of the Mob.
	 */
	private final int index;

	/**
	 * The spell if used.
	 */
	private final int spellId;

	/**
	 * Creates the MagicOnMobMessage.
	 *
	 * @param type The Mob type.
	 * @param index The Mob index.
	 * @param spellId The spell id.
	 */
	public MagicOnMobMessage(Entity.EntityType type, int index, int spellId) {
		this.type = type;
		this.index = index;
		this.spellId = spellId;
	}

	/**
	 * Gets the type of the Mob the spell is being used on.
	 *
	 * @return The Mob type.
	 */
	public Entity.EntityType getType() {
		return type;
	}

	/**
	 * Gets the index of the Mob the spell is being used on.
	 *
	 * @return The Mob index.
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * Gets the spell id that is being used.
	 *
	 * @return The spell id.
	 */
	public int getSpellId() {
		return spellId;
	}

}