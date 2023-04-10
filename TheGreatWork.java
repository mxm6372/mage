package mage.cards.t;

import mage.abilities.common.SagaAbility;
import mage.abilities.effects.common.CreateTokenEffect;
import mage.abilities.effects.common.ExileSagaAndReturnTransformedEffect;
import mage.abilities.effects.common.DamageAllControlledTargetEffect;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.keyword.TransformAbility;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.ExileSpellEffect;
import mage.cards.*;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SagaChapter;
import mage.constants.SubType;
import mage.game.permanent.token.TreasureToken;

import java.util.UUID;
public final class TheGreatWork extends CardImpl
{
	public TheGreatWork(UUID ownerId, CardSetInfo setInfo)
	{
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT},"");
        
        this.subtype.add(SubType.SAGA);
        this.secondSideCardClazz = mage.cards.u.Urabrask.class;
        
        // (As this Saga enters and after your draw step, add a lore counter.)
        SagaAbility sagaAbility = new SagaAbility(this);
        
        //I — The Great Work deals 3 damage to target opponent and each creature they control.
        Effects effects1 = new Effects();
        effects1.add(new DamageTargetEffect(3));
        effects1.addTarget(new TargetOpponent());
        effects1.add(new DamageAllControlledTargetEffect(3, new FilterCreaturePermanent())
                .setText("and each creature that player controls"));
        
        sagaAbility.addChapterEffect(this, SagaChapter.CHAPTER_I, effects1);

        //II — Create three Treasure tokens.
        sagaAbility.addChapterEffect(this, SagaChapter.CHAPTER_II, new CreateTokenEffect(new TreasureToken(), 3));
	
		// III -- Until end of turn, you may cast instant and sorcery spells from any graveyard. If a spell cast this way would be put into a graveyard, exile it instead. 
        //Exile The Great Work, then return it to the battlefield (front face up).
		
        
        this.addAbility(new TransformAbility());
		sagaAbility.addChapterEffect(this, SagaChapter.CHAPTER_III, new ExileSagaAndReturnTransformedEffect());
    
    	this.addAbility(sagaAbility);
	}
	
    private TheGreatWork(final TheGreatWork card) {
        super(card);
    }
    
	@Override
	public TheGreatWork copy() {
        return new TheGreatWork(this);
    }
}
