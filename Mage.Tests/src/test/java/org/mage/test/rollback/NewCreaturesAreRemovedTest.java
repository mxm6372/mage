
package org.mage.test.rollback;

import mage.constants.PhaseStep;
import mage.constants.Zone;
import org.junit.Test;
import org.mage.test.serverside.base.CardTestPlayerBase;

/**
 * @author LevelX2
 */
public class NewCreaturesAreRemovedTest extends CardTestPlayerBase {

    /**
     * I was playing with a Tamiyo's Journal in the battlefield.
     * <p>
     * During my turn I rollbacked. The clue generated by Tamiyo's Journal
     * stayed on battlefield and when my turn started again, it re-investigated
     * for another one.
     */
    @Test
    public void testTamiyosJournal() {
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 5);
        // At the beginning of your upkeep, investigate (Create a colorless Clue artifact token onto the battlefield with \"{2}, Sacrifice this artifact: Draw a card.\").
        // {T}, Sacrifice three Clues: Search your library for a card and put that card into your hand. Then shuffle your library.
        addCard(Zone.HAND, playerA, "Tamiyo's Journal"); // Artifact {5}
        addCard(Zone.BATTLEFIELD, playerA, "Silvercoat Lion", 3);
        addCard(Zone.BATTLEFIELD, playerB, "Pillarfield Ox", 3);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Tamiyo's Journal");

        // As Port Town enters the battlefield, you may reveal a Plains or Island card from your hand. If you don't, Port Town enters the battlefield tapped.
        // {T}: Add {W} or {U}.
        addCard(Zone.HAND, playerA, "Port Town"); // Land
        addCard(Zone.HAND, playerA, "Island"); // Land

        attack(2, playerB, "Pillarfield Ox");

        attack(3, playerA, "Silvercoat Lion");

        attack(4, playerB, "Pillarfield Ox");

        attack(5, playerA, "Silvercoat Lion");

        attack(6, playerB, "Pillarfield Ox");

        playLand(7, PhaseStep.PRECOMBAT_MAIN, playerA, "Port Town");
        attack(7, playerA, "Silvercoat Lion");

        setStopAt(7, PhaseStep.POSTCOMBAT_MAIN);
        execute();

        assertLife(playerA, 14);
        assertLife(playerB, 14);
        assertPermanentCount(playerA, "Port Town", 1);
        assertTapped("Port Town", false);
        assertPermanentCount(playerA, "Clue", 3);

    }

    @Test
    public void testTamiyosJournalAndRollback() {
        addCard(Zone.BATTLEFIELD, playerA, "Swamp", 5);
        // At the beginning of your upkeep, investigate (Create a colorless Clue artifact token onto the battlefield with \"{2}, Sacrifice this artifact: Draw a card.\").
        // {T}, Sacrifice three Clues: Search your library for a card and put that card into your hand. Then shuffle your library.
        addCard(Zone.HAND, playerA, "Tamiyo's Journal"); // Artifact {5}

        // As Port Town enters the battlefield, you may reveal a Plains or Island card from your hand. If you don't, Port Town enters the battlefield tapped.
        // {T}: Add {W} or {U}.
        addCard(Zone.HAND, playerA, "Port Town"); // Land
        addCard(Zone.HAND, playerA, "Island"); // Land

        addCard(Zone.BATTLEFIELD, playerA, "Silvercoat Lion", 3);
        addCard(Zone.BATTLEFIELD, playerB, "Pillarfield Ox", 3);

        castSpell(1, PhaseStep.PRECOMBAT_MAIN, playerA, "Tamiyo's Journal");

        attack(2, playerB, "Pillarfield Ox");

        attack(3, playerA, "Silvercoat Lion");
        rollbackTurns(3, PhaseStep.END_TURN, playerA, 0);

        attack(4, playerB, "Pillarfield Ox");

        attack(5, playerA, "Silvercoat Lion");

        rollbackTurns(5, PhaseStep.END_TURN, playerA, 0);

        attack(6, playerB, "Pillarfield Ox");

        playLand(7, PhaseStep.PRECOMBAT_MAIN, playerA, "Port Town");
        attack(7, playerA, "Silvercoat Lion");

        rollbackTurns(7, PhaseStep.POSTCOMBAT_MAIN, playerA, 0);

        setStopAt(7, PhaseStep.END_TURN);
        execute();

        assertPermanentCount(playerA, "Port Town", 1);
        assertTapped("Port Town", false);
        assertPermanentCount(playerA, "Clue", 3);

        assertLife(playerA, 14);
        assertLife(playerB, 14);

    }

}
