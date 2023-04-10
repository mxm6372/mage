package mage.cards.u;

import mage.MageInt;
import mage.abilities.common.ActivateAsSorceryActivatedAbility;
import mage.abilities.common.ActivateIfConditionActivatedAbility;
import mage.abilities.condition.Condition;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.effects.common.ExileAndReturnTransformedSourceEffect;
import mage.abilities.keyword.TransformAbility;
import mage.abilities.common.SpellCastControllerTriggeredAbility;
import mage.abilities.effects.common.DamagePlayersEffect;
import mage.abilities.effects.OneShotEffect;
import mage.constants.SubType;
import mage.abilities.keyword.FirstStrikeAbility;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.TargetController;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.watchers.common.CastSpellLastTurnWatcher;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class Urabrask extends CardImpl
{

    public Urabrask(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{2}{R}{R}");

        this.subtype.add(SubType.PHYREXIAN);
        this.subtype.add(SubType.PRAETOR);
        this.addSuperType(SuperType.LEGENDARY);
        this.power = new MageInt(4);
        this.toughness = new MageInt(4);
        this.secondSideCardClazz = mage.cards.t.TheGreatWork.class;
        
        //First Strike
        this.addAbility(FirstStrikeAbility.getInstance());
        
        ability ability =  new SpellCastControllerTriggeredAbility(
                new DamagePlayersEffect(1, TargetController.OPPONENT),
                StaticFilters.FILTER_SPELL_AN_INSTANT_OR_SORCERY, false
        );
        
        //Add {R} to your mana pool
        ability.addEffect((new BasicManaEffect(Mana.RedMana(2))));

        //{R}: Transform Urabrask. Activate only as a sorcery
        //and only if you’ve cast three or more instant and/or sorcery spells this turn.
        this.addAbility(new TransformAbility());
        this.addAbility(new ActivateAsSorceryActivatedAbility
        		(
        				Zone.BATTLEFIELD,
        				new ExileAndReturnTransformedSourceEffect(Pronoun.HE), 
        				new ManaCostsImpl<>("{R}"), 
        				UrabraskCondition.instance
        		)
        	);
    }

    private Urabrask(final Urabrask card) {
        super(card);
    }

    @Override
    public Urabrask copy() {
        return new Urabrask(this);
    }
    
    enum UrabraskCondition implements Condition
    {
        instance;

        @Override
        public boolean apply(Game game, Ability source) {
            return game
                    .getState()
                    .getWatcher(CastSpellLastTurnWatcher.class)
                    .getAmountOfSpellsPlayerCastOnCurrentTurn(source.getControllerId()) >= 3;
        }

        @Override
        public String toString() {
            return "you've cast three or more spells this turn";
        }
    }
    
}
    