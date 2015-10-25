package org.swtk.commons.dict.wiktionary.generated.p.a.v;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryPAV000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("pavé", "{\"term\":\"pavé\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027pavé\u0027 (pavement)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A paved surface, a pavement (now only in French contexts\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A setting of gemstones such that no metal is visible, especially when the stones are set very close together\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Any of various food items having a rectangular shape.Category:English terms spelled with pave\", \"priority\":3}]}, \"synonyms\":{}}");

	add("paver", "{\"term\":\"paver\", \"etymology\":{\"influencers\":[], \"languages\":[\"French\", \"old french (842-ca. 1400)\", \"Latin\"], \"text\":\"From Old french (842-ca. 1400) \u0026lt; *\u0027pavāre\u0027 \u0026lt; Latin \u0027pavīre\u0027 present active infinitive of \u0027paviō\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A flat stone used to pave a pathway, such as a walkway to one\u0027s home\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"red brick \u0027\u0027pavers\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"One who paves; one who lays pavement\", \"priority\":3}]}, \"synonyms\":{}}");

	add("pavilion", "{\"term\":\"pavilion\", \"etymology\":{\"influencers\":[{},{}], \"languages\":[\"English\", \"middle english (1100-1500)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Middle english (1100-1500) \u0027pavilloun\u0027 from Anglo-norman \u0027pavilloun\u0027 from Latin \u0027pāpiliōnem\u0027 form of \u0027pāpiliō\u0027 (butterfly, moth) (due to resemblance of tent to a butterfly’s wings), of unknown origin.\u0026lt;ref\u0026gt;{{R:Online Etymology Dictionary}}\u0026lt;/ref\u0026gt;Cognate to French \u0027pavillon\u0027 (pavilion) and \u0027papillon\u0027 (butterfly) and similar terms in other Romance languages.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"an ornate ten\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a light roofed structure used as a shelter in a public plac\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"a structure, sometimes temporary, erected to house exhibits at a fair, et\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"the building where the players change clothes, wait to bat, and eat their meal\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"a detached or semi-detached building at a hospital or other building comple\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"the lower surface of a brilliant-cut gemstone, lying between the girdle and colle\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"the cartiliginous part of the outer ear; auricl\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"The fimbriated extremity of the Fallopian tube\", \"priority\":8},{\"upperType\":\"NOUN\", \"text\":\"A flag, ensign, or banner\", \"priority\":9},{\"upperType\":\"NOUN\", \"text\":\"A tent used as a bearing\", \"priority\":10},{\"upperType\":\"NOUN\", \"text\":\"A covering; a canopy; figuratively, the sky\", \"priority\":11},{\"upperType\":\"NOUN\", \"text\":\"Shelle\", \"priority\":12},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027pavilion\u0027\u0027 of heaven is bare\", \"priority\":13}]}, \"synonyms\":{}}");

	add("pavonine", "{\"term\":\"pavonine\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027pāvōnīnus\u0027 from \u0027pāvō\u0027 (peacock)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Tarnish found on some ores and metals which resembles the tail feathers of a peacock\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Any bird from the sub-family \u0027Pavoninæ\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }