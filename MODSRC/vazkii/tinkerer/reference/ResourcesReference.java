/**
 * This Code is Open Source and distributed under a
 * Creative Commons Attribution-NonCommercial-ShareAlike 3.0 License
 * (http://creativecommons.org/licenses/by-nc-sa/3.0/deed.en_GB)
 */
// Created @ 23 Dec 2012
package vazkii.tinkerer.reference;

/**
 * ResourcesReference
 *
 * Reference for Resource constants.
 *
 * @author Vazkii
 */
public final class ResourcesReference {

	/** Root location for all resources **/
	public static final String ROOT = "/vazkii/tinkerer/res/";

	/** Root location for model texture resources **/
	public static final String ROOT_MODEL = ROOT + "model/";

	/** Root location for entity texture resources **/
	public static final String ROOT_ENTITY = ROOT + "entity/";

	/** Root location for gui texture resources **/
	public static final String ROOT_GUI = ROOT + "gui/";

	/** The Spritesheet containing the in-world block textures **/
	public static final String BLOCKS_SPRITESHEET = ROOT + "blocks.png";

	/** The Spritesheet containing the in-world block textures in 64x64 resolution **/
	public static final String BLOCKS_64_SPRITESHEET = ROOT + "blocks64.png";

	/** The Spritesheet containing the item sprites **/
	public static final String ITEMS_SPRITESHEET = ROOT + "items.png";

	/** The Spritesheet containing the item sprites in 32x32 resolution **/
	public static final String ITEMS_32_SPRITESHEET = ROOT + "items32.png";

	/** The Spritesheet containing research sprites **/
	public static final String RESEARCH_SPRITESHEET = ROOT + "research.png";

	/** The location of the Texture File for the Elemental Desk Model **/
	public static final String MODEL_TEX_ELEMENTAL_DESK = ROOT_MODEL + "elementalDesk.png";

	/** The Location of the Texture File for the Catalyst Capsule Model **/
	public static final String MODEL_TEX_CATALYST_CAPSULE = ROOT_MODEL + "catalystCapsule.png";

	/** The location of book textures **/
	public static final String ROOT_BOOK_TEXTURES = ROOT_MODEL + "book";

	/** Integers for the Blocks Spritesheet indexes **/
	public static final int BLOCK_INDEX_ELEMENTIUM_ORE_NON_AIMATED = 5,
							BLOCK_INDEX_ELEMENTIUM_GEM = 16,
							BLOCK_INDEX_ATTUNER_GLASS = 17,
							BLOCK_INDEX_ATTUNER_TOP = 18,
							BLOCK_INDEX_TRANSPARENT = 255;

	/** Integers for the Blocks Spritesheet (64x) indexes **/
	public static final int BLOCK_64_INDEX_ELEMENTALIST_TINKERING_ALTAR = 0;

	/** Integers for the Blocks Spritesheet Animations **/
	public static final int BLOCK_ANIM_ELEMENTIUM_ORE_START = 0,
							BLOCK_ANIM_ELEMENTIUM_ORE_END = 15;

	/** Integers for the Items Spritesheet indexes **/
	public static final int ITEM_INDEX_ELEMENTAL_BOOK_START = 0,
							ITEM_INDEX_ELEMENTALIST_LEXICON = 4,
							ITEM_INDEX_ELEMENTIUM_DUST = 15,
							ITEM_INDEX_CATALYST_START = 16,
							ITEM_INDEX_ELEMENTAL_BARK = 32,
							ITEM_INDEX_WAND_REGULAR = 33,
							ITEM_INDEX_WAND_COLORIZE = 34;

	/** Integers for the Item Spritesheet (32x) Animations **/
	public static final int ITEM_32_ANIM_ELEMENTIUM_GEM_START = 0,
							ITEM_32_ANIM_ELEMENTIUM_GEM_END = 7,
							ITEM_32_ANIM_ELEMENTIUM_INGOT_START = 16,
							ITEM_32_ANIM_ELEMENTIUM_INGOT_END = 23;

	/** Integers for the Research Spritesheet indexes **/
	public static final int RESEARCH_INDEX_QUESTIONMARK = 0,
							RESEARCH_INDEX_ELLIPSES = 1,
							RESEARCH_INDEX_ELEMENTIUM_ORE = 2,
							RESEARCH_INDEX_ELEMENTIUM_GEM = 3,
							RESEARCH_INDEX_ELEMENTAL_DESK = 4,
							RESEARCH_INDEX_RESEARCH_BOOKS = 5,
							RESERACH_INDEX_ELEMENTIUM_INGOT = 6,
							RESEARCH_INDEX_WAND_START = 7,
							RESEARCH_INDEX_ELEMENTAL_TINKERING = 11,
							RESEARCH_INDEX_CATALYST_CAPSULE = 12,
							RESEARCH_INDEX_ATTUNER = 13;

	/** Integers for Animation tick speeds **/
	public static final int ANIM_SPEED_ELEMENTIUM_GEM = 2,
							ANIM_SPEED_ELEMENTIUM_INGOT = 2;

	/** The file that contains the Elementium Guardian Mob Texture **/
	public static final String MOB_ELEMENTAL_GUARDIAN_TEXTURE = ROOT_ENTITY + "oreGuardian.png";

	/** The files that contain the background textures for the guis **/
	public static final String GUI_ELEMENTAL_DESK_TEXTURE = ROOT_GUI + "elementalDesk.png",
							   GUI_ELEMENTALIST_LEXICON_INDEX_TEXTURE = ROOT_GUI + "researchBook.png",
							   GUI_ELEMENTALIST_LEXICON_RESEARCH_TEXTURE = ROOT_GUI + "recipeBook.png",
							   GUI_RESEARCH_GAME_TEXTURE = ROOT_GUI + "researchGame.png",
							   GUI_ELEMENTALIST_TINKERING_ALTAR_TEXTURE = ROOT_GUI + "infusion.png";

	/** The reserach background coordinates on the research spritesheet **/
	public static final int RESEARCH_BACKGROUND_X_COORD = 160,
							RESEARCH_BACKGROUND_Y_COORD = 240;

	/** The Elementium Guardian mob is colored trough the spectrum, this integer is
	 ** the divisor for the cosine function's speed that defines the color. **/
	public static final int SPECTRUM_DIVISOR_ELEMENTIUM_GUARDIAN = 20;

	/** The Elementium Gem is colored trough the spectrum, this integer is
	 ** the divisor for the cosine function's speed that defines the color. **/
	public static final int SPECTRUM_DIVISOR_ELEMENTIUM_GEM = 60;

	/** The Progress bar on the Elementalist's Tinkering Altar
	 * GUI  is colored trough the spectrum, this integer is
	 ** the divisor for the cosine function's speed that defines the color. **/
	public static final int SPECTRUM_DIVISOR_INFUSION = 25;

	/** The Wands are colored with a varying brightess, this integer is
	 * the divisor for the consine function's speed that defines the color **/
	public static final int BRIGHTNESS_DIVISOR_WAND = 35;

	/** The root folder where the research data (texts) is located. **/
	public static final String RESEARCH_DATA_FILE = ROOT + "research/research.txt";

	/** The location of the world cache folder in a world **/
	public static final String WORLD_CACHE_FOLDER = "/" + AnnotationConstants.MOD_ID;

	/** The location of the name of a global cache file **/
	public static final String CACHE_FILE_NAME = "cache.dat";

	/** The prefix of a player folder in the world cache folder, this is
	 * used to format the folder names to see who's the player that
	 * the file inside belongs to **/
	public static final String WORLD_PLAYER_CACHE_FOLDER_PREFIX = "player_";

	/** The location of a player folder in the world cache folder, this is
	 * meant to be formatted with the player's name **/
	public static final String WORLD_PLAYER_CACHE_FOLDER = WORLD_CACHE_FOLDER + "/" + WORLD_PLAYER_CACHE_FOLDER_PREFIX + "%s";
}
