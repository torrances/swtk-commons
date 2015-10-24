package org.swtk.commons.dict.wiktionary.generated.p.u.d;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPUD000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("puddle", "{\"term\":\"puddle\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\", \"middle english (1100-1500)\"], \"text\":\"Middle english (1100-1500) \u0027podel\u0027, diminutive of Old english (ca. 450-1100) \u0027pudd\u0027 \u0027ditch\u0027, from Proto-germanic *\u0027puddo\u0027 (compare Low German \u0027Pudel\u0027 \u0027puddle\u0027).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A small pool of water, usually on a path or road\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Stagnant or polluted water\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1596\u0027\u0027, \u0027The Faerie Queene\u0027, IV.5\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"And fast beside a little brooke did pas / Of muddie water, that like \u0027\u0027puddle\u0027\u0027 stank […\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1624\u0027\u0027, \u0027Generall Historie\u0027, in Kupperman 1988, p. 90\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"searching their habitations for water, we could fill but three barricoes, and that such \u0027\u0027puddle\u0027\u0027, that never till then we ever knew the want of good water\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A homogeneous mixture of clay, water, and sometimes grit, used to line a canal or pond to make it watertight\", \"priority\":7}]}, \"synonyms\":{}}");

	add("pudendum", "{\"term\":\"pudendum\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027pudenda\u0027 (that where of one ought to feel shame) substantive use of the neuter plural gerundive of \u0027pudet\u0027 (it shames) in Latin the usage in the plural form (to mean external genitalia), was far more common than the singular form, as is also the case in English.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An external genital organ in a human; especially a woman’s vulva\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A shameful part of something\", \"priority\":2}]}, \"synonyms\":{}}");

	add("pudge", "{\"term\":\"pudge\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"something short and fat\", \"priority\":1}]}, \"synonyms\":{}}");

	add("pudor", "{\"term\":\"pudor\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027pudor\u0027 (sense of modesty or shame) from \u0027pudet\u0027 (it shames) as is pudency (via \u0027pudentia\u0027).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An appropriate sense of modesty or shame\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1922\u0027\u0027: Woman, undoing with sweet pudor her belt of rushrope, offers her allmoist yoni to man’s lingam. — James Joyce, \u0027Ulysses\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }