package xyz.pixelatedw.MineMineNoMi3.abilities;

import net.minecraft.entity.player.EntityPlayer;
import xyz.pixelatedw.MineMineNoMi3.abilities.BariAbilities.Barrier;
import xyz.pixelatedw.MineMineNoMi3.abilities.BariAbilities.BarrierBall;
import xyz.pixelatedw.MineMineNoMi3.abilities.BariAbilities.BarrierCrash;
import xyz.pixelatedw.MineMineNoMi3.api.abilities.Ability;
import xyz.pixelatedw.MineMineNoMi3.entities.abilityprojectiles.GoeProjectiles;
import xyz.pixelatedw.MineMineNoMi3.lists.ListAttributes;

public class GoeAbilities 
{
	public static Ability[] abilitiesArray = new Ability[] {new Todoroki()};
	
	
	public static class Todoroki extends Ability
	{
		public Todoroki() 
		{
			super(ListAttributes.TODOROKI); 
		}
		
		public void use(EntityPlayer player)
		{
			this.projectile = new GoeProjectiles.Todoroki(player.worldObj, player, attr);
			super.use(player);
		} 
	}
}
