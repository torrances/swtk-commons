package org.swtk.commons.dict.wiktionary.generated.r.a.r;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRAR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("rareness", "{\"term\":\"rareness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|rare|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The property of being rare; rarit\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"We discussed the \u0027\u0027rareness\u0027\u0027 of the coin and decided it was actually pretty common\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The patron sent back the steak because he objected to its \u0027\u0027rareness\", \"priority\":3}]}, \"synonyms\":{}}");

	add("rarity", "{\"term\":\"rarity\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027rarité\u0027 from Latin {{m|la|rāritās}}; compare French \u0027rareté\u0027. See also \u0027rare\u0027.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A measure of the scarcity of an object\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Thinness; the property of having low densit\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"year\u003d1927|passage\u003dOnly the increasing \u0027\u0027rarity\u0027\u0027 bothered him, and he thought that perhaps it was this which had turned the heads of other travellers and excited those absurd tales of night-gaunts whereby they explained the loss of such climbers as fell from these perilous paths\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A rare object\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"passage\u003dPlant breeding is always a numbers game.In addition, we are looking for rare alleles, so the more plants we try, the better. These \u0027\u0027rarities\u0027\u0027 may be new mutations, or they can be existing ones that are neutral—or are even selected against—in a wild population. A good example is mutations that disrupt seed dispersal, leaving the seeds on the heads long after they are ripe\", \"priority\":5}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }