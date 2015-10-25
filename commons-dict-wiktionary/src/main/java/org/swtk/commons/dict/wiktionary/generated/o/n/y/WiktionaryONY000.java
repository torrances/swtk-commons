package org.swtk.commons.dict.wiktionary.generated.o.n.y;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryONY000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("onyx", "{\"term\":\"onyx\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"ancient greek (to 1453)\", \"Latin\"], \"text\":\"Before 1300 as \u0027onix\u0027, in about 1250 as \u0027oneche\u0027, from Old french (842-ca. 1400) \u0027oniche\u0027 or \u0027onix\u0027 from Latin \u0027onyx\u0027 from Ancient greek (to 1453) ὄνυξ {{qualifier|onyx}}.\u0026lt;ref\u0026gt;\u0027Chambers Dictionary of Etymology\u0027, Robert K. Barnhart (ed.), Chambers, 1988\u0026lt;/ref\u0026gt;\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A banded variety of chalcedony, a cryptocrystalline form of quartz\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A jet-black color, named after the gemstone\", \"priority\":2}]}, \"synonyms\":{}}");

	add("onycha", "{\"term\":\"onycha\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An ingredient of the Mosaic incense, probably the operculum of some kind of strombus\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"And the Lord said to Moses: Take unto thee spices, stacte, and \u0027\u0027onycha\u0027\u0027, galbanum of sweet savour, and the clearest frankincense, all shall be of equal weight.\u0027 Exodus 30:34, Douay-Rheims-Challoner translatio\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The precious stone onyx\", \"priority\":3}]}, \"synonyms\":{}}");

	add("onychinus", "{\"term\":\"onychinus\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"Latin\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"John Fox\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a certain vessel finely and subtilly made of the precious stone \u0027\u0027onychinus\", \"priority\":2}]}, \"synonyms\":{}}");

	add("onychogryphosis", "{\"term\":\"onychogryphosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|onycho|gryphosis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A hypertrophy or excess growth of the nails\", \"priority\":1}]}, \"synonyms\":{}}");

	add("onychomycosis", "{\"term\":\"onychomycosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|onycho|mycosis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Fungal infection of the nail, especially the toenail\", \"priority\":1}]}, \"synonyms\":{}}");

	add("onychophagist", "{\"term\":\"onychophagist\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) {{lang|grc|ὀνυχο-}} (onuch), combining form of \u0027lang\u003dgrc|ὄνυξ\u0027 () + \u0027lang\u003dgrc|-φαγος\u0027 () from \u0027lang\u003dgrc|ἐφαγόν\u0027 ()\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A person who bites his or her fingernails\", \"priority\":1}]}, \"synonyms\":{}}");

	add("onychorrhexis", "{\"term\":\"onychorrhexis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|onycho|rrhexis|lang\u003den}}{{wikipedia|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"fingernail and toenail brittleness and breakage, such as may be due to excessive strong soap and water exposure, nail polish remover, hypothyroidism, anemia, anorexia nervosa or bulimia, or after oral retinoid therapy\", \"priority\":1}]}, \"synonyms\":{}}");

	add("onychosis", "{\"term\":\"onychosis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|onycho|osis|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any disease or disorder of the fingernails or toenails\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }