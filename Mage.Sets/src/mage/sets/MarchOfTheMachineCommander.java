package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

import java.util.Arrays;
import java.util.List;

/**
 * @author TheElk801
 */
public final class MarchOfTheMachineCommander extends ExpansionSet {

    private static final List<String> unfinished = Arrays.asList("Blight Titan", "Brimaz, Blight of Oreskos", "Excise the Imperfect");

    private static final MarchOfTheMachineCommander instance = new MarchOfTheMachineCommander();

    public static MarchOfTheMachineCommander getInstance() {
        return instance;
    }

    private MarchOfTheMachineCommander() {
        super("March of the Machine Commander", "MOC", ExpansionSet.buildDate(2023, 4, 21), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Abzan Battle Priest", 164, Rarity.UNCOMMON, mage.cards.a.AbzanBattlePriest.class));
        cards.add(new SetCardInfo("Abzan Falconer", 165, Rarity.UNCOMMON, mage.cards.a.AbzanFalconer.class));
        cards.add(new SetCardInfo("Academy Manufactor", 346, Rarity.RARE, mage.cards.a.AcademyManufactor.class));
        cards.add(new SetCardInfo("Acclaimed Contender", 166, Rarity.RARE, mage.cards.a.AcclaimedContender.class));
        cards.add(new SetCardInfo("Adeline, Resplendent Cathar", 167, Rarity.RARE, mage.cards.a.AdelineResplendentCathar.class));
        cards.add(new SetCardInfo("Aid from the Cowl", 290, Rarity.RARE, mage.cards.a.AidFromTheCowl.class));
        cards.add(new SetCardInfo("Alharu, Solemn Ritualist", 168, Rarity.UNCOMMON, mage.cards.a.AlharuSolemnRitualist.class));
        cards.add(new SetCardInfo("Ambition's Cost", 246, Rarity.UNCOMMON, mage.cards.a.AmbitionsCost.class));
        cards.add(new SetCardInfo("Ancient Stone Idol", 347, Rarity.RARE, mage.cards.a.AncientStoneIdol.class));
        cards.add(new SetCardInfo("Angel of Finality", 169, Rarity.RARE, mage.cards.a.AngelOfFinality.class));
        cards.add(new SetCardInfo("Angel of Salvation", 170, Rarity.RARE, mage.cards.a.AngelOfSalvation.class));
        cards.add(new SetCardInfo("Angel of the Ruins", 171, Rarity.RARE, mage.cards.a.AngelOfTheRuins.class));
        cards.add(new SetCardInfo("Arcane Sanctum", 390, Rarity.UNCOMMON, mage.cards.a.ArcaneSanctum.class));
        cards.add(new SetCardInfo("Arcane Signet", 348, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Armorcraft Judge", 291, Rarity.UNCOMMON, mage.cards.a.ArmorcraftJudge.class));
        cards.add(new SetCardInfo("Arvad the Cursed", 317, Rarity.UNCOMMON, mage.cards.a.ArvadTheCursed.class));
        cards.add(new SetCardInfo("Aryel, Knight of Windgrace", 318, Rarity.RARE, mage.cards.a.AryelKnightOfWindgrace.class));
        cards.add(new SetCardInfo("Austere Command", 172, Rarity.RARE, mage.cards.a.AustereCommand.class));
        cards.add(new SetCardInfo("Banisher Priest", 173, Rarity.UNCOMMON, mage.cards.b.BanisherPriest.class));
        cards.add(new SetCardInfo("Battle Screech", 174, Rarity.UNCOMMON, mage.cards.b.BattleScreech.class));
        cards.add(new SetCardInfo("Blade Splicer", 175, Rarity.RARE, mage.cards.b.BladeSplicer.class));
        cards.add(new SetCardInfo("Bloodforged Battle-Axe", 349, Rarity.RARE, mage.cards.b.BloodforgedBattleAxe.class));
        cards.add(new SetCardInfo("Bloodline Pretender", 350, Rarity.UNCOMMON, mage.cards.b.BloodlinePretender.class));
        cards.add(new SetCardInfo("Bojuka Bog", 391, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Bone Shredder", 247, Rarity.UNCOMMON, mage.cards.b.BoneShredder.class));
        cards.add(new SetCardInfo("Brass's Bounty", 272, Rarity.RARE, mage.cards.b.BrasssBounty.class));
        cards.add(new SetCardInfo("Brawn", 292, Rarity.UNCOMMON, mage.cards.b.Brawn.class));
        cards.add(new SetCardInfo("Bretagard Stronghold", 392, Rarity.UNCOMMON, mage.cards.b.BretagardStronghold.class));
        cards.add(new SetCardInfo("Burnished Hart", 351, Rarity.UNCOMMON, mage.cards.b.BurnishedHart.class));
        cards.add(new SetCardInfo("Canopy Vista", 393, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Cataclysmic Gearhulk", 176, Rarity.MYTHIC, mage.cards.c.CataclysmicGearhulk.class));
        cards.add(new SetCardInfo("Champion of Lambholt", 293, Rarity.RARE, mage.cards.c.ChampionOfLambholt.class));
        cards.add(new SetCardInfo("Chant of Vitu-Ghazi", 177, Rarity.UNCOMMON, mage.cards.c.ChantOfVituGhazi.class));
        cards.add(new SetCardInfo("Chaos Warp", 273, Rarity.RARE, mage.cards.c.ChaosWarp.class));
        cards.add(new SetCardInfo("Chasm Skulker", 218, Rarity.RARE, mage.cards.c.ChasmSkulker.class));
        cards.add(new SetCardInfo("Choked Estuary", 394, Rarity.RARE, mage.cards.c.ChokedEstuary.class));
        cards.add(new SetCardInfo("Cinder Glade", 395, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Cloud of Faeries", 219, Rarity.COMMON, mage.cards.c.CloudOfFaeries.class));
        cards.add(new SetCardInfo("Combine Chrysalis", 319, Rarity.UNCOMMON, mage.cards.c.CombineChrysalis.class));
        cards.add(new SetCardInfo("Command Tower", 396, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 352, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Conclave Mentor", 320, Rarity.UNCOMMON, mage.cards.c.ConclaveMentor.class));
        cards.add(new SetCardInfo("Conclave Tribunal", 178, Rarity.UNCOMMON, mage.cards.c.ConclaveTribunal.class));
        cards.add(new SetCardInfo("Constable of the Realm", 179, Rarity.UNCOMMON, mage.cards.c.ConstableOfTheRealm.class));
        cards.add(new SetCardInfo("Corpse Knight", 321, Rarity.UNCOMMON, mage.cards.c.CorpseKnight.class));
        cards.add(new SetCardInfo("Coveted Jewel", 353, Rarity.RARE, mage.cards.c.CovetedJewel.class));
        cards.add(new SetCardInfo("Crack Open", 294, Rarity.COMMON, mage.cards.c.CrackOpen.class));
        cards.add(new SetCardInfo("Cultivate", 295, Rarity.COMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Cultivator's Caravan", 354, Rarity.RARE, mage.cards.c.CultivatorsCaravan.class));
        cards.add(new SetCardInfo("Curse of Opulence", 274, Rarity.UNCOMMON, mage.cards.c.CurseOfOpulence.class));
        cards.add(new SetCardInfo("Despark", 322, Rarity.UNCOMMON, mage.cards.d.Despark.class));
        cards.add(new SetCardInfo("Devouring Light", 180, Rarity.UNCOMMON, mage.cards.d.DevouringLight.class));
        cards.add(new SetCardInfo("Distant Melody", 220, Rarity.COMMON, mage.cards.d.DistantMelody.class));
        cards.add(new SetCardInfo("Dromoka's Command", 323, Rarity.RARE, mage.cards.d.DromokasCommand.class));
        cards.add(new SetCardInfo("Duergar Hedge-Mage", 324, Rarity.UNCOMMON, mage.cards.d.DuergarHedgeMage.class));
        cards.add(new SetCardInfo("Duplicant", 355, Rarity.RARE, mage.cards.d.Duplicant.class));
        cards.add(new SetCardInfo("Echo Storm", 221, Rarity.RARE, mage.cards.e.EchoStorm.class));
        cards.add(new SetCardInfo("Elite Scaleguard", 181, Rarity.UNCOMMON, mage.cards.e.EliteScaleguard.class));
        cards.add(new SetCardInfo("Elspeth, Sun's Champion", 182, Rarity.MYTHIC, mage.cards.e.ElspethSunsChampion.class));
        cards.add(new SetCardInfo("Emeria Angel", 183, Rarity.RARE, mage.cards.e.EmeriaAngel.class));
        cards.add(new SetCardInfo("Enduring Scalelord", 325, Rarity.UNCOMMON, mage.cards.e.EnduringScalelord.class));
        cards.add(new SetCardInfo("Ephemeral Shields", 184, Rarity.COMMON, mage.cards.e.EphemeralShields.class));
        cards.add(new SetCardInfo("Ethersworn Adjudicator", 222, Rarity.MYTHIC, mage.cards.e.EtherswornAdjudicator.class));
        cards.add(new SetCardInfo("Everquill Phoenix", 275, Rarity.RARE, mage.cards.e.EverquillPhoenix.class));
        cards.add(new SetCardInfo("Evolving Wilds", 397, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 398, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Falkenrath Exterminator", 276, Rarity.UNCOMMON, mage.cards.f.FalkenrathExterminator.class));
        cards.add(new SetCardInfo("Fallowsage", 223, Rarity.UNCOMMON, mage.cards.f.Fallowsage.class));
        cards.add(new SetCardInfo("Feldon of the Third Path", 277, Rarity.MYTHIC, mage.cards.f.FeldonOfTheThirdPath.class));
        cards.add(new SetCardInfo("Fell the Mighty", 185, Rarity.RARE, mage.cards.f.FellTheMighty.class));
        cards.add(new SetCardInfo("Fellwar Stone", 356, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Fertilid", 296, Rarity.COMMON, mage.cards.f.Fertilid.class));
        cards.add(new SetCardInfo("Fetid Heath", 399, Rarity.RARE, mage.cards.f.FetidHeath.class));
        cards.add(new SetCardInfo("Field of Ruin", 400, Rarity.UNCOMMON, mage.cards.f.FieldOfRuin.class));
        cards.add(new SetCardInfo("Fiery Confluence", 278, Rarity.RARE, mage.cards.f.FieryConfluence.class));
        cards.add(new SetCardInfo("First-Sphere Gargantua", 248, Rarity.COMMON, mage.cards.f.FirstSphereGargantua.class));
        cards.add(new SetCardInfo("Flamerush Rider", 279, Rarity.RARE, mage.cards.f.FlamerushRider.class));
        cards.add(new SetCardInfo("Flameshadow Conjuring", 280, Rarity.RARE, mage.cards.f.FlameshadowConjuring.class));
        cards.add(new SetCardInfo("Flight of Equenauts", 186, Rarity.UNCOMMON, mage.cards.f.FlightOfEquenauts.class));
        cards.add(new SetCardInfo("Forgotten Ancient", 297, Rarity.RARE, mage.cards.f.ForgottenAncient.class));
        cards.add(new SetCardInfo("Fortified Village", 401, Rarity.RARE, mage.cards.f.FortifiedVillage.class));
        cards.add(new SetCardInfo("Foulmire Knight", 249, Rarity.UNCOMMON, mage.cards.f.FoulmireKnight.class));
        cards.add(new SetCardInfo("Fractured Powerstone", 357, Rarity.COMMON, mage.cards.f.FracturedPowerstone.class));
        cards.add(new SetCardInfo("Frontier Bivouac", 402, Rarity.UNCOMMON, mage.cards.f.FrontierBivouac.class));
        cards.add(new SetCardInfo("Frostboil Snarl", 403, Rarity.RARE, mage.cards.f.FrostboilSnarl.class));
        cards.add(new SetCardInfo("Furycalm Snarl", 404, Rarity.RARE, mage.cards.f.FurycalmSnarl.class));
        cards.add(new SetCardInfo("Game Trail", 405, Rarity.RARE, mage.cards.g.GameTrail.class));
        cards.add(new SetCardInfo("Gavony Township", 406, Rarity.RARE, mage.cards.g.GavonyTownship.class));
        cards.add(new SetCardInfo("Generous Gift", 187, Rarity.UNCOMMON, mage.cards.g.GenerousGift.class));
        cards.add(new SetCardInfo("Genesis Hydra", 298, Rarity.RARE, mage.cards.g.GenesisHydra.class));
        cards.add(new SetCardInfo("Ghirapur Aether Grid", 281, Rarity.UNCOMMON, mage.cards.g.GhirapurAetherGrid.class));
        cards.add(new SetCardInfo("Gilded Goose", 299, Rarity.RARE, mage.cards.g.GildedGoose.class));
        cards.add(new SetCardInfo("Go for the Throat", 250, Rarity.UNCOMMON, mage.cards.g.GoForTheThroat.class));
        cards.add(new SetCardInfo("Goblin Instigator", 282, Rarity.COMMON, mage.cards.g.GoblinInstigator.class));
        cards.add(new SetCardInfo("Goblin Medics", 283, Rarity.COMMON, mage.cards.g.GoblinMedics.class));
        cards.add(new SetCardInfo("Goldmire Bridge", 407, Rarity.COMMON, mage.cards.g.GoldmireBridge.class));
        cards.add(new SetCardInfo("Good-Fortune Unicorn", 326, Rarity.UNCOMMON, mage.cards.g.GoodFortuneUnicorn.class));
        cards.add(new SetCardInfo("Goro-Goro and Satoru", 445, Rarity.MYTHIC, mage.cards.g.GoroGoroAndSatoru.class));
        cards.add(new SetCardInfo("Graveshifter", 251, Rarity.UNCOMMON, mage.cards.g.Graveshifter.class));
        cards.add(new SetCardInfo("Gruul Signet", 358, Rarity.COMMON, mage.cards.g.GruulSignet.class));
        cards.add(new SetCardInfo("Guardian Scalelord", 16, Rarity.RARE, mage.cards.g.GuardianScalelord.class));
        cards.add(new SetCardInfo("Gyre Sage", 300, Rarity.RARE, mage.cards.g.GyreSage.class));
        cards.add(new SetCardInfo("Haakon, Stromgald Scourge", 252, Rarity.RARE, mage.cards.h.HaakonStromgaldScourge.class));
        cards.add(new SetCardInfo("Hamza, Guardian of Arashin", 327, Rarity.UNCOMMON, mage.cards.h.HamzaGuardianOfArashin.class));
        cards.add(new SetCardInfo("Heaven // Earth", 328, Rarity.RARE, mage.cards.h.HeavenEarth.class));
        cards.add(new SetCardInfo("Hedron Archive", 359, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Hellkite Igniter", 284, Rarity.RARE, mage.cards.h.HellkiteIgniter.class));
        cards.add(new SetCardInfo("Herald of Hoofbeats", 22, Rarity.RARE, mage.cards.h.HeraldOfHoofbeats.class));
        cards.add(new SetCardInfo("Herald's Horn", 360, Rarity.UNCOMMON, mage.cards.h.HeraldsHorn.class));
        cards.add(new SetCardInfo("Hero of Bladehold", 188, Rarity.MYTHIC, mage.cards.h.HeroOfBladehold.class));
        cards.add(new SetCardInfo("High Sentinels of Arashin", 189, Rarity.RARE, mage.cards.h.HighSentinelsOfArashin.class));
        cards.add(new SetCardInfo("Hindervines", 301, Rarity.UNCOMMON, mage.cards.h.Hindervines.class));
        cards.add(new SetCardInfo("Hour of Reckoning", 190, Rarity.RARE, mage.cards.h.HourOfReckoning.class));
        cards.add(new SetCardInfo("Impact Tremors", 285, Rarity.COMMON, mage.cards.i.ImpactTremors.class));
        cards.add(new SetCardInfo("Imprisoned in the Moon", 224, Rarity.RARE, mage.cards.i.ImprisonedInTheMoon.class));
        cards.add(new SetCardInfo("Improbable Alliance", 329, Rarity.UNCOMMON, mage.cards.i.ImprobableAlliance.class));
        cards.add(new SetCardInfo("Incubation Druid", 302, Rarity.RARE, mage.cards.i.IncubationDruid.class));
        cards.add(new SetCardInfo("Inscription of Abundance", 303, Rarity.RARE, mage.cards.i.InscriptionOfAbundance.class));
        cards.add(new SetCardInfo("Inspiring Call", 304, Rarity.UNCOMMON, mage.cards.i.InspiringCall.class));
        cards.add(new SetCardInfo("Inspiring Statuary", 361, Rarity.RARE, mage.cards.i.InspiringStatuary.class));
        cards.add(new SetCardInfo("Ion Storm", 286, Rarity.RARE, mage.cards.i.IonStorm.class));
        cards.add(new SetCardInfo("Izzet Signet", 362, Rarity.COMMON, mage.cards.i.IzzetSignet.class));
        cards.add(new SetCardInfo("Josu Vess, Lich Knight", 253, Rarity.RARE, mage.cards.j.JosuVessLichKnight.class));
        cards.add(new SetCardInfo("Jungle Shrine", 408, Rarity.UNCOMMON, mage.cards.j.JungleShrine.class));
        cards.add(new SetCardInfo("Juniper Order Ranger", 330, Rarity.UNCOMMON, mage.cards.j.JuniperOrderRanger.class));
        cards.add(new SetCardInfo("Junk Winder", 225, Rarity.UNCOMMON, mage.cards.j.JunkWinder.class));
        cards.add(new SetCardInfo("Kalonian Hydra", 305, Rarity.MYTHIC, mage.cards.k.KalonianHydra.class));
        cards.add(new SetCardInfo("Karn's Bastion", 409, Rarity.RARE, mage.cards.k.KarnsBastion.class));
        cards.add(new SetCardInfo("Kasla, the Broken Halo", 4, Rarity.MYTHIC, mage.cards.k.KaslaTheBrokenHalo.class));
        cards.add(new SetCardInfo("Keeper of the Accord", 191, Rarity.RARE, mage.cards.k.KeeperOfTheAccord.class));
        cards.add(new SetCardInfo("Keskit, the Flesh Sculptor", 254, Rarity.UNCOMMON, mage.cards.k.KeskitTheFleshSculptor.class));
        cards.add(new SetCardInfo("Kessig Wolf Run", 410, Rarity.RARE, mage.cards.k.KessigWolfRun.class));
        cards.add(new SetCardInfo("Kher Keep", 411, Rarity.RARE, mage.cards.k.KherKeep.class));
        cards.add(new SetCardInfo("Knight Exemplar", 192, Rarity.RARE, mage.cards.k.KnightExemplar.class));
        cards.add(new SetCardInfo("Knight of the Last Breath", 331, Rarity.UNCOMMON, mage.cards.k.KnightOfTheLastBreath.class));
        cards.add(new SetCardInfo("Knight of the White Orchid", 193, Rarity.RARE, mage.cards.k.KnightOfTheWhiteOrchid.class));
        cards.add(new SetCardInfo("Knights of the Black Rose", 332, Rarity.UNCOMMON, mage.cards.k.KnightsOfTheBlackRose.class));
        cards.add(new SetCardInfo("Knights' Charge", 333, Rarity.RARE, mage.cards.k.KnightsCharge.class));
        cards.add(new SetCardInfo("Kodama's Reach", 306, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Krenko, Tin Street Kingpin", 287, Rarity.RARE, mage.cards.k.KrenkoTinStreetKingpin.class));
        cards.add(new SetCardInfo("Krosan Verge", 412, Rarity.UNCOMMON, mage.cards.k.KrosanVerge.class));
        cards.add(new SetCardInfo("Kykar, Wind's Fury", 334, Rarity.MYTHIC, mage.cards.k.KykarWindsFury.class));
        cards.add(new SetCardInfo("Liliana's Standard Bearer", 255, Rarity.RARE, mage.cards.l.LilianasStandardBearer.class));
        cards.add(new SetCardInfo("Llanowar Reborn", 413, Rarity.UNCOMMON, mage.cards.l.LlanowarReborn.class));
        cards.add(new SetCardInfo("Managorger Hydra", 307, Rarity.RARE, mage.cards.m.ManagorgerHydra.class));
        cards.add(new SetCardInfo("Massacre Wurm", 256, Rarity.MYTHIC, mage.cards.m.MassacreWurm.class));
        cards.add(new SetCardInfo("Master Splicer", 194, Rarity.UNCOMMON, mage.cards.m.MasterSplicer.class));
        cards.add(new SetCardInfo("Master of Etherium", 226, Rarity.RARE, mage.cards.m.MasterOfEtherium.class));
        cards.add(new SetCardInfo("Masterful Replication", 227, Rarity.RARE, mage.cards.m.MasterfulReplication.class));
        cards.add(new SetCardInfo("Mentor of the Meek", 196, Rarity.UNCOMMON, mage.cards.m.MentorOfTheMeek.class));
        cards.add(new SetCardInfo("Meteor Golem", 363, Rarity.UNCOMMON, mage.cards.m.MeteorGolem.class));
        cards.add(new SetCardInfo("Midnight Reaper", 257, Rarity.RARE, mage.cards.m.MidnightReaper.class));
        cards.add(new SetCardInfo("Migratory Route", 336, Rarity.UNCOMMON, mage.cards.m.MigratoryRoute.class));
        cards.add(new SetCardInfo("Mikaeus, the Lunarch", 197, Rarity.RARE, mage.cards.m.MikaeusTheLunarch.class));
        cards.add(new SetCardInfo("Mind Stone", 364, Rarity.UNCOMMON, mage.cards.m.MindStone.class));
        cards.add(new SetCardInfo("Mindless Automaton", 365, Rarity.UNCOMMON, mage.cards.m.MindlessAutomaton.class));
        cards.add(new SetCardInfo("Mortify", 337, Rarity.UNCOMMON, mage.cards.m.Mortify.class));
        cards.add(new SetCardInfo("Mossfire Valley", 414, Rarity.RARE, mage.cards.m.MossfireValley.class));
        cards.add(new SetCardInfo("Mosswort Bridge", 415, Rarity.RARE, mage.cards.m.MosswortBridge.class));
        cards.add(new SetCardInfo("Murderous Rider", 258, Rarity.RARE, mage.cards.m.MurderousRider.class));
        cards.add(new SetCardInfo("Myr Battlesphere", 366, Rarity.RARE, mage.cards.m.MyrBattlesphere.class));
        cards.add(new SetCardInfo("Myriad Landscape", 416, Rarity.UNCOMMON, mage.cards.m.MyriadLandscape.class));
        cards.add(new SetCardInfo("Mystic Monastery", 417, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Nadir Kraken", 228, Rarity.RARE, mage.cards.n.NadirKraken.class));
        cards.add(new SetCardInfo("Nettlecyst", 367, Rarity.RARE, mage.cards.n.Nettlecyst.class));
        cards.add(new SetCardInfo("Night's Whisper", 259, Rarity.COMMON, mage.cards.n.NightsWhisper.class));
        cards.add(new SetCardInfo("Noxious Gearhulk", 260, Rarity.MYTHIC, mage.cards.n.NoxiousGearhulk.class));
        cards.add(new SetCardInfo("Order of Midnight", 261, Rarity.UNCOMMON, mage.cards.o.OrderOfMidnight.class));
        cards.add(new SetCardInfo("Orzhov Locket", 368, Rarity.COMMON, mage.cards.o.OrzhovLocket.class));
        cards.add(new SetCardInfo("Orzhov Signet", 369, Rarity.COMMON, mage.cards.o.OrzhovSignet.class));
        cards.add(new SetCardInfo("Painful Truths", 262, Rarity.RARE, mage.cards.p.PainfulTruths.class));
        cards.add(new SetCardInfo("Path of Ancestry", 418, Rarity.COMMON, mage.cards.p.PathOfAncestry.class));
        cards.add(new SetCardInfo("Path to Exile", 198, Rarity.UNCOMMON, mage.cards.p.PathToExile.class));
        cards.add(new SetCardInfo("Perplexing Test", 229, Rarity.RARE, mage.cards.p.PerplexingTest.class));
        cards.add(new SetCardInfo("Phyrexian Delver", 263, Rarity.RARE, mage.cards.p.PhyrexianDelver.class));
        cards.add(new SetCardInfo("Phyrexian Ghoul", 264, Rarity.COMMON, mage.cards.p.PhyrexianGhoul.class));
        cards.add(new SetCardInfo("Phyrexian Rager", 265, Rarity.COMMON, mage.cards.p.PhyrexianRager.class));
        cards.add(new SetCardInfo("Phyrexian Rebirth", 199, Rarity.RARE, mage.cards.p.PhyrexianRebirth.class));
        cards.add(new SetCardInfo("Phyrexian Scriptures", 266, Rarity.MYTHIC, mage.cards.p.PhyrexianScriptures.class));
        cards.add(new SetCardInfo("Phyrexian Triniform", 370, Rarity.MYTHIC, mage.cards.p.PhyrexianTriniform.class));
        cards.add(new SetCardInfo("Pia and Kiran Nalaar", 288, Rarity.RARE, mage.cards.p.PiaAndKiranNalaar.class));
        cards.add(new SetCardInfo("Port Town", 419, Rarity.RARE, mage.cards.p.PortTown.class));
        cards.add(new SetCardInfo("Prairie Stream", 420, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Pridemalkin", 308, Rarity.COMMON, mage.cards.p.Pridemalkin.class));
        cards.add(new SetCardInfo("Promise of Loyalty", 200, Rarity.RARE, mage.cards.p.PromiseOfLoyalty.class));
        cards.add(new SetCardInfo("Psychosis Crawler", 371, Rarity.RARE, mage.cards.p.PsychosisCrawler.class));
        cards.add(new SetCardInfo("Pull from Tomorrow", 230, Rarity.RARE, mage.cards.p.PullFromTomorrow.class));
        cards.add(new SetCardInfo("Read the Bones", 267, Rarity.COMMON, mage.cards.r.ReadTheBones.class));
        cards.add(new SetCardInfo("Reality Shift", 231, Rarity.UNCOMMON, mage.cards.r.RealityShift.class));
        cards.add(new SetCardInfo("Replicating Ring", 372, Rarity.UNCOMMON, mage.cards.r.ReplicatingRing.class));
        cards.add(new SetCardInfo("Restoration Angel", 201, Rarity.RARE, mage.cards.r.RestorationAngel.class));
        cards.add(new SetCardInfo("Return to Dust", 202, Rarity.UNCOMMON, mage.cards.r.ReturnToDust.class));
        cards.add(new SetCardInfo("Return to Nature", 309, Rarity.COMMON, mage.cards.r.ReturnToNature.class));
        cards.add(new SetCardInfo("Reverse Engineer", 232, Rarity.UNCOMMON, mage.cards.r.ReverseEngineer.class));
        cards.add(new SetCardInfo("Rise and Shine", 233, Rarity.RARE, mage.cards.r.RiseAndShine.class));
        cards.add(new SetCardInfo("Rishkar, Peema Renegade", 310, Rarity.RARE, mage.cards.r.RishkarPeemaRenegade.class));
        cards.add(new SetCardInfo("Rogue's Passage", 421, Rarity.UNCOMMON, mage.cards.r.RoguesPassage.class));
        cards.add(new SetCardInfo("Root Out", 311, Rarity.COMMON, mage.cards.r.RootOut.class));
        cards.add(new SetCardInfo("Saheeli's Artistry", 234, Rarity.RARE, mage.cards.s.SaheelisArtistry.class));
        cards.add(new SetCardInfo("Saheeli, Sublime Artificer", 338, Rarity.UNCOMMON, mage.cards.s.SaheeliSublimeArtificer.class));
        cards.add(new SetCardInfo("Scrap Trawler", 373, Rarity.RARE, mage.cards.s.ScrapTrawler.class));
        cards.add(new SetCardInfo("Sculpting Steel", 374, Rarity.RARE, mage.cards.s.SculptingSteel.class));
        cards.add(new SetCardInfo("Scytheclaw", 375, Rarity.RARE, mage.cards.s.Scytheclaw.class));
        cards.add(new SetCardInfo("Secure the Wastes", 203, Rarity.RARE, mage.cards.s.SecureTheWastes.class));
        cards.add(new SetCardInfo("Semester's End", 204, Rarity.RARE, mage.cards.s.SemestersEnd.class));
        cards.add(new SetCardInfo("Seraph of the Masses", 205, Rarity.UNCOMMON, mage.cards.s.SeraphOfTheMasses.class));
        cards.add(new SetCardInfo("Sharding Sphinx", 235, Rarity.RARE, mage.cards.s.ShardingSphinx.class));
        cards.add(new SetCardInfo("Shattered Angel", 206, Rarity.UNCOMMON, mage.cards.s.ShatteredAngel.class));
        cards.add(new SetCardInfo("Shimmer Dragon", 236, Rarity.RARE, mage.cards.s.ShimmerDragon.class));
        cards.add(new SetCardInfo("Shimmer Myr", 376, Rarity.UNCOMMON, mage.cards.s.ShimmerMyr.class));
        cards.add(new SetCardInfo("Shineshadow Snarl", 422, Rarity.RARE, mage.cards.s.ShineshadowSnarl.class));
        cards.add(new SetCardInfo("Sigiled Sword of Valeron", 377, Rarity.RARE, mage.cards.s.SigiledSwordOfValeron.class));
        cards.add(new SetCardInfo("Silverquill Campus", 423, Rarity.COMMON, mage.cards.s.SilverquillCampus.class));
        cards.add(new SetCardInfo("Silverwing Squadron", 207, Rarity.RARE, mage.cards.s.SilverwingSquadron.class));
        cards.add(new SetCardInfo("Simic Growth Chamber", 424, Rarity.UNCOMMON, mage.cards.s.SimicGrowthChamber.class));
        cards.add(new SetCardInfo("Simic Signet", 378, Rarity.COMMON, mage.cards.s.SimicSignet.class));
        cards.add(new SetCardInfo("Skullclamp", 379, Rarity.UNCOMMON, mage.cards.s.Skullclamp.class));
        cards.add(new SetCardInfo("Skyclave Relic", 380, Rarity.RARE, mage.cards.s.SkyclaveRelic.class));
        cards.add(new SetCardInfo("Skycloud Expanse", 425, Rarity.RARE, mage.cards.s.SkycloudExpanse.class));
        cards.add(new SetCardInfo("Slurrk, All-Ingesting", 312, Rarity.UNCOMMON, mage.cards.s.SlurrkAllIngesting.class));
        cards.add(new SetCardInfo("Smitten Swordmaster", 268, Rarity.COMMON, mage.cards.s.SmittenSwordmaster.class));
        cards.add(new SetCardInfo("Sol Ring", 381, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Soul of New Phyrexia", 382, Rarity.MYTHIC, mage.cards.s.SoulOfNewPhyrexia.class));
        cards.add(new SetCardInfo("Spell Swindle", 237, Rarity.RARE, mage.cards.s.SpellSwindle.class));
        cards.add(new SetCardInfo("Spine of Ish Sah", 383, Rarity.RARE, mage.cards.s.SpineOfIshSah.class));
        cards.add(new SetCardInfo("Spire of Industry", 426, Rarity.RARE, mage.cards.s.SpireOfIndustry.class));
        cards.add(new SetCardInfo("Spirited Companion", 208, Rarity.COMMON, mage.cards.s.SpiritedCompanion.class));
        cards.add(new SetCardInfo("Strionic Resonator", 384, Rarity.RARE, mage.cards.s.StrionicResonator.class));
        cards.add(new SetCardInfo("Stroke of Genius", 238, Rarity.RARE, mage.cards.s.StrokeOfGenius.class));
        cards.add(new SetCardInfo("Struggle // Survive", 339, Rarity.UNCOMMON, mage.cards.s.StruggleSurvive.class));
        cards.add(new SetCardInfo("Sungrass Prairie", 427, Rarity.RARE, mage.cards.s.SungrassPrairie.class));
        cards.add(new SetCardInfo("Sunken Hollow", 428, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Sunscorch Regent", 209, Rarity.RARE, mage.cards.s.SunscorchRegent.class));
        cards.add(new SetCardInfo("Suture Priest", 210, Rarity.COMMON, mage.cards.s.SuturePriest.class));
        cards.add(new SetCardInfo("Swords to Plowshares", 211, Rarity.UNCOMMON, mage.cards.s.SwordsToPlowshares.class));
        cards.add(new SetCardInfo("Syr Elenora, the Discerning", 239, Rarity.UNCOMMON, mage.cards.s.SyrElenoraTheDiscerning.class));
        cards.add(new SetCardInfo("Syr Konrad, the Grim", 269, Rarity.UNCOMMON, mage.cards.s.SyrKonradTheGrim.class));
        cards.add(new SetCardInfo("Tainted Field", 429, Rarity.UNCOMMON, mage.cards.t.TaintedField.class));
        cards.add(new SetCardInfo("Talisman of Hierarchy", 385, Rarity.UNCOMMON, mage.cards.t.TalismanOfHierarchy.class));
        cards.add(new SetCardInfo("Temple of Abandon", 430, Rarity.RARE, mage.cards.t.TempleOfAbandon.class));
        cards.add(new SetCardInfo("Temple of Deceit", 431, Rarity.RARE, mage.cards.t.TempleOfDeceit.class));
        cards.add(new SetCardInfo("Temple of Enlightenment", 432, Rarity.RARE, mage.cards.t.TempleOfEnlightenment.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 433, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Mystery", 434, Rarity.RARE, mage.cards.t.TempleOfMystery.class));
        cards.add(new SetCardInfo("Temple of Plenty", 435, Rarity.RARE, mage.cards.t.TempleOfPlenty.class));
        cards.add(new SetCardInfo("Temple of Silence", 436, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 438, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Temple of the False God", 437, Rarity.RARE, mage.cards.t.TempleOfTheFalseGod.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 439, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Tetsuko Umezawa, Fugitive", 240, Rarity.UNCOMMON, mage.cards.t.TetsukoUmezawaFugitive.class));
        cards.add(new SetCardInfo("The Locust God", 335, Rarity.MYTHIC, mage.cards.t.TheLocustGod.class));
        cards.add(new SetCardInfo("Thopter Assembly", 386, Rarity.RARE, mage.cards.t.ThopterAssembly.class));
        cards.add(new SetCardInfo("Thopter Spy Network", 241, Rarity.RARE, mage.cards.t.ThopterSpyNetwork.class));
        cards.add(new SetCardInfo("Thoughtcast", 242, Rarity.COMMON, mage.cards.t.Thoughtcast.class));
        cards.add(new SetCardInfo("Thriving Heath", 440, Rarity.COMMON, mage.cards.t.ThrivingHeath.class));
        cards.add(new SetCardInfo("Thriving Isle", 441, Rarity.COMMON, mage.cards.t.ThrivingIsle.class));
        cards.add(new SetCardInfo("Thriving Moor", 442, Rarity.COMMON, mage.cards.t.ThrivingMoor.class));
        cards.add(new SetCardInfo("Time Wipe", 340, Rarity.RARE, mage.cards.t.TimeWipe.class));
        cards.add(new SetCardInfo("Tireless Provisioner", 313, Rarity.UNCOMMON, mage.cards.t.TirelessProvisioner.class));
        cards.add(new SetCardInfo("Tireless Tracker", 314, Rarity.RARE, mage.cards.t.TirelessTracker.class));
        cards.add(new SetCardInfo("Together Forever", 212, Rarity.RARE, mage.cards.t.TogetherForever.class));
        cards.add(new SetCardInfo("Triskelion", 387, Rarity.RARE, mage.cards.t.Triskelion.class));
        cards.add(new SetCardInfo("Unbreakable Formation", 213, Rarity.RARE, mage.cards.u.UnbreakableFormation.class));
        cards.add(new SetCardInfo("Utter End", 341, Rarity.RARE, mage.cards.u.UtterEnd.class));
        cards.add(new SetCardInfo("Valiant Knight", 214, Rarity.RARE, mage.cards.v.ValiantKnight.class));
        cards.add(new SetCardInfo("Vampires' Vengeance", 289, Rarity.UNCOMMON, mage.cards.v.VampiresVengeance.class));
        cards.add(new SetCardInfo("Vanquisher's Banner", 388, Rarity.RARE, mage.cards.v.VanquishersBanner.class));
        cards.add(new SetCardInfo("Vault of the Archangel", 443, Rarity.RARE, mage.cards.v.VaultOfTheArchangel.class));
        cards.add(new SetCardInfo("Vedalken Humiliator", 243, Rarity.RARE, mage.cards.v.VedalkenHumiliator.class));
        cards.add(new SetCardInfo("Venerated Loxodon", 215, Rarity.RARE, mage.cards.v.VeneratedLoxodon.class));
        cards.add(new SetCardInfo("Victimize", 270, Rarity.UNCOMMON, mage.cards.v.Victimize.class));
        cards.add(new SetCardInfo("Village Bell-Ringer", 216, Rarity.COMMON, mage.cards.v.VillageBellRinger.class));
        cards.add(new SetCardInfo("Vineglimmer Snarl", 444, Rarity.RARE, mage.cards.v.VineglimmerSnarl.class));
        cards.add(new SetCardInfo("Vona, Butcher of Magan", 342, Rarity.MYTHIC, mage.cards.v.VonaButcherOfMagan.class));
        cards.add(new SetCardInfo("Wayfarer's Bauble", 389, Rarity.COMMON, mage.cards.w.WayfarersBauble.class));
        cards.add(new SetCardInfo("Wear // Tear", 343, Rarity.UNCOMMON, mage.cards.w.WearTear.class));
        cards.add(new SetCardInfo("Weirding Wood", 315, Rarity.UNCOMMON, mage.cards.w.WeirdingWood.class));
        cards.add(new SetCardInfo("Whirler Rogue", 244, Rarity.UNCOMMON, mage.cards.w.WhirlerRogue.class));
        cards.add(new SetCardInfo("Whirlwind of Thought", 344, Rarity.RARE, mage.cards.w.WhirlwindOfThought.class));
        cards.add(new SetCardInfo("Wintermoor Commander", 345, Rarity.UNCOMMON, mage.cards.w.WintermoorCommander.class));
        cards.add(new SetCardInfo("Wood Elves", 316, Rarity.COMMON, mage.cards.w.WoodElves.class));
        cards.add(new SetCardInfo("Workshop Elders", 245, Rarity.RARE, mage.cards.w.WorkshopElders.class));
        cards.add(new SetCardInfo("Worthy Knight", 217, Rarity.RARE, mage.cards.w.WorthyKnight.class));
        cards.add(new SetCardInfo("Yawgmoth's Vile Offering", 271, Rarity.RARE, mage.cards.y.YawgmothsVileOffering.class));

        cards.removeIf(setCardInfo -> unfinished.contains(setCardInfo.getName())); // remove when mechanic is implemented
    }
}
