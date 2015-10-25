package org.swtk.commons.dict.wiktionary.generated.t.i.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryTIL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("tilak", "{\"term\":\"tilak\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Sanskrit\"], \"text\":\"From Sanskrit \u0027तिलक\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A mark or symbol worn on the forehead by Hindus, ornamentally or as an indication of status\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2001\u0027\u0027, \u0027Life of Pi\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"I wore these spots of shine and silver like \u0027\u0027tilaks\u0027\u0027, the marks of colour that we Hindus wear on our foreheads as symbols of the divine\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2012\u0027\u0027, \u0026quot;The Secret of the Temple\u0026quot;, \u0027The New Yorker\u0027, 30 Apr 2012\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"He dressed in a dhoti, had a wispy white beard that trailed down to his waist, and regularly smeared across his forehead a \u0027\u0027\u0027tilaka\u0027\u0027\u0027, a pitchfork-shaped design that signifies enlightenment\", \"priority\":5}]}, \"synonyms\":{}}");

	add("tilbury", "{\"term\":\"tilbury\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the surname \u0027\u0027 (the inventor).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small open two-wheeled carriage\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Sixpence (formerly the fare from Gravesend to Tilbury Fort\", \"priority\":2}]}, \"synonyms\":{}}");

	add("tileability", "{\"term\":\"tileability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The ability of a shape to tile the plane\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tilefish", "{\"term\":\"tilefish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tile|fish|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Mostly small, perciform marine fish in the family \u0027\u0027; an important food fish\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tilemap", "{\"term\":\"tilemap\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tile|map|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A two-dimensional grid made up of rectangular tiles of equal size, each of which can display an image\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tileset", "{\"term\":\"tileset\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|tile|set|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A collection of rectangular images, or tiles\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"2007\u0027\u0027, \u0027PC Gamer\u0027 (volume 14, issues 10-12\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The imp-infested streets of London get repetitive, but new \u0027\u0027tilesets\u0027\u0027 are introduced later in the plot\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"2011\u0027\u0027, Steffen Itterheim, \u0027Learn iPhone and iPad Cocos2D Game Development\u0027 (page 241\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Next you need to load a \u0027\u0027tileset\u0027\u0027 containing isometric tiles\", \"priority\":5}]}, \"synonyms\":{}}");

	add("tilidate", "{\"term\":\"tilidate\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular narcotic painkiller\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tilidine", "{\"term\":\"tilidine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A particular narcotic painkiller\", \"priority\":1}]}, \"synonyms\":{}}");

	add("tilter", "{\"term\":\"tilter\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who tilts, or jousts\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"One who fights\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One who operates a tilt hammer\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }