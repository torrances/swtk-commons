package org.swtk.commons.dict.wiktionary.generated.p.u.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPUZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("puzzle", "{\"term\":\"puzzle\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"Origin uncertain, originally \u0027pusle\u0027 Possibly from {{suffix|pose|le|t1\u003dto perplex, puzzle, interrogate|pos2\u003dfrequentive suffix|lang\u003den}}. The verb (1590s) “to perplex” seems to predate the noun “state of being perplexed” (circa 1600), “perplexing question” (1650s), “toy” (1814).\u0026lt;ref\u0026gt;{{R:Online_Etymology_Dictionary}}\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Anything that is difficult to understand or make sense of\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Where he went after he left the house is a puzzle\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A game for one person that is more or less difficult to work out or complete\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A crossword puzzle\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A jigsaw puzzle\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"A riddle\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"Something made with marvellous skill; something of ingenious construction\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The state of being puzzled; perplexity\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"to be in a \u0027\u0027puzzle\", \"priority\":9}]}, \"synonyms\":{}}");

	add("puzzlefest", "{\"term\":\"puzzlefest\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|puzzle|fest|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A game, especially a text adventure, that mainly requires the player to solve puzzles\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }